package cn.ai.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by huanglei on 17/5/14.
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer integer){
        System.out.println("执行异步任务： "+ integer);
    }

    @Async
    public void executeAsyncTaskPlus(Integer integer){
        System.out.println("执行异步任务+1 " + (integer+1));
    }
}
