package com.source.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * created by panrujing on 2019/11/7.
 */
public class SuiteConfig {

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite 运行了");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite 运行了");
    }
}
