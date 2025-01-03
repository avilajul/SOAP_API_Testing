#author: Julián Ávila

Feature: multiply two integers

  Scenario Outline: check the result of multiplying two integers
    Given julian entered the calculator page
    When julian sends two positive integers
      | number1   | number2   |
      | <number1> | <number2> |
    Then julian gets the expected result
      | result   |
      | <result> |
    Examples:
      | number1 | number2 | result |
      | 45      | 3       | 135    |
