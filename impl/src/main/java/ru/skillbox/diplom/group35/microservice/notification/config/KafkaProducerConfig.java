package ru.skillbox.diplom.group35.microservice.notification.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
import ru.skillbox.diplom.group35.library.core.dto.streaming.EventNotificationDto;
import ru.skillbox.diplom.group35.library.core.dto.streaming.StreamingMessageDto;


import java.util.HashMap;
import java.util.Map;

/**
 * KafkaProducerConfig
 *
 * @Author Tretyakov Alexandr
 */

@Configuration
public class KafkaProducerConfig {
    @Value("${spring.kafka.bootstrap-servers}")
    private String kafkaServer;

    @Bean
    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaServer);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return props;
    }

    @Bean
    public ProducerFactory<String, StreamingMessageDto<EventNotificationDto>> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, StreamingMessageDto<EventNotificationDto>> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
}
