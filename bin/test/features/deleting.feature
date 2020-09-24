#Author: william.barrera

Feature: Deleting items
  I want to be to delete the items once I am buy


  Scenario: Delete an cart item
    Given that actor has a list containing clothe Blouse, Printed Dress
    When He deletes the clothe called 'Blouse'
    Then his list should contain Printed Dress

  Scenario: Delete all the items
    Given that actor has a list containing clothe Blouse
    When He deletes the item called 'Blouse'
    And  He deletes the item called 'Printed Dress'
    Then his list in the cart should be empty