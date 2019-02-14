package cn.andy.springcloud.demo.microservicesimpleprovideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 是一个组合注解，它整合了@Configuration、@EnableAutoConfiguration和@ComponentScan注解
 */
@SpringBootApplication
public class MicroserviceProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderUserApplication.class, args);
    }

}

