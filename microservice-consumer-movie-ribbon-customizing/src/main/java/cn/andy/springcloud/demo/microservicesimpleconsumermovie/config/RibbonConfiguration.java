package cn.andy.springcloud.demo.microservicesimpleconsumermovie.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhuwei
 * @Date:2019/2/15 17:08
 * @Description: 该类为Ribbon的配置类
 * 注意：该类不应该在主应用程序上下文的@ComponentScan所扫描的包中。
 */
@Configuration
public class RibbonConfiguration {

    /**
     * Ribbon的默认配置格式为BeanType beanName:ClassName
     * 以下配置中BeanType是IRule
     * beanName是ribbonRule
     * className是RandomRule
     * 在Spring Cloud中，Ribbon默认的配置类是RibbonClientConfiguration.
     * 自定义配置会覆盖默认配置
     * @return
     */
    @Bean
    public IRule ribbonRule() {
        //负载均衡规则，改为随机
        return new RandomRule();
    }

}
