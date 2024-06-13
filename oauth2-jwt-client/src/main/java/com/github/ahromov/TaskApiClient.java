package com.github.ahromov;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="${task.name}", url="${task.url}")
public interface TaskApiClient {

    @GetMapping("/api/hello")
    String getHello();
}

