package top.zhangxiaofeng.service;

import top.zhangxiaofeng.entity.User;

/**
 * @author zhangxiaofeng
 * @Date 2021/9/27
 */
public interface UserService {

    /**
     * 创建用户
     * @param user
     */
    void create(User user);
}
