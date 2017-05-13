package cn.bjut.ai.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by huanglei on 17/5/12.
 */
@Configuration
@ComponentScan("cn.bjut.ai.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
