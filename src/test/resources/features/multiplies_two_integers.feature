#author: Julián Ávila

Feature: multiply two integers
  Scenario Outline: check the result of multiplying two integers
    Given julian entered the calculator page
    When julian sends two positive integers
    |multiplying  |multiplier  |
    |<multiplying>|<multiplier>|
    Then julian gets the expected result
    |result  |
    |<result>|
    Examples:
    |multiplying|multiplier|result|
    |45         |3         |135   |
