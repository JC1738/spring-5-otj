package com.opentable.spring5otj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.opentable.server.OTApplication;
import com.opentable.server.RestHttpServer;
import com.opentable.service.ServiceInfo;
import com.opentable.service.discovery.client.EnableDiscoveryClient;

@Configuration
@RestHttpServer
@EnableDiscoveryClient
@Import(MyResource.class)
public class Main {
    public static void main(final String[] args) {
        OTApplication.run(Main.class, args);
    }

    @Bean
    public ServiceInfo serviceInfo() {
        return new ServiceInfo() {
            @Override
            public String getName() {
                return "spring-5-otj";
            }
        };
    }
}
