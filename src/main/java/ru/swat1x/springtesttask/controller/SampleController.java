package ru.swat1x.springtesttask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.swat1x.springtesttask.service.SampleService;

import java.util.Map;

@RestController
public class SampleController {

  private final SampleService service;

  public SampleController(SampleService service) {
    this.service = service;
  }

  @GetMapping("/frequency")
  public Map<Character, Integer> calculateFrequency(
          @RequestParam(name = "text") String value
  ) {
    return service.calculateFrequency(value);
  }

}
