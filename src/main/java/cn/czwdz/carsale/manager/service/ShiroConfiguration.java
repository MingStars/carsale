package cn.czwdz.carsale.manager.service;


import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfiguration {
    //将自己的验证方式加入容器
    @Bean
    public GloabRealm myShiroRealm() {
        GloabRealm gloabRealm = new GloabRealm();
        return gloabRealm;
    }

    //权限管理，配置主要是Realm的管理认证
    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String,String> map = new HashMap<String, String>();
        //登出
        map.put("/logout","logout");
        map.put("/**","anon");
        //静态资源认证
        map.put("/static/**","anon");
        map.put("/ajax/**","anon");
        map.put("/app/**","anon");
        map.put("/assets/**","anon");
        map.put("/bootstrap-3.3.7-dist/**","anon");
        map.put("/css/**","anon");
        map.put("/data/**","anon");
        map.put("/example/**","anon");
        map.put("/font/**","anon");
        map.put("/font-awesome/**","anon");
        map.put("/fonts/**","anon");
        map.put("/images/**","anon");
        map.put("/img/**","anon");
        map.put("/js/**","anon");
        map.put("/vendor/**","anon");
        //登陆界面认证
        map.put("/getBuyCar","anon");
        map.put("/login/**","anon");
        map.put("/dongtong","anon");
        map.put("/page/login-multi.jsp*","anon");
        map.put("/home**","anon");
        map.put("/validatecode.jsp*","anon");

        //对所有用户认证

        //登录
        shiroFilterFactoryBean.setLoginUrl("/login/one");
        //首页
        shiroFilterFactoryBean.setSuccessUrl("/login/home");
        //错误页面，认证不通过跳转
        shiroFilterFactoryBean.setUnauthorizedUrl("/login/one");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);

        return shiroFilterFactoryBean;
    }

    //加入注解的使用，不加入这个注解不生效
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }


}
