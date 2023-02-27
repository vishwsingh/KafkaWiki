package com.example.kafkawiki.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public static NewTopic newTopic() {
        return TopicBuilder.name("wikimedia_recentChange")
                .build();
    }

}
