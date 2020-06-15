Feature: Web Test

  @testWeb
  Scenario: Web test
    When I open browser to web page
    Then I save the text into db

  @testH2Spring
  Scenario: H2 Spring test
    When I control with H2 DB by Spring
