package cn.ai.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huanglei on 17/5/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //现将活动的Profile设置为prod
        context.getEnvironment().setActiveProfiles("dev");

        //后注册Bean配置类，不然会报Bean未定义的错误
        context.register(ProfileConfig.class);

        //刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
