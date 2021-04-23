package top.crush.mall.api.mapper;

import top.crush.mall.api.entity.MallUserToken;

/**
 * @Entity top.crush.mall.api.entity.MallUserToken
 */
public interface MallUserTokenMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallUserToken record);

    int insertSelective(MallUserToken record);

    MallUserToken selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallUserToken record);

    int updateByPrimaryKey(MallUserToken record);

    MallUserToken selectByToken(String token);

}




