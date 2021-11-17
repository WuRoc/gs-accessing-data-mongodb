package com.example.accessingdatamongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @InterfaceName CustomerRepository
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-11-16 10:08
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);

    public void deleteCustomerByFirstNameAndLastName(String firstName, String lastName);
}
