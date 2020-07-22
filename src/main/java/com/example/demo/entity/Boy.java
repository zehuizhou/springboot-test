package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Boy {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String sex;

    public Boy(){

    }


    public Integer getId(){
        return id;
    }


    public void setId(Integer id){
        this.id = id;
    }


    public String getName(){
        return name;
    }


    public void setName(String name){
        this.name = name;
    }


    public String getSex(){
        return sex;
    }


    public void setSex(String sex){
        this.sex = sex;
    }
}
