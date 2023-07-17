package com.example.demo.service;

import com.example.demo.entities.Client;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.UUID;

@Service
public class ClientServe {


    public Client clientIp() throws UnknownHostException {
        return  Client.builder().address(InetAddress.getLocalHost()).timeStamp(new Date().toString()).hash(UUID.randomUUID().toString()).build();
    }
}
