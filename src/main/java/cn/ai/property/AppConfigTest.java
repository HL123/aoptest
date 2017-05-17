package cn.ai.property;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by huanglei on 17/5/14.
 */
@Configurable
@ComponentScan(basePackages = "cn.ai.property")
@PropertySource("classpath:cn/ai/test.properties")
public class AppConfigTest {

    // @PropertySource("classpath:aoptest/cn/ai/test.properties")
    // /Users/huanglei/Documents/IntelliJ/aoptest/src/main/java/cn/ai

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
