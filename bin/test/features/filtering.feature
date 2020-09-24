#Author: william.barrera

Feature: Filtering clothes
  I want to be to view all of clothes I have selected


  Scenario: View only the selected items
    Given that actor has a list containing summer clothes
    And he has selected the item Printed Dress
    When he filters his list to show only selected clothe
    Then his list should contain Printed Dress

  Scenario Outline: Viewing the items by compare
    Given that actor has a list containing 'Printed Dress'
    And he has selected the clothe called 'Blouse'
    When he  press the button to compare the selected items
    Then his list should contain 'Printed Dress', 'Blouse'

