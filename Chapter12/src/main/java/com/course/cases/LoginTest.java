package com.course.cases;


import com.course.config.TestConfig;
import com.course.model.interfaceName;
import com.course.uties.ConfigFile;
import org.apache.http.impl.client.DefaultHttpClient;
import org.testng.annotations.BeforeTest;

public class LoginTest {

    @BeforeTest(groups = "loginTrue",description = "测试准备工作")
     public void beforeTest(){
        TestConfig.getUserInfoUrl = ConfigFile.getUrl(interfaceName.GETUSERINFO);
        TestConfig.addUserUrl = ConfigFile.getUrl(interfaceName.ADDUSERINFO);
        TestConfig.getUserListUrl = ConfigFile.getUrl(interfaceName.GETUSERLIST);
        TestConfig.loginUrl = ConfigFile.getUrl(interfaceName.LOGIN);
        TestConfig.updateUserInfoUrl = ConfigFile.getUrl(interfaceName.UPDATEUSERINFO);

        TestConfig.defaultHttpClient = new DefaultHttpClient();
     }
}
