package cn.ai.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by huanglei on 17/5/13.
 */
public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("Jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destory(){
        System.out.println("jsr250-destory-method");
    }

}
