package org.apache.dubbo.demo.consumer.comp;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.demo.DemoService;
import org.apache.dubbo.demo.FishDemo;
import org.springframework.stereotype.Component;

/**
 * 第一个dubbo demo
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/3 20:37
 */
@Component("fishDemo")
public class FishDemoComponent implements FishDemo {

    @Reference
    private FishDemo fishDemo;

    @Override
    public String demoservice() {
        return fishDemo.demoservice();
    }
}
