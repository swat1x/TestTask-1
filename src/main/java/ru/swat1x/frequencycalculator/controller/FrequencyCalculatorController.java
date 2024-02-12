package ru.swat1x.frequencycalculator.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.swat1x.frequencycalculator.service.FrequencyCalculatorService;

import java.util.Map;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class FrequencyCalculatorController {

  FrequencyCalculatorService service;

  @GetMapping("/frequency")
  public Map<Character, Integer> calculateFrequency(
          @RequestParam(name = "text") String value
  ) {
    return service.calculateFrequency(value);
  }

}

