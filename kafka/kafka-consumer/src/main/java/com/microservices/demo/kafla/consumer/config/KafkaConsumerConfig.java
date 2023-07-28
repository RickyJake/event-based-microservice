package com.microservices.demo.kafla.consumer.config;

import com.microservices.config.KafkaConfigData;
import com.microservices.config.KafkaConsumerConfigData;
import org.apache.avro.specific.SpecificRecordBase;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

import java.io.Serializable;

@EnableKafka
@Configuration
public class KafkaConsumerConfig<K extends Serializable, V extends SpecificRecordBase> {
    private final KafkaConfigData kafkaConfigData;
    private final KafkaConsumerConfigData kafkaConsumerConfigData;

    public KafkaConsumerConfig(KafkaConfigData kafkaConfigData, KafkaConsumerConfigData kafkaConsumerConfigData) {
        this.kafkaConfigData = kafkaConfigData;
        this.kafkaConsumerConfigData = kafkaConsumerConfigData;
    }
}
