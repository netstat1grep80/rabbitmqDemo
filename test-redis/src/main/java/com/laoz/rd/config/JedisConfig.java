package com.laoz.rd.config;

/**
 * @author: laoz
 * @Time: 2022/7/28  14:34
 * @description:
 */
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Slf4j
@Configuration
public class JedisConfig {
    @NacosValue(value = "${spring.redis.host}", autoRefreshed = true)
    private String host;

    @NacosValue(value = "${spring.redis.port}", autoRefreshed = true)
    private int port;

    @NacosValue(value = "${spring.redis.timeout}", autoRefreshed = true)
    private int timeout;

    @NacosValue(value = "${spring.redis.jedis.pool.max-idle}", autoRefreshed = true)
    private int maxIdle;

    @NacosValue(value = "${spring.redis.jedis.pool.max-wait}", autoRefreshed = true)
    private long maxWaitMillis;

    @NacosValue(value = "${spring.redis.password}", autoRefreshed = true)
    private String password;

    @NacosValue(value = "${spring.redis.database}", autoRefreshed = true)
    private int database;

    @Bean
    public JedisPool jedisPool() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
//        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        log.info("jedis init success.");
        if(StringUtils.isNotEmpty(password)) {
            return new JedisPool(jedisPoolConfig, host, port, timeout, password, database);
        }else{
            return new JedisPool(jedisPoolConfig,host,port,timeout,null,database);
        }
    }
}