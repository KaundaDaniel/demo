package com.example.demo.entities;

import lombok.*;

import java.net.InetAddress;
 @Builder
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
