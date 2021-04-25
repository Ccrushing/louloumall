package top.crush.mall.api.service;

import top.crush.mall.api.controller.vo.MallIndexCarouselVO;

import java.util.List;

/**
 * @author Crush
 * @date 2021/4/25
 * @dercsiption MallCarouselService
 */
public interface MallCarouselService {
    /**
     * 返回固定数量的轮播图对象(首页调用)
     *
     * @param number 数量
     * @return 轮播图集合
     */
    List<MallIndexCarouselVO> getCarouselsForIndex(int number);

}
