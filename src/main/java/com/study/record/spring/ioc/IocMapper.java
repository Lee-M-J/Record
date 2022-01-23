package com.study.record.spring.ioc;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface IocMapper {

  @SelectProvider(type = IocMapperQuery.class, method = "findAll")
  public ArrayList<MemoEntity> selectAll();

  @SelectProvider(type = IocMapperQuery.class, method ="insert")
  public void insert(String contents);
}
