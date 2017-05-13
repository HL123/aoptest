package cn.bjut.ai.aop;

import java.lang.annotation.*;

/**
 * Created by huanglei on 17/5/12.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
