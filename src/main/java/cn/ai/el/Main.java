package cn.ai.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huanglei on 17/5/13.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig resourceService = context.getBean(ELConfig.class);


        resourceService.outputResource();
        context.close();
    }
}
