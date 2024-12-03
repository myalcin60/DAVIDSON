Feature: Site Navigation and Logo Verification
  As a user
  I want to verify the site logo is visible on all pages
  And ensure clicking it returns to the homepage

  Background:
    Given Go to url
    Then User should see the site logo

    @logo
    @davidson
  Scenario Outline: Navigate to each page and verify the logo redirects to the homepage
    Given User is on the "<pages>" page
    When User clicks on the site logo
    Then User shoulds be redirected to the homepage
    Examples:
      |pages|
      | Soumettre Un Projet |
      | Nous rejoindre      |
      | Filiales            |


