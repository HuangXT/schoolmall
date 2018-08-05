# 快速入门
基于SpringCloud体系实现，简单校园购物流程实现，满足基本功能：注册、登录、商品列表展示、商品详情展示、订单创建、详情查看、订单支付、库存更新等。


# 环境配置
1. maven：apache-maven-3.0.5
2. jdk:jdk1.8.0_151
3. idea:2017.3 pro

# 版本标识
tag v0.1 主要是组件模块化换分，为后期项目各类功能开发套件


# 数据库脚本
每个业务服务采用独立的Mysql数据库进行挂你，目前考虑到的组件如下：

1. 服务监控: spring-boot-admin
2. 服务注册发现: eureka
3. 配置管理:spring config , spring security
4. 集群容错: hystrix
5. API网关: zuul
6. 服务负载:feign+ribbon

# 各模块介绍

|      模块名称         |    端口    |             简介                                               |
| --------             |   :-----:   | :----               |
| admin-server         |    9002    |  服务监控中心，监控所有服务模块    |
| conf-server          |    9004    |  分布式配置中心，结合spring-security/rabbitmq同时使用   |
| eureka-server        |    9003    |  服务注册中心，提供服务注册、发现功能  |
| sleuth-server        |    9001    |  SpringCloud实现的一种分布式追踪解决方案，兼容Zipkin  |
| zuul-server          |    9005    |  API网关模块  |
| account-service      |    8080    |  用户服务，提供注册、登录、地址等服务  |
| product-service      |    8081    |  商品服务，提供商品列表、详情、库存更新等服务  |
| payment-service      |    8082    |  支付服务，支付记录  |
| order-service        |    8083    |  订单服务，提供订单创建、详情、状态变更  |
| msg-service          |    8084    |  消息处理服务  |
| front-app            |    9099    |  前端服务，结合swagger2提供API管理  |


# 快速上手
- 1、先启动admin-server,eureka-server,conf-server三个基础服务
- 2、再依次启动payment/order/product/account基础业务服务
- 3、最后启动front-app服务，打开浏览器，输入http://localhost:9099/swagger-ui.html