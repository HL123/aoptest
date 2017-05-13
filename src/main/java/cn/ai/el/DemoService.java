package cn.ai.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by huanglei on 17/5/13.
 */
@Service
public class DemoService {
    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
