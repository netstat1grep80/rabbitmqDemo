package com.laoz.jpa.test;

import com.laoz.jpa.RunJpaApplication;
import com.laoz.jpa.domain.User;
import com.laoz.jpa.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author: laoz
 * @Time: 2022/7/29  10:46
 * @description:
 */
@Slf4j
@SpringBootTest(classes = RunJpaApplication.class)
@RunWith(SpringRunner.class)
public class JpaTest {
    @Test
    public void myTest(){

    }
}
