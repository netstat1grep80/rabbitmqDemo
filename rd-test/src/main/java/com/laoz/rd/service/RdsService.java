package com.laoz.rd.service;

/**
 * @author: laoz
 * @Time: 2022/7/28  14:36
 * @description:
 */


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

public class RdsService {
    private static final Logger log = LoggerFactory.getLogger(RdsService.class);

    @Resource
    private JedisPool jedisPool;
}
