package cn.andy.springcloud.demo.microservicesimpleconsumermovie.controller;

import cn.andy.springcloud.demo.microservicesimpleconsumermovie.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhuwei
 * @Date:2019/2/14 10:49
 * @Description:
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:8000/"+id,User.class);
    }
}
