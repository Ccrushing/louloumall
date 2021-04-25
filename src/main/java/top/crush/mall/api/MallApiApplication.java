package top.crush.mall.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages = {"top.crush.mall.api.mapper"})
@EnableSwagger2
public class MallApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(MallApiApplication.class, args);
    }

}
