package com.abhi.springMain.helper;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abhi.springMain.service.Otpservice;

import voldemort.client.StoreClient;
import voldemort.client.StoreClientFactory;
import voldemort.client.protocol.admin.AdminClient;
import voldemort.client.protocol.admin.BasicAdminClientFactory;

@Configuration
public class VoldemortConfig {

    @Bean
    public StoreClient<String, String> storeClient() {
        StoreClientFactory factory = new voldemort.client.SocketStoreClientFactory(
                new voldemort.client.ClientConfig().setBootstrapUrls("tcp://localhost:6666"));
        return factory.getStoreClient("otpStore");
    }

    @Bean
    public Otpservice otpService(StoreClient<String, String> storeClient) {
        return new Otpservice(storeClient);
    }
}
