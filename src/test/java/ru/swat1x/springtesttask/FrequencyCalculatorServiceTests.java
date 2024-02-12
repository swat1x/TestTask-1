package ru.swat1x.springtesttask;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.swat1x.frequencycalculator.service.FrequencyCalculatorService;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
class FrequencyCalculatorServiceTests {

  FrequencyCalculatorService service;

  @Test
  void frequencyCalculatingTest() {
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
