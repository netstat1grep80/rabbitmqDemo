package com.laoz.test;

import com.laoz.rd.config.JedisConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

/**
 * @author: laoz
 * @Time: 2022/7/28  14:37
 * @description:
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {JedisConfig.class})
public class MyTest {

    @Autowired
    JedisPool jedisPool;

    @Test
    public void testRedis(){

        String key = "name";
        String value = "jack";
        Jedis jedis = null;
        String result = null;
        try {
            jedis = jedisPool.getResource();
//            result = jedis.set(key, value);
                    log.info(jedis.get(key));
        } catch (Exception e) {
            e.printStackTrace();
            log.error("redis连接池异常"+e.getMessage());
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }




    }
}
