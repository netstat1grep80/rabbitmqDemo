package com.laoz.mq.consumer.service;

import com.laoz.common.constant.MqConstants;
import com.laoz.common.domain.UserDTO;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author: laoz
 * @Time: 2022/7/20  16:26
 * @description: consumer
 */


@Slf4j
@Component("RabbitConsumerService")
public class RabbitConsumerService {
/*
    @RabbitHandler
    public void process(String msg) {
        System.out.println("result:"+msg);
    }

 */
    @RabbitListener(queues = MqConstants.DIRECT_QUEUE)
    public void directListener(UserDTO user, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) throws IOException {

        log.info("directQueue recive:" + user.toString());
        try {
            if(user.getDead() == true){
                throw new Exception("sth wrong.");
            }
            channel.basicAck(tag, false);
        }catch (Exception e){
            channel.basicNack(tag,false,false);
        }

    }

    @RabbitListener(queues = MqConstants.FANOUT_QUEUE_A)
    public void fanoutAListener(UserDTO user, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) throws IOException {

        log.info("fanoutQueueA recive:" + user.toString());
        try {

            channel.basicAck(tag, false);
        }catch (Exception e){
            channel.basicNack(tag,false,false);
        }

    }


    @RabbitListener(queues = MqConstants.FANOUT_QUEUE_B)
    public void fanoutBListener(UserDTO user, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) throws IOException {

        log.info("fanoutQueueB recive:" + user.toString());
        try {
            channel.basicAck(tag, false);
        }catch (Exception e){
            channel.basicNack(tag,false,false);
        }

    }

}
