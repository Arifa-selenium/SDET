Feature: Testing of elearning portal

  @register
  Scenario Outline: Register to elearning portal
    Given I have opened the elearning page
    When Enter the "<Firstname>" "<Lastname>" "<Email>" "<Username>" "<Password1>" "<Password2>"
    Then Register is successful
    And Goto Inbox
    And Send Email

    Examples: 
      | Firstname | Lastname | Email          | Username   | Password1 | Password2 |
      | Arifa     | Khatoon  | test3@test.com | Arifa_ibmo | Arifa_ibm | Arifa_ibm |
