package com.techprimers.kafka.springbootkafkaproducerexample.config;

import com.techprimers.kafka.springbootkafkaproducerexample.model.KafkaBody;
import com.techprimers.kafka.springbootkafkaproducerexample.model.KafkaHB;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KakfaConfiguration {

    @Bean
    public ProducerFactory<String, KafkaBody> producerFactory1() {
        Map<String, Object> config1 = new HashMap<>();
        config1.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config1.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config1.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(config1);
    }

    @Bean
    public ProducerFactory<String, KafkaHB> producerFactory2() {
        Map<String, Object> config2 = new HashMap<>();
        config2.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config2.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config2.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(config2);
    }
    @Bean
    public KafkaTemplate<String, KafkaBody> kafkaTemplate1() {
        return new KafkaTemplate<>(producerFactory1());
    }

    @Bean
    public KafkaTemplate<String, KafkaHB> kafkaTemplate2() {
        return new KafkaTemplate<>(producerFactory2());
    }


}
