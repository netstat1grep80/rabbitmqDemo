package com.laoz.mq.producter.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.laoz.mq.common.constant.MqConstants;
import com.laoz.mq.common.domain.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: laoz
 * @Time: 2022/7/21  19:43
 * @description:
 */
@Slf4j
@Service
public class SendService{
    @Resource
    private RabbitTemplate rabbitTemplate;

    @Resource
    private RabbitReturnCallbackService rabbitReturnCallbackService;

    @Resource
    private  RabbitConfirmCallbackService rabbitConfirmCallbackService;

    public void run(String type , UserDTO user) throws JsonProcessingException {
        rabbitTemplate.setReturnsCallback(rabbitReturnCallbackService);
        rabbitTemplate.setConfirmCallback(rabbitConfirmCallbackService);
        if(type.equals("direct")) {
             rabbitTemplate.convertAndSend(MqConstants.DIRECT_EXCHANGE, MqConstants.ROUTINGKEY, user);
         }else if(type.equals("fanout")){
             rabbitTemplate.convertAndSend(MqConstants.FANOUT_EXCHANGE, MqConstants.ROUTINGKEY, user);
         }
//          else if(type.equals("topic")){
//             rabbitTemplate.convertAndSend(MqConstants.TOPIC_EXCHANGE, MqConstants.ROUTINGKEY, user);
//         }else if(type.equals("headers")){
//             rabbitTemplate.convertAndSend(MqConstants.HEADERS_EXCHANGE, MqConstants.ROUTINGKEY, user);
//         }
    }


}
