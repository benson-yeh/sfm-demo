package com.benson.sfmdemo.dao;

import com.benson.sfmdemo.util.JdbcRunner;
import com.benson.sfmdemo.vo.PersonLoginRecordVO;
import java.util.List;

import org.simpleflatmapper.jdbc.spring.JdbcTemplateMapperFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonLoginRecordDao {
  // language=GenericSQL
  private final String sql =
      """
              SELECT
                  p.username
                  ,p.first_name
                  ,p.last_name
                  ,p.email
                  ,r.login_time
              FROM person p
              LEFT JOIN login_record r
              ON p.username = r.username""";
  private final RowMapper<PersonLoginRecordVO> rowMapper;

  private final JdbcRunner jdbcRunner;

  public PersonLoginRecordDao(JdbcRunner jdbcRunner) {
    this.jdbcRunner = jdbcRunner;
    this.rowMapper =
        JdbcTemplateMapperFactory.newInstance().newRowMapper(PersonLoginRecordVO.class);
  }

  public List<PersonLoginRecordVO> getResult() {
    return jdbcRunner.query(sql, PersonLoginRecordVO.class);
  }

  public List<PersonLoginRecordVO> getResultWithPreBuildMapper() {
    return jdbcRunner.query(sql, rowMapper);
  }
}
