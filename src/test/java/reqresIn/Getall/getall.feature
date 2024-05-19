Feature: User management in Reqres API

  Background:
    * url 'https://reqres.in/api'

  Scenario: Get the complete list of users and verify the deleted user is not present
    * call read("../delete/delete.feature@Create")
    Given path 'users'
    When method get
    Then status 200
    And match response.data[*].id != contactId