Feature: Put user on regres
  Background:
    * url 'https://reqres.in/api'
  Scenario: Put a user
    * call read("../get/reqres-in-get.feature@Create")
    And path '/users/1'+ contactId
    And request { name: 'morpheus', job: 'zion resident' }
    And method put
    Then status 200
    And match response.name == 'morpheus'
    And match response.job == 'zion resident'



