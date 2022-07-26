package com.laoz.mq.common.config;


import com.laoz.mq.common.constant.MqConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: laoz
 * @Time: 2022/7/20  16:31
 * @description: rabbitmq
 */

@Slf4j
@Configuration
public class RabbitConfig {


    @Bean
    public AmqpAdmin amqpAdmin(CachingConnectionFactory cachingConnectionFactory){
        AmqpAdmin amqpAdmin = new RabbitAdmin(cachingConnectionFactory);
        amqpAdmin.declareQueue(directQueue());
        amqpAdmin.declareExchange(directExchange());
        amqpAdmin.declareBinding(bindingDirect());

        amqpAdmin.declareQueue(fanoutQueueA());
        amqpAdmin.declareQueue(fanoutQueueB());
        amqpAdmin.declareExchange(fanoutExchange());
        amqpAdmin.declareBinding(bindingFanoutA());
        amqpAdmin.declareBinding(bindingFanoutB());
        amqpAdmin.declareExchange(deadExchange());
        amqpAdmin.declareQueue(deadQueue());
        amqpAdmin.declareBinding(bindingDeadExchange());
        return amqpAdmin;
    }
    /**
     * 定义交换机
     **/
    @Bean
    public FanoutExchange fanoutExchange(){
        log.info("fanoutExchange created.");
        /**
         * 交换机名称
         * 持久性标志：是否持久化,默认是 true 即声明一个持久的 exchange,该exchange将在服务器重启后继续运行
         * 自动删除标志：是否自动删除，默认为 false, 如果服务器想在 exchange不再使用时删除它，则设置为 true
         **/
        return new FanoutExchange(MqConstants.FANOUT_EXCHANGE, true, false);
    }

    /**
     * 定义队列
     **/
    @Bean
    public Queue fanoutQueueA(){
        /**
         * name：队列名称
         * durable：是否持久化,默认是 true,持久化队列，会被存储在磁盘上，当消息代理重启时仍然存在
         * exclusive：是否排他，默认为 false，true则表示声明了一个排他队列（该队列将仅由声明者连接使用），如果连接关闭，则队列被删除。此参考优先级高于durable
         * autoDelete：是否自动删除， 默认是 false，true则表示当队列不再使用时，服务器删除该队列
         **/
        return new Queue(MqConstants.FANOUT_QUEUE_A,true);
    }

    /**
     * 定义队列
     **/
    @Bean
    public Queue fanoutQueueB(){
        /**
         * name：队列名称
         * durable：是否持久化,默认是 true,持久化队列，会被存储在磁盘上，当消息代理重启时仍然存在
         * exclusive：是否排他，默认为 false，true则表示声明了一个排他队列（该队列将仅由声明者连接使用），如果连接关闭，则队列被删除。此参考优先级高于durable
         * autoDelete：是否自动删除， 默认是 false，true则表示当队列不再使用时，服务器删除该队列
         **/
        return new Queue(MqConstants.FANOUT_QUEUE_B,true);
    }

    /**
     * 队列和交换机绑定
     * 设置路由键：directRouting
     **/
    @Bean
    Binding bindingFanoutA(){
        return BindingBuilder.bind(fanoutQueueA())
                .to(fanoutExchange());
    }

    /**
     * 队列和交换机绑定
     * 设置路由键：directRouting
     **/
    @Bean
    Binding bindingFanoutB(){
        return BindingBuilder.bind(fanoutQueueB())
                .to(fanoutExchange());
    }

    /**
     * 定义交换机
     **/
    @Bean
    public DirectExchange directExchange(){
        log.info("directExchange created.");
        /**
         * 交换机名称
         * 持久性标志：是否持久化,默认是 true 即声明一个持久的 exchange,该exchange将在服务器重启后继续运行
         * 自动删除标志：是否自动删除，默认为 false, 如果服务器想在 exchange不再使用时删除它，则设置为 true
         **/
        return new DirectExchange(MqConstants.DIRECT_EXCHANGE, true, false);
    }

    /**
     * 定义队列
     **/
    @Bean
    public Queue directQueue(){

        Map<String, Object> args = new HashMap<>(2);
        args.put(MqConstants.DEAD_LETTER_EXCHANGE_KEY, MqConstants.DEAD_EXCHANGE_NAME);
        args.put(MqConstants.DEAD_LETTER_ROUTING_KEY, MqConstants.DEAD_ROUTING_KEY);
        /**
         * name：队列名称
         * durable：是否持久化,默认是 true,持久化队列，会被存储在磁盘上，当消息代理重启时仍然存在
         * exclusive：是否排他，默认为 false，true则表示声明了一个排他队列（该队列将仅由声明者连接使用），如果连接关闭，则队列被删除。此参考优先级高于durable
         * autoDelete：是否自动删除， 默认是 false，true则表示当队列不再使用时，服务器删除该队列
         **/
        return new Queue(MqConstants.DIRECT_QUEUE,true,false, false, args);
    }

    /**
     * 队列和交换机绑定
     * 设置路由键：directRouting
     **/
    @Bean
    Binding bindingDirect(){
        return BindingBuilder.bind(directQueue())
                .to(directExchange())
                .with(MqConstants.ROUTINGKEY);
    }



    /**
     * 配置死信队列
     *
     * @return
     */
    @Bean
    public Queue deadQueue() {
        // 将普通队列绑定到死信队列交换机上
        Queue queue = new Queue(MqConstants.DEAD_QUEUE_NAME, true);
        return queue;
    }

    @Bean
    public DirectExchange deadExchange() {
        return new DirectExchange(MqConstants.DEAD_EXCHANGE_NAME);
    }

    @Bean
    public Binding bindingDeadExchange() {
        return BindingBuilder.bind(deadQueue()).to(deadExchange()).with(MqConstants.DEAD_ROUTING_KEY);
    }

    @Bean
    public Jackson2JsonMessageConverter producerJackson2MessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

}