package top.crush.mall.api.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Crush
 * @date 2021/4/23
 * @dercsiption 商城首页分类VO
 */
@Data
public class MallIndexCategoryVO implements Serializable {
    @ApiModelProperty("当前一级分类id")
    private Long categoryId;
    @ApiModelProperty("当前分类级别")
    private Byte categoryLevel;
    @ApiModelProperty("当前一级分类名称")
    private String categoryName;
    @ApiModelProperty("二级分类列表")
    private List<SecondLevelCategoryVO> secondLevelCategoryVos;
}
