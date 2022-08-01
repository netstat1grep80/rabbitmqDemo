package com.laoz.common.constant;

/**
 * @author: laoz
 * @Time: 2022/7/20  19:08
 * @description: contants
 */
public class MqConstants {
    public final static String DIRECT_QUEUE = "directQueue";
    public final static String ROUTINGKEY = "routingKey";

    public final static String FANOUT_QUEUE_A = "fanoutQueueA";
    public final static String FANOUT_QUEUE_B = "fanoutQueueB";

    public final static String DEAD_QUEUE_NAME = "deadQueue";
    public final static String DEAD_ROUTING_KEY = "deadRoutingKey";

    public final static String FANOUT_EXCHANGE = "fanoutExchange";
    public final static String DIRECT_EXCHANGE = "directExchange";
    public final static String TOPIC_EXCHANGE = "topicExchange";
    public final static String HEADERS_EXCHANGE = "headersExchange";
    public final static String DEAD_EXCHANGE_NAME = "deadExchange";



    /**
     * 死信队列 交换机标识符
     */
    public static final String DEAD_LETTER_EXCHANGE_KEY = "x-dead-letter-exchange";
    /**
     * 死信队列交换机绑定键标识符
     */
    public static final String DEAD_LETTER_ROUTING_KEY = "x-dead-letter-routing-key";
}
