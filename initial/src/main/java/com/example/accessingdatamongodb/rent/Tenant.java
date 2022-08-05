package com.example.accessingdatamongodb.rent;

import com.example.accessingdatamongodb.Customer;
import lombok.Data;

/**
 * @ClassName Tenant
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-11-20 17:20
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
@Data
public class Tenant {

    public Customer customer;

    public Integer originalRent;

    public Integer finallyRent;

    public Double electricityBill;




}
