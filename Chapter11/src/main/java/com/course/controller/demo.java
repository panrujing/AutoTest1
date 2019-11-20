package com.course.controller;


import com.course.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Log4j
@RestController
@Api(value = "v1",description = "增删改查的接口测试" )
@RequestMapping("v1")
public class demo {
    //首先获取一个执行sql语句的对象
    @Autowired
    private SqlSessionTemplate template;
    //测试的接口-查询
    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    @ApiOperation(value = "可以获取到的用户数",httpMethod = "GET")
    public int getUserCount(){
     return template.selectOne("getUserCount");
    }
    //测试的接口-增加 需要传参
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ApiOperation(value = "增加一行数据",httpMethod = "POST")
    public int addUser(@RequestBody User user){
        int result = template.insert("addUser",user);
        return result;
    }
    //测试的接口-更新 需要传参
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    @ApiOperation(value = "更新一行数据",httpMethod = "POST")
    public int updateUser(@RequestBody User user){
        return template.update("updateUser",user);
    }
    //测试的接口-删除
    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    @ApiOperation(value = "删除一行数据")
    public int deleteUser(@RequestParam int id){
        return template.delete("deleteUser",id);
    }
}
