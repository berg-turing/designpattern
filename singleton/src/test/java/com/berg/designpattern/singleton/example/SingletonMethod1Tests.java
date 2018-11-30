package com.berg.designpattern.singleton.example;

import com.berg.designpattern.singleton.SingletonApplicationTests;
import com.berg.designpattern.singleton.example.method1.Singleton1;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 单例模式测试：饿汉式单例模式
 * 线程安全、序列化不安全
 *
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/30
 */
public class SingletonMethod1Tests extends SingletonApplicationTests {
    /**
     * 单例模式测试工具类
     */
    @Autowired
    private SingletonMethodTestUtils singletonMethodTestUtils;

    /**
     * 测试单线程的情景
     */
    @Test
    public void testSingleThread() {
        //单线程测试
        this.singletonMethodTestUtils.testSingleThread(Singleton1::of);
    }

    /**
     * 多线程模式测试
     */
    @Test
    public void testMutilThread() {
        //多线程测试
        this.singletonMethodTestUtils.testMutilThread(10, Singleton1::of);
    }
}