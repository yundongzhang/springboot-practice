package com.isyundong.httpexchange.config;

import com.isyundong.httpexchange.exchange.SimpleExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebConfig {

    @Bean
    WebClient webClient() {
        return WebClient.builder()
                .baseUrl("http://127.0.0.1:9090")
                .build();
    }

    @Bean
    SimpleExchange postClient(WebClient webClient) {
        HttpServiceProxyFactory httpServiceProxyFactory =
                HttpServiceProxyFactory.builder(WebClientAdapter
                        .forClient(webClient))
                        .build();
        return httpServiceProxyFactory.createClient(SimpleExchange.class);
    }
}