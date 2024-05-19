Feature: Delete user on regres
  @Create
  Scenario: Delete a user
    * call read("../get/reqres-in-get.feature@Create")
    Given url  "https://reqres.in" + "/api/users" + contactId
    When method delete
    Then status 204
    And def contactId = response.id