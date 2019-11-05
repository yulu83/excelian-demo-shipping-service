package com.excelian.demo.shippingservice.config;

import com.excelian.demo.common.data.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {

    @KafkaListener(topics = "order",
            containerFactory = "orderListenerContainerFactory")
    public void listen(Order order) {
       log.info("Receiving order: {}", order);
    }
}
