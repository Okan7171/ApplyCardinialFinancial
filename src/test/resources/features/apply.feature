Feature: Apply Feature
  Background:
    Given the user should go to the Cardinalfinancial page
    Then the user should validate the correct page

    @wip
    Scenario: Careers at Cardinalfinancial
      Given the user should go to the "Careers" module
      When the user should go to the Find Your Career secondary module
      And the user should go to the "Software Engineer II  | Remote" sub-branch
      And the user should go to the Apply For This Position secondary sub-branch
      And the user should go to the Register page
      And the user should enter valid "olcayer25@gmail.com", "Cardinal1234" and "Cardinal1234"
      And the user should upload upload resume
      And the user should enter personal information


