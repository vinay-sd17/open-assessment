package org.ringcentral.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.DefaultHttpLogWriter;
import org.zalando.logbook.DefaultSink;
import org.zalando.logbook.Logbook;
import org.zalando.logbook.json.JsonHttpLogFormatter;

import static org.zalando.logbook.Conditions.exclude;
import static org.zalando.logbook.Conditions.requestTo;

@Configuration
public class LogBookConfig {

  @Bean
  public Logbook logbook() {
    Logbook logbook = Logbook.builder().condition(
            exclude(requestTo("/health"), requestTo("**/swagger-resources"),
                requestTo("**/v2/api-docs"),
                requestTo("**/swagger-resources/**"), requestTo("**/swagger-ui.html"),
                requestTo("**/webjars/**")))
        .sink(new DefaultSink(new JsonHttpLogFormatter(), new DefaultHttpLogWriter())).build();
    return logbook;
  }
}
