package cn.ai.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huanglei on 17/5/12.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();;
        demoMethodService.add();
        context.close();
    }
}
