package org.ringcentral.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing
@EnableJpaRepositories("org.ringcentral.application.repository")
@EntityScan("org.ringcentral.library.entity.*")
@SpringBootApplication(scanBasePackages = { "org.ringcentral" })
public class RcFfdApplication {

  public static void main(String[] args) {
    SpringApplication.run(RcFfdApplication.class, args);
  }

}
