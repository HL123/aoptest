package cn.ai.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;


/**
 * Created by huanglei on 17/5/13.
 */

@ComponentScan("cn.ai.el")
@Configuration
@PropertySource(value = "classpath:cn/ai/el/test.properties")
public class ELConfig {

    @Value("I Love You!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random() *100.0}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:cn/bjut/ai/el/test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig(){
        return new PropertySourcesPlaceholderConfigurer();
    }


    public void outputResource(){
        System.out.println("normal "+normal);
        System.out.println("osName "+osName);
        System.out.println("randomNumber "+randomNumber);
        System.out.println("fromAnother "+fromAnother);
        try {
            System.out.println("testFile "+ IOUtils.toString(testFile.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("testUrl "+ IOUtils.toString(testUrl.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("bookAuthor "+bookName);
        System.out.println("environment.getProperty "+environment.getProperty("book.author"));
    }

}
