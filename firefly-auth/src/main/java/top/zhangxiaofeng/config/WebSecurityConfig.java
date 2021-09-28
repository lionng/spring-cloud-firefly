package top.zhangxiaofeng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import top.zhangxiaofeng.service.security.MysqlUserDetailService;

/**
 * @author zhangxiaofeng
 * @Date 2021/9/27
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final MysqlUserDetailService mysqlUserDetailService;

    public WebSecurityConfig(MysqlUserDetailService mysqlUserDetailService) {
        this.mysqlUserDetailService = mysqlUserDetailService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests().anyRequest().authenticated()
                .and()
                .csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(mysqlUserDetailService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
