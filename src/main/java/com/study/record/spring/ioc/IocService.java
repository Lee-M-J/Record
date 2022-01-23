package com.study.record.spring.ioc;

import java.util.List;

public interface IocService {

  public abstract List<MemoEntity> selectAll();

  public abstract void insert(String contents);
}
