package com.benson.sfmdemo.config;

import com.benson.sfmdemo.util.JdbcRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class JdbcRunnerConfig {

  @Bean
  public JdbcRunner jdbcRunner(NamedParameterJdbcTemplate jdbcTemplate) {
    return new JdbcRunner(jdbcTemplate);
  }
}
