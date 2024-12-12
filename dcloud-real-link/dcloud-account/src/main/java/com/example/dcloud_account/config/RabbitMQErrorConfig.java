package com.example.dcloud_account.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.retry.MessageRecoverer;
import org.springframework.amqp.rabbit.retry.RepublishMessageRecoverer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: RainbowJier
 * @Description: 👺🐉😎账号服务消费异常配置
 * @Date: 2024/11/12 17:27
 * @Version: 1.0
 */

@Data
@Configuration
@Slf4j
public class RabbitMQErrorConfig {

    private String trafficErrorExchange = "trffic.error.exchange";

    private String trafficErrorQueue = "trffic.error.queue";

    private String trafficErrorRoutingKey = "trffic.error.routing.key";

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Bean
    public TopicExchange errorTopicExchange() {
        return new TopicExchange(trafficErrorExchange, true, false);
    }

    @Bean
    public Queue errorQueue() {
        return new Queue(trafficErrorQueue, true);
    }

    @Bean
    public Binding bindingErrorQueueAndExchange(){
        return BindingBuilder
                .bind(errorQueue())
                .to(errorTopicExchange())
                .with(trafficErrorRoutingKey);
    }

    /**
     * 消息重转发器
     * 消费消息重试⼀定次数后，⽤特定的routingKey转发到指定的交换机中，⽅便后续排查和告警
     */
    @Bean
    public MessageRecoverer messageRecoverer() {
        return new RepublishMessageRecoverer(rabbitTemplate, trafficErrorExchange, trafficErrorRoutingKey);
    }
}