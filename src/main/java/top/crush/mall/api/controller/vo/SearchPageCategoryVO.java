package top.crush.mall.api.controller.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Crush
 * @date 2021/4/23
 * @dercsiption 搜索页面分类VO
 */
@Data
public class SearchPageCategoryVO<MallGoodsCategory> implements Serializable {
    private String firstLevelCategoryName;
    private List<MallGoodsCategory> secondLevelCategoryList;
    private String secondLevelCategoryName;
    private List<MallGoodsCategory> thirdLevelCategoryList;
    private String currentCategoryName;
}
