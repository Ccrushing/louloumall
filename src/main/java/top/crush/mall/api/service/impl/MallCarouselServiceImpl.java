package top.crush.mall.api.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import top.crush.mall.api.controller.vo.MallIndexCarouselVO;
import top.crush.mall.api.entity.MallCarousel;
import top.crush.mall.api.mapper.MallCarouselMapper;
import top.crush.mall.api.service.MallCarouselService;
import top.crush.mall.api.util.BaseBeanUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Crush
 * @date 2021/4/25
 * @dercsiption MallCarouselServiceImpl
 */
@Service
public class MallCarouselServiceImpl implements MallCarouselService {
    @Resource
    private MallCarouselMapper mallCarouselMapper;

    @Override
    public List<MallIndexCarouselVO> getCarouselsForIndex(int number) {
        List<MallIndexCarouselVO> list = new ArrayList<>(number);
        List<MallCarousel> carousels = mallCarouselMapper.findCarouselsByNum(number);
        if (!CollectionUtils.isEmpty(carousels)) {
            list = BaseBeanUtil.copyList(carousels,MallIndexCarouselVO.class);
        }
        return list;
    }
}
