package top.zhangxiaofeng.repository;

import org.springframework.data.repository.CrudRepository;
import top.zhangxiaofeng.entity.User;

import java.util.Optional;

/**
 * @author zhangxiaofeng
 * @Date 2021/9/28
 */
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * 通过username查找
     * @param username
     * @return
     */
    Optional<User> findByUsername(String username);

}
