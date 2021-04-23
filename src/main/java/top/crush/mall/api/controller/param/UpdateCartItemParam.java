package top.crush.mall.api.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Crush
 * @date 2021/4/23
 * @dercsiption 购物项param
 */
@Data
public class UpdateCartItemParam implements Serializable {
    @ApiModelProperty("购物项id")
    private Long cartItemId;
    @ApiModelProperty("商品数量")
    private Integer goodsCount;
}