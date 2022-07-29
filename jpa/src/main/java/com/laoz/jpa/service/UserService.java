package com.laoz.jpa.service;

import com.laoz.jpa.domain.User;
import com.laoz.jpa.repository.UserRepository;
import com.laoz.mq.common.domain.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

/**
 * @author: laoz
 * @Time: 2022/7/29  15:37
 * @description:
 */
public interface UserService {
  R updateId(Long id , Integer age) throws Exception;
}
