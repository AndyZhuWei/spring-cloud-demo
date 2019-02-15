package cn.andy.springcloud.demo.microservicesimpleconsumermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroserviceConsumerMovieWithoutEurekaApplication {

    /**
     * @Bean 是一个注解方法，作用是实例化一个Bean并使用该方法的名称命名
     * @LoadBalanced 使其具备负载均衡的能力
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerMovieWithoutEurekaApplication.class, args);
    }

}

