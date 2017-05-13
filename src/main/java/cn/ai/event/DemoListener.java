package cn.ai.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by huanglei on 17/5/13.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我（bean-demoListener接收到了bean-demoPublisher发布的消息：）"+ msg);
    }
}
