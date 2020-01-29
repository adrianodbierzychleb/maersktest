Feature: Select Destination
  As a user I want to select wher i fly form and to,
  select a flight and fill in my details
  to get a booking.
  Scenario: Complete a Full booking from point A to point B
    Given I am able to select my flight location
    And Select my locations
    When I select my flight
    And I fill my details
    Then I click upon the submit button