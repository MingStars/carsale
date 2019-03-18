package cn.czwdz.carsale;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"cn.czwdz.carsale.carshow.dao","cn.czwdz.carsale.login.dao","cn.czwdz.carsale.manager.dao","cn.czwdz.carsale.user.dao"})
public class CarsaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarsaleApplication.class, args);
    }

}
