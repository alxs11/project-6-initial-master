package com.example.aggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AggregatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AggregatorApplication.class, args);
    }

}
/*Output

 .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.
| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |
| |      __      | || |    ______    | || |    ______    | || |  _______     | || |  _________   | || |    ______    | || |      __      | || |  _________   | || |     ____     | || |  _______     | |
| |     /  \     | || |  .' ___  |   | || |  .' ___  |   | || | |_   __ \    | || | |_   ___  |  | || |  .' ___  |   | || |     /  \     | || | |  _   _  |  | || |   .'    `.   | || | |_   __ \    | |
| |    / /\ \    | || | / .'   \_|   | || | / .'   \_|   | || |   | |__) |   | || |   | |_  \_|  | || | / .'   \_|   | || |    / /\ \    | || | |_/ | | \_|  | || |  /  .--.  \  | || |   | |__) |   | |
| |   / ____ \   | || | | |    ____  | || | | |    ____  | || |   |  __ /    | || |   |  _|  _   | || | | |    ____  | || |   / ____ \   | || |     | |      | || |  | |    | |  | || |   |  __ /    | |
| | _/ /    \ \_ | || | \ `.___]  _| | || | \ `.___]  _| | || |  _| |  \ \_  | || |  _| |___/ |  | || | \ `.___]  _| | || | _/ /    \ \_ | || |    _| |_     | || |  \  `--'  /  | || |  _| |  \ \_  | |
| ||____|  |____|| || |  `._____.'   | || |  `._____.'   | || | |____| |___| | || | |_________|  | || |  `._____.'   | || ||____|  |____|| || |   |_____|    | || |   `.____.'   | || | |____| |___| | |
| |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |
| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |
 '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'
:: Built with Spring Boot :: 2.6.6

2022-05-12 18:07:21.897  INFO 30644 --- [  restartedMain] c.e.aggregator.AggregatorApplication     : Starting AggregatorApplication using Java 17.0.2 on LAPTOP-BVTJAO9S with PID 30644 (C:\CSC205\project-6-initial-master\project-6-initial-master\aggregator\target\classes started by Alexis in C:\CSC205\project-6-initial-master)
2022-05-12 18:07:21.897  INFO 30644 --- [  restartedMain] c.e.aggregator.AggregatorApplication     : No active profile set, falling back to 1 default profile: "default"
2022-05-12 18:07:21.964  INFO 30644 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2022-05-12 18:07:21.964  INFO 30644 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2022-05-12 18:07:23.238  INFO 30644 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9090 (http)
2022-05-12 18:07:23.253  INFO 30644 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-05-12 18:07:23.253  INFO 30644 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.60]
2022-05-12 18:07:23.316  INFO 30644 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-05-12 18:07:23.316  INFO 30644 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1352 ms
2022-05-12 18:07:23.877  WARN 30644 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : Unable to start LiveReload server
2022-05-12 18:07:23.877  INFO 30644 --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint(s) beneath base path '/actuator'
2022-05-12 18:07:23.924  INFO 30644 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9090 (http) with context path ''
2022-05-12 18:07:23.940  INFO 30644 --- [  restartedMain] c.e.aggregator.AggregatorApplication     : Started AggregatorApplication in 2.502 seconds (JVM running for 3.107)

 */
