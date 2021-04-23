package top.crush.mall.api.config.annotation;

import java.lang.annotation.*;

/**
 * @author Crush
 * @date 2021/4/23
 * @dercsiption TokenToMallUser
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TokenToMallUser {
    /**
     * 当前用户在request中的名字
     * @return String
     */
    String value() default "user";
}
