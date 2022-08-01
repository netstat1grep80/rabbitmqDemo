package com.laoz.jpa.service;

import com.laoz.common.domain.R;
import com.laoz.jpa.domain.User;
import com.laoz.jpa.vo.UserVO;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author: laoz
 * @Time: 2022/7/29  15:37
 * @description:
 */
public interface UserService {
  R updateId(User user);
  Long add(User user);
  Page<User> findAll(UserVO user);
  User getUser(String name);
}
