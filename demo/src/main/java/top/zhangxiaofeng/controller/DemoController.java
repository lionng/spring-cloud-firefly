package top.zhangxiaofeng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxiaofeng
 * @Date 2021/9/29
 */
@RequestMapping("demo")
@RestController
public class DemoController {

    @GetMapping("index")
    public String demo() {
        return "demo index";
    }
}
