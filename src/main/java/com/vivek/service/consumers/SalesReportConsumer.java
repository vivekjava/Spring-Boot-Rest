package com.vivek.service.consumers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vivek.service.anticorruption.mapper.CreditCardMapper;
import com.vivek.service.anticorruption.model.CreditCardMessage;
import com.vivek.service.domain.CCReports;
import com.vivek.service.repository.CCReportsRepository;
import com.vivek.service.services.mapper.CCReportsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SalesReportConsumer {
    CCReportsRepository ccReportsRepository;
    ObjectMapper objectMapper;
    CreditCardMapper creditCardMapper;
    CCReportsMapper ccReportsMapper;
    SalesReportConsumer(CCReportsRepository ccReportsRepository,ObjectMapper objectMapper,
                        CreditCardMapper creditCardMapper,CCReportsMapper ccReportsMapper){
        this.ccReportsRepository = ccReportsRepository ;
        this.objectMapper = objectMapper;
        this.creditCardMapper = creditCardMapper;
        this.ccReportsMapper = ccReportsMapper;
    }

    @KafkaListener(topics = "credit-card-service", groupId = "group1")
    public void listener(@Payload String data,
                  @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
                  @Header(KafkaHeaders.OFFSET) int offset) throws JsonProcessingException {
        log.info("Received message [{}] from group1, partition-{} with offset-{}",
                data,
                partition,
                offset);
        CreditCardMessage message = objectMapper.readValue(data, CreditCardMessage.class);
        CCReports ccReports = ccReportsMapper.toEntity(creditCardMapper.mapResponse(message));
        ccReportsRepository.save(ccReports);
    }
}
