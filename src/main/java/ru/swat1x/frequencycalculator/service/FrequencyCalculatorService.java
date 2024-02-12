package ru.swat1x.frequencycalculator.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FrequencyCalculatorService {

  public Map<Character, Integer> calculateFrequency(String value) {
    var map = new HashMap<Character, Integer>();

    for (char c : value.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    return map;
  }

}
