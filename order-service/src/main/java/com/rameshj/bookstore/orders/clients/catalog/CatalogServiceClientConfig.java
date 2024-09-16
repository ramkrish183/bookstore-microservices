package com.rameshj.bookstore.orders.clients.catalog;
import java.time.Duration;

import com.rameshj.bookstore.orders.ApplicationProperties;
import org.springframework.boot.web.client.ClientHttpRequestFactories;
import org.springframework.boot.web.client.ClientHttpRequestFactorySettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
@Configuration
class CatalogServiceClientConfig {
    @Bean
    RestClient restClient(RestClient.Builder builder, ApplicationProperties properties) {
        return builder.baseUrl(properties.catalogServiceUrl())
                .requestFactory(ClientHttpRequestFactories.get(ClientHttpRequestFactorySettings.DEFAULTS
                        .withConnectTimeout(Duration.ofSeconds(5))
                        .withReadTimeout(Duration.ofSeconds(5))))
                .build();
    }
}