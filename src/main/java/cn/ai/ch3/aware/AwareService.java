package cn.ai.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by huanglei on 17/5/14.
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{
    private String beanName;
    private ResourceLoader resourceLoader;

    public void outputResult(){
        System.out.println("Bean的名称为："+  beanName);
        Resource resource = resourceLoader.getResource("classpath:/cn/ai/ch3/aware/test.txt");
        // /Users/huanglei/Documents/IntelliJ/aoptest/src/main/java/cn/ai/ch3/aware/test.txt
        try {
            System.out.println("ResourceLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
