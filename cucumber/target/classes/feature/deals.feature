Feature: Deals data creation

Scenario: Free CRM Deal creation using data tables

Given User is already on login page
When title of login page is Free CRM
Then User enters username and password
| kumarmon | Kumar@2108 |
Then User clicks on login button
Then User is on HomePage
Then User moves to new deals page
Then User enters deals data
| testdeal | 50 | 10 |
Then close the browser
