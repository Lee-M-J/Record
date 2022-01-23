package com.study.record.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

@Slf4j
public class IocMapperQuery {

  public String findAll() {
    SQL sql = new SQL()
        .SELECT("*")
        .FROM("MEMO");
    return sql.toString();
  }

  public String insert(@Param("contents") String contents) {
    log.debug("contents: {}", contents);
    SQL sql = new SQL()
        .INSERT_INTO("MEMO")
        .INTO_COLUMNS("contents")
        .INTO_VALUES("#{contents}");
    return sql.toString();
  }

}