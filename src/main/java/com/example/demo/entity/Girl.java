package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl")
public class Girl {
    private String name;
    private String cupSize;
    private int age;

    public String getName(){
        return name;
    }


    public void setName(String name){
        this.name = name;
    }


    public String getCupSize(){
        return cupSize;
    }


    public void setCupSize(String cupSize){
        this.cupSize = cupSize;
    }
}
