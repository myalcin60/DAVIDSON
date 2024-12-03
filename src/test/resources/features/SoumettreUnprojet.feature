@candidat
@davidson
Feature: User must be able to fill out and submit the candidate form

  Background:
    Given Go to url

  Scenario Outline: Filling out and submitting the candidate form
    Given User is on the Soumettre's project page
    When User fills in the required "<candidat>""<sector>""<city>""<subject>""<firstName>""<lastName>""<email>""<phone>""<message>"  on the form
    And User clicks on the Send button
    Then User should see a confirmation that the nomination has been sent successfully
    Examples:
      | candidat  | sector     | city      | subject           | firstName | lastName | email            | phone    | message |
      | candidate | Healthcare | Martigues | Demander un appel | Jhon      | Dave     | jhon@yopmail.com | 12345678 | example |

