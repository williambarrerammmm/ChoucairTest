#Author: william.barrera

Feature: Completing items
  I want to be to view all of things I have completed


  Scenario: Mark a clothe as selected
    Given that actor has a list containing Buy some clothe
    When He completes the task called 'Buy'
    And He filters his list to show only selected items
    Then her todo list should contain Walk the dog

  Scenario: List of completed items should be empty if nothing has been completed
    Given that actor has a todo list containing Buy some clothe
    When the actor filters his list to show only Completed tasks
    Then his list should be empty

