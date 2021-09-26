package top.zhangxiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangxiaofeng
 * @Date 2021/9/26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FireflyGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FireflyGatewayApplication.class, args);
    }
}
