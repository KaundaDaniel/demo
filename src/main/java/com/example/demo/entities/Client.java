package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.net.InetAddress;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private Long id ;
    private String timeStamp;
    private String hash ;
    private InetAddress address;

}
