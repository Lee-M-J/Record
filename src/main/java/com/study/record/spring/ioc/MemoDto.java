package com.study.record.spring.ioc;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MemoDto {

  @NotNull
  private String contents;
}
