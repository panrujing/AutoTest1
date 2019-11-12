package com.source.testng;

import org.testng.annotations.*;

/**
 * created by panrujing on 2019/11/7.
 */
public class BasicAoto {

    @Test
    public void testCase1(){
     System.out.println("Test用来把方法标注成测试的一部分1");
    }

    @BeforeMethod
    public void testCase2(){
        System.out.println("BeforeMethod测试方法之前运行的");
    }

    @Test
    public void testCase4(){
        System.out.println("Test用来把方法标注成测试的一部分2");
    }

    @AfterMethod
    public void testCase3(){
        System.out.println("AfterMethod测试方法之后运行的");
    }


    @BeforeClass
    public void testCase5(){
        System.out.println("BeforeClass类运行之前运行的");
    }

    @AfterClass
    public void testCase6(){
        System.out.println("AfterClass类运行之后运行的");
    }

    @BeforeSuite
    public void testCase7(){
        System.out.println("BeforeSuite测试套件在类之前");
    }

    @AfterSuite
    public void testCase8(){
        System.out.println("AfterSuite测试套件在类之后");
    }
}

