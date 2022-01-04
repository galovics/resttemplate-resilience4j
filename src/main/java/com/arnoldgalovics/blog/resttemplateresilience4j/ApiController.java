package com.arnoldgalovics.blog.resttemplateresilience4j;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiController {
    private final ExternalApi externalApi;

    @GetMapping("/foo")
    public String foo() {
        return externalApi.callExternalApiFoo();
    }
}
