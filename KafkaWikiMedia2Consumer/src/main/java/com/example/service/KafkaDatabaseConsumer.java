package com.example.service;

import com.example.model.WikiMediaRecentChange;
import com.example.repository.WikiMediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
    @Autowired
    WikiMediaDataRepository wikiMediaDataRepository;

    @KafkaListener(topics = "wikimedia_recentChange", groupId = "group_id1")
    public void consumeData(String eventMessage) {
        LOGGER.info(String.format("Consumed Data -> %s", eventMessage));
        WikiMediaRecentChange wikiMediaRecentChange = new WikiMediaRecentChange();
        wikiMediaRecentChange.setWikieventdata(eventMessage);
        wikiMediaDataRepository.save(wikiMediaRecentChange);
    }
}
