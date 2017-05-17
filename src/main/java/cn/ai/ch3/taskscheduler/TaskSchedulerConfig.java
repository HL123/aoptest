package cn.ai.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by huanglei on 17/5/14.
 */
@Configuration
@ComponentScan("cn.ai.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
