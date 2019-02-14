package cn.andy.springcloud.demo.microservicesimpleprovideruser.dao;

import cn.andy.springcloud.demo.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhuwei
 * @Date:2019/2/14 10:15
 * @Description:
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
