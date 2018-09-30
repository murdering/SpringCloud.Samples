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
