package com.laoz.jpa.service.impl;

import com.laoz.jpa.domain.User;
import com.laoz.jpa.repository.UserRepository;
import com.laoz.jpa.service.UserService;
import com.laoz.mq.common.domain.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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
    public R updateId(Long id ,Integer age) throws Exception {

            Optional<User> p = userRepository.findById(id);
            if (p.isPresent()) {
                log.info("*******************************************************");
                log.info(p.get().toString());
                User u = p.get();
                u.setAge(age);
                userRepository.save(u);
                u.setAge(age+100);
                try {
                    userRepository.save(u);
                    p = userRepository.findById(id);
                    return R.ok(p.get());
                }catch (Exception e){
                    e.printStackTrace();
                    throw new Exception(e.getMessage());
                }
            } else {
                return R.fail("data not found");
            }
    }
}
