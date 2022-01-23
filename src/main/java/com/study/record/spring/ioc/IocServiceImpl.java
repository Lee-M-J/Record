package com.study.record.spring.ioc;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
@Slf4j
public class IocServiceImpl implements IocService {

  @Autowired
  private IocMapper iocMapper;

//  public IocServiceImpl(IocMapper iocMapper) {
//    this.iocMapper = iocMapper;
//  }

  @Override
  public List<MemoEntity> selectAll() {
    List<MemoEntity> contents = iocMapper.selectAll();
    return contents;
  }

  @Override
  public void insert(String contents) {
    iocMapper.insert(contents);
  }
}
