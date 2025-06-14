package com.benson.sfmdemo.util;

import java.util.List;
import org.simpleflatmapper.jdbc.spring.JdbcTemplateMapperFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class JdbcRunner {
  private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  public JdbcRunner(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
    this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
  }

  /** this method will create the mapper everytime when called */
  public <T> List<T> query(String sql, Class<T> targeClass) {
    RowMapper<T> mapper = JdbcTemplateMapperFactory.newInstance().newRowMapper(targeClass);

    return namedParameterJdbcTemplate.query(sql, mapper);
  }

  public <T> List<T> query(String sql, RowMapper<T> mapper) {
    return namedParameterJdbcTemplate.query(sql, mapper);
  }
}
