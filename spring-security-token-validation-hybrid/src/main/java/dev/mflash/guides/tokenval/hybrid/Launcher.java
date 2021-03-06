package dev.mflash.guides.tokenval.hybrid;

import dev.mflash.guides.tokenval.hybrid.security.OidcProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(OidcProperties.class)
public @SpringBootApplication class Launcher {

  public static void main(String[] args) {
    SpringApplication.run(Launcher.class, args);
  }
}
