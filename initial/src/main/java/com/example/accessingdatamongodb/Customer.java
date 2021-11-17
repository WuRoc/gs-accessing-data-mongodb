package com.example.accessingdatamongodb;

import org.springframework.data.annotation.Id;

/**
 * @ClassName Customer
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-11-15 17:18
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/

public class Customer {
    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Customer() {

    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id, firstName, lastName);
    }
}
