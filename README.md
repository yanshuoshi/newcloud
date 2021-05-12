# 工程说明

工程初步决定整合nacos + gateway + resilience4j + ribbon + openfeign + redisson + es + kafka + seata + mysql + mp 等技术

# 工程介绍

### same-configure

nacos 配置中心使用demo

### nacos-consumer

远程跨服务调用 调用方
使用nacos + openFeign 将服务自动注册到nacos并可远程服务调用

### nacos-product

远程跨服务调用 被调用方
使用nacos + openFeign 将服务自动注册到nacos并可远程服务调用

### gateway

使用spring-cloud-gateway + nacos实现路由


