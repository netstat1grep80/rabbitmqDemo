package com.laoz.mq.producter.service;

import com.rabbitmq.client.Return;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ReturnedMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @author: laoz
 * @Time: 2022/7/26  16:05
 * @description:
 */
@Slf4j
@Component
public class RabbitReturnCallbackService implements RabbitTemplate.ReturnsCallback{

    /**
     * message route failed，callback
     * message (routingKey) recived exchange，与交换机的所有绑定键进行匹配，匹配不到触发回调
     */
    @Override
    public void returnedMessage(ReturnedMessage m) {
        log.error("returnedMessage ===> replyCode={} ,replyText={} ,exchange={} ,routingKey={}", m.getReplyCode(), m.getReplyText(), m.getExchange(), m.getRoutingKey());
    }
}
