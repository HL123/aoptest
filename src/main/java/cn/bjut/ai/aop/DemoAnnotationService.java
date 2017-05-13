package cn.bjut.ai.aop;

import org.springframework.stereotype.Service;

/**
 * Created by huanglei on 17/5/12.
 */

@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
