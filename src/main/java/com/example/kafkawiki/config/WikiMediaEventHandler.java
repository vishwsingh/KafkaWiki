package com.example.kafkawiki.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.beans.EventHandler;

public class WikiMediaEventHandler implements EventHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(WikiMediaChangesProducer.class);
    KafkaTemplate kafkaTemplate;

    String topic;

    public WikiMediaEventHandler(KafkaTemplate kafkaTemplate, String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }


}
