package com.example.kafkawiki.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class WikiMediaChangesProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(WikiMediaChangesProducer.class);
    KafkaTemplate<String, String> kafkaTemplate;

    public WikiMediaChangesProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage() {
        String topic = "wikimedia_recentChange";
        //To read realtime stream data from wikimedia we use EventSource
    }
}
