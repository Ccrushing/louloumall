package top.crush.mall.api.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.crush.mall.api.service.MallUserService;
import top.crush.mall.api.controller.param.MallUserUpdateParam;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MallUserServiceTest {

    @Resource
    private MallUserService mallUserService;

    @Test
    void register() {
        String register = mallUserService.register("18014263405", "1234567");
        log.info(register);
        assertEquals("success", register);
    }

    @Test
    void login() {
        String login = mallUserService.login("18014263405", "14b663ca1e125a736e3c716575df5735");
        //返回了登录用户的token，会在tb_mall_user_token表生成一条token记录
        log.info(login);
    }

    @Test
    void updateUserInfo() {
        //修改2号用户信息,可修改的字段为MallUserUpdateParam的属性
        MallUserUpdateParam mup = new MallUserUpdateParam();
        mup.setNickName("CRUSH");
        mup.setPasswordMd5("d5b096316ebc53fab8babfa2c0406353");
        mup.setIntroduceSign("BALABAL");
        Boolean result = mallUserService.updateUserInfo(mup, 2L);
        log.info(result.toString());
        assertTrue(result);
    }

    @Test
    void logout() {
        //会在tb_mall_user_token表中删掉3号用户的一条token数据
        Boolean logout = mallUserService.logout(3L);
        log.info(logout.toString());
        assertTrue(logout);
    }
}
