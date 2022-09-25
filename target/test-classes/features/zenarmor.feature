@Zenarmor_01
Feature:Zenarmor update

  Background:
    Given User goes to url
    And User enters username and password

  @US01_TC01
  Scenario: TC_01 Dashboard Menu

    And  User verifies that Dashboard page is displayed
    When User  clicks on Refresh Reports  button
    And User selects Refresh intervals dropdown and click on 5 minutes
    And User selects Reports intervals dropdown and click on Last 30 days
    And User clicks on Add&Sort Charts dropdown and select Web -Top Categories
    Then User clicks save changes and refresh the pages

  @US02_TC02
  Scenario:  TC_02 Add Filter Menu

    When User click Report Menu
    And User verifies Add filter is displayed
    And User clicks on Add  Filter button
    And User clicks on Application category dropdown and select Application name
    When User clicks textbox and type Google and click on Add button
    When User verifies Google is displayed
    Then User clicks "Remove this filter"

  @US03_TC03
  Scenario:TC_03 Mail_Maximize button
    When  User click Report Menu
    And User clicks the mail symbol
    And  User should see the message "This chart has been selected for Scheduled Reports."
    And User clicks OK button
    When User clicks the maximize sign and verifies the  part is maximized
    Then User clicks the dropdown and selects Top 5
    Then User close the max page

  @US04_TC04
  Scenario:TC_04 scrolling down

    When User select dashboard menu
    When User clicks the Network Management in Donut chart
    And User  scrolls down  and up to  Menu


  @US05_TC05
  Scenario Outline:TC_05  Session Live
    When User clicks on Reports  on Zenarmor segment and verifies  the Report Header is displayed
    And User clicks on Live sessions Explorer button
    And User select Protocol from Sort by dropdown
    And User selects descending from dropdown
    And User clicks on show columns  dropdown and unselect src mac
    And User clicks on the start time dropdown and select the "<date1>"
    And User clicks on the end time dropdown and select the "<date2>"
    And User selects source ip from filter by dropdown
    Then User clicks search button
    Then  Usr closes the page

    Examples:Report  Menu
      | date1      | date2      |
      | 2022-09-03 | 2022-09-04 |

  @US06_TC06
  Scenario: TC_06 Status Menu
    When User clicks on the status  segment
    And User Verifies that status page is displayed
    And User clicks check updates for Engine Version
    And User should see the message There are no updates available for you. You are using the latest Engine version.
    Then User clicks on the close button
    And User clicks on  cloud Agent boot button
    And User should see Configuration has been changes successfully message


  @US07_TC07
  Scenario Outline:TC_07 Policy Menu
    When User  clicks on the  policy menu and verify  policy page is visible
    And User deselects status and should see the message  You can not disable default policy.
    And  User clicks on actions and verify the security page is visible
    And User selects block phishing service button
    And User click on Exclusion part and enters "<link>" to the whitelist
    And User clicks add button and verify the link is added to the list
    And User clicks Action checkbox
    And User clicks on Save changes button
    Then User should see Configuration has been changed succesfully  toast container message

    Examples: Policy Menu
      | link           |
      | www.google.com |











