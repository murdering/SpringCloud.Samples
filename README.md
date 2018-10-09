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
