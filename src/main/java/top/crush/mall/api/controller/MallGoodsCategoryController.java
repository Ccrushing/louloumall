package top.crush.mall.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.util.CollectionUtils;
import top.crush.mall.api.common.MallException;
import top.crush.mall.api.common.ServiceResultEnum;
import top.crush.mall.api.controller.vo.MallIndexCategoryVO;
import top.crush.mall.api.service.MallGoodsCategoryService;
import top.crush.mall.api.util.ResultGenerator;
import top.crush.mall.api.util.Result;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Crush
 * @date 2021/4/26
 * @dercsiption MallGoodsCategoryController
 */
@RestController
@Api(value = "v1", tags = "4.楼楼商城分类页面接口")
@RequestMapping("/api/v1")
public class MallGoodsCategoryController {
    @Resource
    private MallGoodsCategoryService mallGoodsCategoryService;

    @GetMapping("/categories")
    @ApiOperation(value = "获取分类数据", notes = "分类页面使用")
    public Result getCategories() {
        List<MallIndexCategoryVO> categories = mallGoodsCategoryService.getCategoriesForIndex();
        if (CollectionUtils.isEmpty(categories)) {
            MallException.fail(ServiceResultEnum.DATA_NOT_EXIST.getResult());
        }
        return ResultGenerator.genSuccessResult(categories);
    }
}
