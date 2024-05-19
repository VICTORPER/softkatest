Feature: Consultar usuario por ID
  @Create
  Scenario: Get for id
    Given url 'https://reqres.in/api'
    When path '/users/1'
    And method get
    Then status 200
    And match response.data.id == 1
    * def contactId = response.data.id




