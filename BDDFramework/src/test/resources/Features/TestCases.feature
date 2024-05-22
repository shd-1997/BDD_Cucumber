Feature: validating saucedemo website

  @test1
  Scenario: check login is successful with valid credentials
    Given user launches saucedemo website
    And user is on login page
    When user enters valid username and password
    And user clicks on login button
    Then user is navigated to home page
    And user closes the browser

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
