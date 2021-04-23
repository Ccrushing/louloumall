package top.crush.mall.api.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Crush
 * @date 2021/4/23
 * @dercsiption 保存订单param
 */
@Data
public class SaveOrderParam implements Serializable {
    @ApiModelProperty("订单项id数组")
    private Long[] cartItemIds;
    @ApiModelProperty("地址id")
    private Long addressId;
}
