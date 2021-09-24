package top.zhangxiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhangxiaofeng
 * @Date 2021/9/24
 */
@SpringBootApplication
@EnableEurekaServer
public class FireflyRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(FireflyRegistryApplication.class, args);
    }
}
