package top.zhangxiaofeng.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import top.zhangxiaofeng.entity.User;
import top.zhangxiaofeng.repository.UserRepository;

import java.util.Optional;

/**
 * @author zhangxiaofeng
 * @Date 2021/9/27
 */
@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User user) {
        Optional<User> dbUser = userRepository.findByUsername(user.getUsername());
        dbUser.ifPresent(it -> {
            throw new IllegalArgumentException("user already exists: " + it.getUsername());
        });

        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);

        userRepository.save(user);

        logger.info("new user has been created: {}", user.getUsername());
    }
}
