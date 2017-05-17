package cn.ai.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by huanglei on 17/5/14.
 */
@Component(value = "mockConfigTest")
public class MockConfigTest {

    @Value("#{'${server.name}'.split(',')}")
    private List<String> servers;

    @Value("#{'${server.id}'.split(',')}")
    private List<Integer> serverId;

    @Value("${server.host:127.0.0.1}")
    private String noProKey;

    @Autowired
    private Environment environment;

    public void readValues(){
        System.out.println("Service Size : " + servers.size());
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigTest.class);
        MockConfigTest mockConfigTest = (MockConfigTest) context.getBean("mockConfigTest");
        mockConfigTest.readValues();
    }

}
