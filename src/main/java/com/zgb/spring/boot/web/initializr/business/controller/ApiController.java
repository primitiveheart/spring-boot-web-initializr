package com.zgb.spring.boot.web.initializr.business.controller;

import com.zgb.spring.boot.web.initializr.common.enums.ErrorCodeEnum;
import com.zgb.spring.boot.web.initializr.common.pojo.CommonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2021/3/2 9:39 下午
 * @Created By guanbao.zhou
 */
@Api(tags = {"学生"})
@Controller()
@RequestMapping("/api")
public class ApiController {

  @GetMapping("info/get")
  @ApiOperation(value = "获取API信息", httpMethod = "GET")
  @ResponseBody
  public CommonResponse<String> getApiInfo() {
    return CommonResponse.response(ErrorCodeEnum.OK.getCode(), "api Controller");
  }
}
