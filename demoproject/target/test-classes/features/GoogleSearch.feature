Feature: Google Search

Scenario: Search for BMW Canada
  Given I open Google homepage
  When I search for "bmw canada website"
  Then I click the BMW Canada link
  And I wait for 30 seconds
