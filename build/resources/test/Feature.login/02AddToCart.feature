Feature: Add to Cart
  @smoke
  Scenario: User will add to cart his prferred products
    Given user in products page
    And user will also choose Sauce Labs Bike Light
    And user will add to cart his preferred more items from cart
    Then user will go to cart section to checkout
