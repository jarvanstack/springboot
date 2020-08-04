package com.example.sb11.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * //允许跨域请求@CrossOrigin
 * @Author Jarvan
 * @create 2020/8/2 15:59
 */
@RestController
@CrossOrigin
@Api(tags = "tags测试类" ,value = "value测试类")
public class HelloController {
    @ApiOperation(value="【PC端】提交订单", notes="提交一组识别的标签id，返回生成的订单详情")
    @RequestMapping(value = "/test/{id}", method = RequestMethod.POST, produces  = "application/json;charset=UTF-8")
    public Integer test(@PathVariable Integer id){
        System.out.println(id);
        return id;
    }

}
