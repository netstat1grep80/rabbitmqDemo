package com.laoz.jpa.service.impl;

import com.laoz.jpa.domain.User;
import com.laoz.jpa.repository.UserRepository;
import com.laoz.jpa.service.UserService;
import com.laoz.common.domain.R;
import com.laoz.common.exception.ServiceException;
import com.laoz.jpa.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author: laoz
 * @Time: 2022/7/29  17:11
 * @description:
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {


    @Resource
    private UserRepository userRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long add(User user){
        userRepository.save(user);
        return user.getId();
    }

    @Override
    public User getUser(String name){
       return userRepository.findByName(name).get();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public R updateId(User user) {
            Optional<User> p = userRepository.findById(user.getId());
            if (p.isPresent()) {
                try {
                    userRepository.save(user);
                    return R.ok(user);
                }catch (Exception e){
                    log.error(e.getMessage());
                    throw new ServiceException("更新数据失败",500);
                }

            } else {
                log.error("未能找到用户id" + user.getAge());
                throw new ServiceException("miss data" ,403);
            }
    }

    @Override
    public Page<User> findAll(UserVO userVo){
        User user = new User();
        BeanUtils.copyProperties(user,userVo);

        //对name字段进行模糊查询
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name", math->math.contains());

        Example<User> ex = Example.of(user,matcher);
        Sort sort = Sort.by(Sort.Direction.DESC,"id");

        Pageable pageable = PageRequest.of(userVo.getCurrent(), userVo.getSize(), sort);
        return userRepository.findAll(ex,pageable);
    }
}
