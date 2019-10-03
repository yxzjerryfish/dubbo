package org.apache.dubbo.demo.provider;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.DemoService;
import org.apache.dubbo.demo.FishDemo;

/**
 * Dubbo Demo测试
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/3 20:33
 */
@Service
public class FishDemoServiceImpl implements FishDemo {
    @Override
    public String demoservice() {
        return "Hello";
    }
}
