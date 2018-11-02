package xyz.yooniks.casualtools_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CasualToolsApiApplication {

  public static void main(String... args) {
    SpringApplication.run(CasualToolsApiApplication.class, args);
  }

}
