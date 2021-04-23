package top.crush.mall.api.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Crush
 * @date 2021/4/23
 * @dercsiption 首页VO类
 */
@Data
public class IndexInfoVO<MallIndexConfigGoodsVO> implements Serializable {
    @ApiModelProperty("轮播图(列表)")
    private List<MallIndexCarouselVO> carousels;
    @ApiModelProperty("首页热销商品(列表)")
    private List<MallIndexConfigGoodsVO> hotGoods;
    @ApiModelProperty("首页新品推荐(列表)")
    private List<MallIndexConfigGoodsVO> newGoods;
    @ApiModelProperty("首页推荐商品(列表)")
    private List<MallIndexConfigGoodsVO> recommendGoods;
}
