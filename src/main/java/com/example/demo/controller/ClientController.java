package com.example.demo.controller;

import com.example.demo.entities.Client;
import com.example.demo.service.ClientServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
@RequestMapping("/")
public class ClientController {
    @Autowired
    private ClientServe clientServie;

    @GetMapping
    public ResponseEntity<Client> mostra() throws UnknownHostException {
        return ResponseEntity.status(HttpStatus.OK).body(clientServie.clientIp());
    }

}
