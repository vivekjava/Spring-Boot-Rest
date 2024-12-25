package com.vivek.service.consumers;

import com.vivek.service.domain.CCReports;
import com.vivek.service.repository.CCReportsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class SalesReportConsumer {
    CCReportsRepository ccReportsRepository;
    SalesReportConsumer(CCReportsRepository ccReportsRepository){
        this.ccReportsRepository = ccReportsRepository ;
    }

    @KafkaListener(topics = "credit-card-service", groupId = "group1")
    public void listener(@Payload String data,
                  @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
                  @Header(KafkaHeaders.OFFSET) int offset) {
        log.info("Received message [{}] from group1, partition-{} with offset-{}",
                data,
                partition,
                offset);
        CCReports ccReports = new CCReports();
        ccReports.setId(UUID.randomUUID().toString());
        ccReports.setTransactionId(UUID.randomUUID().toString());
        ccReportsRepository.save(ccReports);
    }
}
