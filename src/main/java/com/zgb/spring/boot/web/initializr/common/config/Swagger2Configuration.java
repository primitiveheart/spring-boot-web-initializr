package com.zgb.spring.boot.web.initializr.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2021/3/2 9:30 下午
 * @Created By guanbao.zhou
 */
@Component
@EnableSwagger2
public class Swagger2Configuration {

  @Autowired
  private Swagger2Properties swagger2Properties;

  /**
   * swagger2的配置文件
   *
   * @return
   */
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
            .enable(swagger2Properties.getEnable())
            .apiInfo(apiInfo())
            .select()
            // 包路径
            .apis(RequestHandlerSelectors.basePackage(swagger2Properties.getBasePackage()))
            .paths(PathSelectors.any())
            .build();
  }

  /**
   * 构建 api文档的详细信息
   *
   * @return
   */
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
            // 页面标题
            .title(swagger2Properties.getTitle())
            // 描述
            .description(swagger2Properties.getDescription())
            // 版本号
            .version(swagger2Properties.getVersion())
            .build();
  }

}
