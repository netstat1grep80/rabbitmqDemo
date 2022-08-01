package com.laoz.mq.consumer.service;


import com.alibaba.fastjson.JSONObject;
import com.laoz.common.constant.MqConstants;
import com.laoz.common.domain.UserDTO;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author: laoz
 * @Time: 2022/7/25  14:54
 * @description:
 */
@Component
public class DeadConsumerService {
    @RabbitListener(queues = MqConstants.DEAD_QUEUE_NAME)
    public void process(Message message, @Headers Map<String, Object> headers, Channel channel) throws Exception {
        String messageId = message.getMessageProperties().getMessageId();
        String msg = new String(message.getBody(), "UTF-8");

        UserDTO user = JSONObject.parseObject(msg,UserDTO.class);
        System.out.println("dead queue msg : " + user.toString());
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }

}