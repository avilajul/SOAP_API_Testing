#author: Julián Ávila

Feature: add two integers

  Scenario Outline: check the result of adding two integers
    Given julian entered the calculator page
    When julian adds two positive integers
      | number1   | number2   |
      | <number1> | <number2> |
    Then julian gets the result of the sum
      | result   |
      | <result> |
    Examples:
      | number1 | number2 | result |
      | 1200    | 3787    | 4987   |