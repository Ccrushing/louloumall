package top.crush.mall.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"top.crush.mall.api.mapper"})
public class MallApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(MallApiApplication.class, args);
    }

}
