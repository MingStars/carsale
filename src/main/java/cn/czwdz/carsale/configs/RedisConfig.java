package cn.czwdz.carsale.configs;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;



/**
 * Created by Administrator on 2018/12/10.
 * 配置信息类
 */

@Configuration
@EnableCaching   //自动开启缓存
public class RedisConfig extends CachingConfigurerSupport {

    /**
     * 缓存管理类
     * @param redisConnectionFactory
     * @return
     */
    @Bean
    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory){
        RedisCacheManager redisCacheManager=RedisCacheManager.create(redisConnectionFactory);
        //设置缓存过期时间
        return redisCacheManager;

    }


    /**
     * 创建一个redisTemplate对象
     * 使用JDK下的序列化方案
     * 主要处理：复杂格式类型的数据
     * @return
     *
     * <bean id="redisTemplate class="org.springframework.data.redis.core.RedisTemplate">
     *      <property name="connectionFactory" ref="redisConnectionFactory"></property>
     * </bean>
     *
     */
    @Bean
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        //实例化redisTemplate对象
        RedisTemplate<String,Object> redisTemplate=new RedisTemplate<String,Object>();
        //给连接对象赋值
        redisTemplate.setConnectionFactory(redisConnectionFactory);

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
// add this
        redisTemplate.afterPropertiesSet();



  /*      //使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值（默认使用JDK的序列化方式）
        Jackson2JsonRedisSerializer jacksonSeial = new Jackson2JsonRedisSerializer(Object.class);

        ObjectMapper om = new ObjectMapper();
        // 指定要序列化的域，field,get和set,以及修饰符范围，ANY是都有包括private和public
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        // 指定序列化输入的类型，类必须是非final修饰的，final修饰的类，比如String,Integer等会跑出异常
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jacksonSeial.setObjectMapper(om);

        // 值采用json序列化
        redisTemplate.setValueSerializer(jacksonSeial);
        //使用StringRedisSerializer来序列化和反序列化redis的key值
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        // 设置hash key 和value序列化模式
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(jacksonSeial);
        redisTemplate.afterPropertiesSet();*/

        return redisTemplate;
    }

    /**
     *创建一个 StringRedisTemplate对象
     * StringRedisTemplate 继承于 RedisTemplate
     * 主要使用String下的序列化方案
     * 主要处理值为 字符串格式的数据
     * StringRedisTemplate 和 RedisTemplate 里面的数据是不能通用的，只能自己处理自己的数据
     * @param redisConnectionFactory
     * @return
     */
    @Bean
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        //实例化redisTemplate对象String
        StringRedisTemplate stringRedisTemplate=new StringRedisTemplate();
        //给连接对象赋值
        stringRedisTemplate.setConnectionFactory(redisConnectionFactory);

        return stringRedisTemplate;
    }





    //自定义缓存key生成策略
   /* @Bean
    public KeyGenerator keyGenerator() {
        return new KeyGenerator(){
            @Override
            public Object generate(Object target, java.lang.reflect.Method method, Object... params) {
                StringBuffer sb = new StringBuffer();
                sb.append(target.getClass().getName());
                sb.append(method.getName());
                //参数
                for(Object obj:params){
                    sb.append(obj.toString());
                }
                System.out.println("调用Redis生成key："+sb.toString());
                return sb.toString();
            }
        };
    }*/
}
