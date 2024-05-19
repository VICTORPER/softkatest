@ignore
Feature: Reusable scenarios for post a user

    Background:
    * url "https://reqres.in"
    * path "/api/users/"
    * def var = { "username": "vic", "email": "victor@gmail.com", "password": "123" }
  @Create
  Scenario: Post a user
    Given request var
    When method post
    Then status 201
    And def contactId = response.id


