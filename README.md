# SpringCloud.Samples
For Spring Cloud Study

***Reference***
> http://www.ityouknow.com/spring-cloud.html

## Notes
### Eureka
  + spring-boot-starter-parent 使用 1.5.9.RELEASE
  + consumner使用feign，要pom引入spring-cloud-starter-feign
  + @PathVariable --》 http://localhost:9001/hello **/neo**
  + @RequestParam --》 http://localhost:9000/hello **?name=neo**
  + 两个服务中心自动提供了服务均衡负载的功能，并自动轮询每个服务端
  
### Hystrix
  + Hystrix 监控页面在调用一次接口后显示出来。如果没有调用，监控页面一直在loading
  + Turbine 也是如上，每个接口调用一下后才会显示出来
  + turbine.appConfig：配置Eureka中的serviceId列表，表明监控哪些服务
  + @FeignClient name--》指定FeignClient的名称，如果项目使用了Ribbon，name属性会作为微服务的名称，用于服务发现。
  
### Spring Cloud 与 Spring Boot版本匹配关系
| Spring Cloud | Srping Boot |
| ------ | ------ |
| Finchley | 兼容Spring Boot 2.0.x，不兼容Spring Boot 1.5.x |
| Dalston和Edgware | 兼容Spring Boot 1.5.x，不兼容Spring Boot 2.0.x |
| Camden | 兼容Spring Boot 1.4.x，也兼容Spring Boot 1.5.x |
| Brixton | 兼容Spring Boot 1.3.x，也兼容Spring Boot 1.4.x |
| Angel | 兼容Spring Boot 1.2.x |
> 从下Angel到上Finchley可以看出，版本的第一个字母是按照A－Z顺序编排的。这些单词是什么含义呢，大概的搜一下可以得出基本都是地名，官方说明是这些版本号的单词来自于英国伦敦的地铁站站名。
