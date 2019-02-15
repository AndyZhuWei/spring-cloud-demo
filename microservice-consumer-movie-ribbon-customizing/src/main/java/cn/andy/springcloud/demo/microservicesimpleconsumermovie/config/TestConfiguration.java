package cn.andy.springcloud.demo.microservicesimpleconsumermovie.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhuwei
 * @Date:2019/2/15 17:19
 * @Description:
 * 使用RibbonClient,为特定name的Ribbon Client自定义配置
 * 使用@RibbonClient的configuration属性，指定Ribbon的配置类
 */
@Configuration
@RibbonClient(name="microservice-provider-user",configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
