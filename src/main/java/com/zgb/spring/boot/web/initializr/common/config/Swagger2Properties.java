package com.zgb.spring.boot.web.initializr.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2021/3/2 9:30 下午
 * @Created By guanbao.zhou
 * swagger 配置属性
 */
@Component
@ConfigurationProperties(prefix = "swagger")
@Data
public class Swagger2Properties {
  /**
   * swagger 是否启用
   */
  private Boolean enable;

  /**
   * 包路径
   */
  private String basePackage;

  /**
   * 标题
   */
  private String title;

  /**
   * 描述
   */
  private String description;

  /**
   * 版本
   */
  private String version;
}
