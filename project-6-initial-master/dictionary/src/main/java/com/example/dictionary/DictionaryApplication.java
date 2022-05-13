package com.example.dictionary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DictionaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DictionaryApplication.class, args);
    }

}
/*Output
.----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .-----------------. .----------------.  .----------------.  .----------------.
| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |
| |  ________    | || |     _____    | || |     ______   | || |  _________   | || |     _____    | || |     ____     | || | ____  _____  | || |      __      | || |  _______     | || |  ____  ____  | |
| | |_   ___ `.  | || |    |_   _|   | || |   .' ___  |  | || | |  _   _  |  | || |    |_   _|   | || |   .'    `.   | || ||_   \|_   _| | || |     /  \     | || | |_   __ \    | || | |_  _||_  _| | |
| |   | |   `. \ | || |      | |     | || |  / .'   \_|  | || | |_/ | | \_|  | || |      | |     | || |  /  .--.  \  | || |  |   \ | |   | || |    / /\ \    | || |   | |__) |   | || |   \ \  / /   | |
| |   | |    | | | || |      | |     | || |  | |         | || |     | |      | || |      | |     | || |  | |    | |  | || |  | |\ \| |   | || |   / ____ \   | || |   |  __ /    | || |    \ \/ /    | |
| |  _| |___.' / | || |     _| |_    | || |  \ `.___.'\  | || |    _| |_     | || |     _| |_    | || |  \  `--'  /  | || | _| |_\   |_  | || | _/ /    \ \_ | || |  _| |  \ \_  | || |    _|  |_    | |
| | |________.'  | || |    |_____|   | || |   `._____.'  | || |   |_____|    | || |    |_____|   | || |   `.____.'   | || ||_____|\____| | || ||____|  |____|| || | |____| |___| | || |   |______|   | |
| |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |
| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |
 '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'
:: Built with Spring Boot :: 2.6.6

2022-05-12 18:08:54.816  INFO 10160 --- [  restartedMain] c.e.dictionary.DictionaryApplication     : Starting DictionaryApplication using Java 17.0.2 on LAPTOP-BVTJAO9S with PID 10160 (C:\CSC205\project-6-initial-master\project-6-initial-master\dictionary\target\classes started by Alexis in C:\CSC205\project-6-initial-master)
2022-05-12 18:08:54.816  INFO 10160 --- [  restartedMain] c.e.dictionary.DictionaryApplication     : No active profile set, falling back to 1 default profile: "default"
2022-05-12 18:08:54.897  INFO 10160 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2022-05-12 18:08:54.897  INFO 10160 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2022-05-12 18:08:56.235  INFO 10160 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9091 (http)
2022-05-12 18:08:56.251  INFO 10160 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-05-12 18:08:56.251  INFO 10160 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.60]
2022-05-12 18:08:56.344  INFO 10160 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-05-12 18:08:56.344  INFO 10160 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1447 ms
2022-05-12 18:08:57.063  INFO 10160 --- [  restartedMain] c.e.d.reference.DictionaryReference      : Dictionary created with 102217 entries in 512ms
2022-05-12 18:08:57.454  INFO 10160 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2022-05-12 18:08:57.469  INFO 10160 --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint(s) beneath base path '/actuator'
2022-05-12 18:08:57.516  INFO 10160 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9091 (http) with context path ''
2022-05-12 18:08:57.548  INFO 10160 --- [  restartedMain] c.e.dictionary.DictionaryApplication     : Started DictionaryApplication in 3.165 seconds (JVM running for 3.683)

 */
