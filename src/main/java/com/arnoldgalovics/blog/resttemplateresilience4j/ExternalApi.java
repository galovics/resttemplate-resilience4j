package com.arnoldgalovics.blog.resttemplateresilience4j;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class ExternalApi {
    private final RestTemplate restTemplate;

    @CircuitBreaker(name = "externalServiceFoo")
    public String callExternalApiFoo() {
        return restTemplate.getForObject("/external-foo", String.class);
    }
}
