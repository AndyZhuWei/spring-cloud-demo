package cn.andy.springcloud.demo.microservicesimpleprovideruser.controller;

import cn.andy.springcloud.demo.microservicesimpleprovideruser.dao.UserRepository;
import cn.andy.springcloud.demo.microservicesimpleprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhuwei
 * @Date:2019/2/14 10:16
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * @GetMapping是spring 4.3提供的一个新注解，是一个组合注解，等价于@RequestMapping(method=RequestMethod.GET),
     * 同理还有@PostMapping等
     */
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRepository.findOne(id);
        return findOne;
    }
}
