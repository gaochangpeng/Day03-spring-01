package com.peng.spring.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;

//@Data   // 使用注解：该注解是提供一些 getter setter 等方法，就不用自己手动getter setter等方法
public class User {
    private String username;
    private String password;
    private Address address;
    private List<Integer> list;
    private Map<String,String> map;

    // 初始化方法是构造方法执行完成之后，自动执行的第一个方法
    public void init(){
        this.username = "hello";
        System.out.println("init");
    }

    // 这个方法就是在执行close时才会被调用
    public void destroy(){
        this.username = null;
        System.out.println("方法即将被回收");
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
