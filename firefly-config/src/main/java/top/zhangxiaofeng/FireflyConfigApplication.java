package top.zhangxiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zhangxiaofeng
 * @Date 2021/9/24
 */
@SpringBootApplication
@EnableConfigServer
public class FireflyConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(FireflyConfigApplication.class, args);
    }
}
