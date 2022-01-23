package com.study.record.spring.ioc;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class IocController {

//  private final IocService iocService;
//
//  public IocController(IocService iocService) {
//    this.iocService = iocService;
//  }

  private final IocService iocService;

  public IocController() {
    this.iocService = new IocServiceImpl();
  }

  @ResponseBody
  @GetMapping("/contents")
  public List<MemoEntity> selectAll() {
    return iocService.selectAll();
  }

  @ResponseBody
  @PostMapping("/content")
  public void insert(@RequestBody @Validated MemoDto memoDto, BindingResult bindingResult) {
    log.debug("memoDto: {}", memoDto.toString());
    iocService.insert(memoDto.getContents());
  }

}
