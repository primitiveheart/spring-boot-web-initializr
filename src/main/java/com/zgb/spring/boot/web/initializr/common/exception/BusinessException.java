package com.zgb.spring.boot.web.initializr.common.exception;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2021/3/2 9:19 下午
 * @Created By guanbao.zhou
 */
public class BusinessException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  /**
   * 异常编码
   */
  private Integer errorCode;

  /**
   * 构造函数
   */
  public BusinessException() {
    super();
  }

  /**
   * 构造函数
   *
   * @param errorCode 异常编码
   */
  public BusinessException(Integer errorCode) {
    super();
    this.errorCode = errorCode;
  }

  /**
   * 构造函数
   *
   * @param errorCode 异常编码
   * @param message   异常信息
   */
  public BusinessException(Integer errorCode, String message) {
    super(message);
    this.errorCode = errorCode;
  }

  /**
   * 构造函数
   *
   * @param errorCode 异常编码
   * @param message   异常信息
   * @param cause     异常栈
   */
  public BusinessException(Integer errorCode, String message, Throwable cause) {
    super(message, cause);
    this.errorCode = errorCode;
  }

  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

}
