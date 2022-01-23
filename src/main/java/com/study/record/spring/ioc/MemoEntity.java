package com.study.record.spring.ioc;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class MemoEntity {
  private int idx;
  private String contents;
}