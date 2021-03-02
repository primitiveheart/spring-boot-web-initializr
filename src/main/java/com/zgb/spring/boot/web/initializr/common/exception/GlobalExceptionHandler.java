package com.zgb.spring.boot.web.initializr.common.exception;

import com.zgb.spring.boot.web.initializr.common.pojo.CommonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2021/3/2 9:16 下午
 * @Created By guanbao.zhou
 */
@ControllerAdvice
public class GlobalExceptionHandler {
  /**
   * 日志
   */
  private Logger logger = LoggerFactory.getLogger(getClass());

  /**
   * 拦截捕捉业务异常
   *
   * @param e
   * @param request
   * @return
   */
  @ExceptionHandler(value = BusinessException.class)
  @ResponseBody
  public CommonResponse myErrorHandler(BusinessException e, HttpServletRequest request) {
    String userIp = request.getRemoteAddr();
    String requestURL = request.getRequestURL().toString();
    String params = request.getQueryString();
    Date date = new Date();
    logger.error(String.format("Business Exception Log, time: %tF %tT|userIp: %s|requestURL: %s|params: %s", date,
            date, userIp, requestURL, params), e);
    return CommonResponse.error(e.getErrorCode(), e.getMessage());
  }

  /**
   * 全局异常捕捉处理
   *
   * @param e
   * @param request
   * @return
   */
  @ResponseBody
  @ExceptionHandler(value = Exception.class)
  public CommonResponse errorHandler(Exception e, HttpServletRequest request) {
    String userIp = request.getRemoteAddr();
    String requestURL = request.getRequestURL().toString();
    String params = request.getQueryString();
    Date date = new Date();
    logger.error(String.format("Exception Log, time:%tF %tT|userIp:%s|requestURL:%s|params:%s", date, date, userIp,
            requestURL, params), e);
    return CommonResponse.error();
  }
}
