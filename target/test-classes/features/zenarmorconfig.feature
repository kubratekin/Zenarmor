@Zenarmor_02
Feature:Zenarmor Configuration

  Background:
    Given Client goes to url
    And Client enters username and password

  @US002_TC01
  Scenario: TC_01 General Menu

    When User navigates to Zenarmor and clicks Configuration
    And User verifies that Configuration page is displayed .User selects General Menu
    And User  clicks on Emulated netmap driver on Deployment mode
    And User clicks on refresh interfaces list
    And User selects Medium on Deployment menu
    And User selects options from dropdown
    And User clicks on Delete now button and verify the delete log message
    When User clicks create new token button
    And User clicks delete token and verify the message is displayed
    And User clicks yes and click on save changes
    Then User clicks on refresh button

  @US002_TC02
  Scenario: TC_02 Cloud Threat Intel

    When User  selects Cloud Threat Intel and verifies the page is displayed
    When User clicks Enabled option and verifies the message is displayed
    When User clicks ok and clicks clear cloud cache button and verify the message is displayed
    When User enters the domain name to the text box
    When User clicks cloud node name and verify the message Then  clicks  ok
    When User clicks re-check  nodes status
    When User clicks Privacy policy and verify the page is displayed
    When User clicks save changes and verify the message is displayed
    Then User click on refresh button

