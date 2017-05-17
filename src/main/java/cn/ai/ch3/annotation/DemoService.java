package cn.ai.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by huanglei on 17/5/14.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
