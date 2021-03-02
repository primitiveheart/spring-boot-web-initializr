package com.zgb.spring.boot.web.initializr.common.enums;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2021/3/2 9:09 下午
 * @Created By guanbao.zhou
 */
public enum ErrorCodeEnum {
  /**
   * 操作成功
   */
  OK(200, "操作成功"),
  /**
   * 系统错误
   */
  SYSTEM_ERROR(10000, "系统错误"),
  /**
   * 缺少参数
   */
  PARAMETER_REQUIRED(10001, "缺少参数"),
  /**
   * 对象转换异常
   */
  COPY_PROPERTIES_ERROR(10002, "对象转换异常");

  /**
   * 编码
   */
  private Integer code;
  /**
   * 信息
   */
  private String message;

  /**
   * 构造函数
   *
   * @param code 编码
   * @param message 信息
   */
  private ErrorCodeEnum(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  /**
   * 根据code获取message
   *
   * @param code
   * @return
   */
  public static String getMessage(Integer code) {
    for (ErrorCodeEnum errorCodeEnum : ErrorCodeEnum.values()) {
      if (errorCodeEnum.getCode().equals(code)) {
        return errorCodeEnum.getMessage();
      }
    }
    return null;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
