package top.crush.mall.api.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.crush.mall.api.entity.MallUser;

import javax.annotation.Resource;
import java.util.List;


@SpringBootTest
class MallUserMapperTest {
    @Resource
    private MallUserMapper mallUserMapper;

    @Test
    void selectByPrimaryKey() {
        MallUser mallUser = mallUserMapper.selectByPrimaryKey(1L);
        System.out.println(mallUser);
    }

    @Test
    void selectAll() {
        List<MallUser> mallUsers = mallUserMapper.selectAll();
        System.out.println(mallUsers);
    }
}