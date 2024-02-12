package ru.swat1x.springtesttask;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.swat1x.springtesttask.service.SampleService;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringTestTaskApplicationTests {

  @Autowired
  private SampleService service;

  @Test
  void frequency() {
    var value = "aaabbbbccc567";

    var correctAnswer = new HashMap<Character, Integer>();
    correctAnswer.put('a', 3);
    correctAnswer.put('b', 4);
    correctAnswer.put('c', 3);
    correctAnswer.put('5', 1);
    correctAnswer.put('6', 1);
    correctAnswer.put('7', 1);

    assertThat(service.calculateFrequency(value)).isEqualTo(correctAnswer);
  }

}
