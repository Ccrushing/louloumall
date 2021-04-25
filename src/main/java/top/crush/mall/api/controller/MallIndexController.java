package top.crush.mall.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.crush.mall.api.common.Constants;
import top.crush.mall.api.common.IndexConfigTypeEnum;
import top.crush.mall.api.controller.vo.IndexInfoVO;
import top.crush.mall.api.controller.vo.MallIndexCarouselVO;
import top.crush.mall.api.controller.vo.MallIndexGoodsVO;
import top.crush.mall.api.service.MallCarouselService;
import top.crush.mall.api.service.MallIndexConfigService;
import top.crush.mall.api.util.Result;
import top.crush.mall.api.util.ResultGenerator;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Crush
 * @date 2021/4/25
 * @dercsiption MallIndexController
 */
@RestController
@Api(value = "v1", tags = "3.楼楼商城首页接口")
@RequestMapping("/api/v1")
public class MallIndexController {
    @Resource
    private MallCarouselService mallCarouselService;

    @Resource
    private MallIndexConfigService mallIndexConfigService;

    @GetMapping("/index-infos")
    @ApiOperation(value = "获取首页数据", notes = "轮播图、热销、新品、推荐等")
    public Result indexInfo() {
        IndexInfoVO indexInfoVO = new IndexInfoVO();
        List<MallIndexCarouselVO> carousels = mallCarouselService.getCarouselsForIndex(Constants.INDEX_CAROUSEL_NUMBER);
        List<MallIndexGoodsVO> hotGoods = mallIndexConfigService.getConfigGoodsForIndex(IndexConfigTypeEnum.INDEX_GOODS_HOT.getType(), Constants.INDEX_GOODS_HOT_NUMBER);
        List<MallIndexGoodsVO> newGoods = mallIndexConfigService.getConfigGoodsForIndex(IndexConfigTypeEnum.INDEX_GOODS_NEW.getType(), Constants.INDEX_GOODS_NEW_NUMBER);
        List<MallIndexGoodsVO> recommendGoods = mallIndexConfigService.getConfigGoodsForIndex(IndexConfigTypeEnum.INDEX_GOODS_RECOMMEND.getType(), Constants.INDEX_GOODS_RECOMMOND_NUMBER);
        indexInfoVO.setCarousels(carousels);
        indexInfoVO.setHotGoods(hotGoods);
        indexInfoVO.setNewGoods(newGoods);
        indexInfoVO.setRecommendGoods(recommendGoods);
        return ResultGenerator.genSuccessResult(indexInfoVO);
    }
}
