Feature: Swag Lab Login Page

  @smoke
  Scenario Outline: user will Login to Swag Lab Login page with valid credentials
    Given base url of swag lab
    And user will Give credentials of his '<UserName>', '<Password>'
    And user will click Login Button
    Then user will successfully login to products page
    Examples:
      | UserName      | Password     |
      | standard_user | secret_sauce |