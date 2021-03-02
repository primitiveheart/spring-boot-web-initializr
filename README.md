# 统一的异常处理机制
统一的错误码 ErrorCodeEnum
统一的业务返回 CommonResponse
自定义的业务异常 BusinessException
全局的异常处理 GlobalExceptionHandler

# 接口文档管理
Swagger2
访问地址形式：http://{ip}:{port}/{projectname}/swagger-ui.html
实际访问地址：http://localhost:8080/spring-boot-web-initializr/swagger-ui.htm

# 日志
门面日志：
日志配置文件：logback-spring.xml

# 规范
1.建议对外接口有统一的前缀/api，
 一级路径：api 
 二级路径：业务
 三级路径：操作
 示例 api/user/insert
 
2.项目的目录组成
Controller: 控制器，只做请求的转发
Service：服务层，业务逻辑处理
Pojo.bo: 业务层中的类，通常以BO结尾
Pojo.vo: 返回类，视图类，通常以VO结尾
Pojo.query:请求查询类，通常以Query结尾

# 常用测试示例
测试框架：Junit 5
断言框架：Hamcrest和AssertJ
模拟框架：mockito

# 常用类
PageResult 分页结果
PageQuery 分页查询基类