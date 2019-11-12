package com.source.testng.suite;

import org.testng.annotations.Test;

/**
 * created by panrujing on 2019/11/8.
 */
public class ignoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1被执行");
    }

    @Test
    public void ignore2(){
        System.out.println("ignore2被执行");
    }

}
