package com.burt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author burt created on 2021/12/8
 * @version $Id$
 */
@SpringBootApplication(scanBasePackages = {"com.burt"})
@MapperScan(basePackages = "com.burt.dao")
public class UserApplication {

    public static void main(String args[]){
        SpringApplication.run(UserApplication.class, args);
    }

}
