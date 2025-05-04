
@tag
 @Register
Feature: User Registration / Contact Us Functionality
  

  @tag1
  Scenario: Submit contact details successfully
    Given User is on the Casio India Register Us page
    When User enters the following details:
      | Email      								| Mobile       | Gender    | Birthdate  |Aniversary Date	|
      | yogeshbogar099@gmail.com  | 9209903161   | Male  		 | 27/09/1995 |14/05/2025				|
    And User submits the contact form
    Then A success message should be displayed
  
  