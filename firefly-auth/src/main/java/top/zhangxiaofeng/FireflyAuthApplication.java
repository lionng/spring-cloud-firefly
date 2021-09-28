package top.zhangxiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangxiaofeng
 * @Date 2021/9/27
 *
 * 用户认证服务器
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FireflyAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(FireflyAuthApplication.class, args);
    }
}
