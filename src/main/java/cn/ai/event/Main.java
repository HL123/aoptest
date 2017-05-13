package cn.ai.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huanglei on 17/5/13.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
    }
}
