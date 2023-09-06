 @smoke
Feature:checkout-This feature will allow guest user to check out


  Scenario: guest user could proceed to check out
    Given The Guest user open edge browser,navigate to website and Login
    And   The Guest user select lowest price item and add it to cart
    When  The Guest user  Proceed to checkout
    And   The Guest user Add required data in your information screen"name","lastname","zipcode"
    And   The Guest user Complete checkout process
    Then  The Guest user complete order on