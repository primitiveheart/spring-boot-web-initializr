package com.zgb.spring.boot.web.initializr.common.pojo;

import com.zgb.spring.boot.web.initializr.common.enums.ErrorCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2021/3/2 9:10 下午
 * @Created By guanbao.zhou
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse<T> {
  private Integer code;
  private String message;
  private T data;

  /**
   * 返回结果
   *
   * @param code 编码
   * @return
   */
  public static CommonResponse response(Integer code) {
    return new CommonResponse(code, "", null);
  }

  /**
   * 返回结果
   *
   * @param code 编码
   * @param message 信息
   * @return
   */
  public static CommonResponse response(Integer code, String message) {
    return new CommonResponse(code, message, null);
  }

  /**
   * 返回结果
   *
   * @param code 编码
   * @param message 信息
   * @param data 数据
   * @return
   */
  public static CommonResponse response(Integer code, String message, Object data) {
    return new CommonResponse(code, message, data);
  }

  /**
   * 返回系统错误结果
   *
   * @return
   */
  public static CommonResponse error() {
    return new CommonResponse(ErrorCodeEnum.SYSTEM_ERROR.getCode(), ErrorCodeEnum.SYSTEM_ERROR.getMessage(), null);
  }

  /**
   * 返回系统错误结果
   *
   * @param message 信息
   * @return
   */
  public static CommonResponse error(String message) {
    return new CommonResponse(ErrorCodeEnum.SYSTEM_ERROR.getCode(), message, null);
  }

  /**
   * 返回系统错误结果
   *
   * @param code 编码
   * @param message 信息
   * @return
   */
  public static CommonResponse error(Integer code, String message) {
    return new CommonResponse(code, message, null);
  }

  /**
   * 返回系统错误结果
   *
   * @param message 信息
   * @param data 数据
   * @return
   */
  public static CommonResponse error(String message, Object data) {
    return new CommonResponse(ErrorCodeEnum.SYSTEM_ERROR.getCode(), message, data);
  }

  /**
   * 返回操作成功结果
   *
   * @return
   */
  public static CommonResponse ok() {
    return new CommonResponse(ErrorCodeEnum.OK.getCode(), ErrorCodeEnum.OK.getMessage(), null);
  }

  /**
   * 返回操作成功结果
   *
   * @param data 数据
   * @return
   */
  public static CommonResponse ok(Object data) {
    return new CommonResponse(ErrorCodeEnum.OK.getCode(), ErrorCodeEnum.OK.getMessage(), data);
  }

  /**
   * 返回操作成功结果
   *
   * @param message 信息
   * @param data 数据
   * @return
   */
  public static CommonResponse ok(String message, Object data) {
    return new CommonResponse(ErrorCodeEnum.OK.getCode(), message, data);
  }

}
