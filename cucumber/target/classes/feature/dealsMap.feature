Feature: Deals Map

Scenario: Create deals using maps in data table

Given User is already on login page
When title of login page is Free CRM
Then User enters username and password
| username | password |
| kumarmon | Kumar@2108 |
Then User clicks on login button
Then User is on HomePage
Then User moves to new deals page
Then User enters deals data
|title       | amount | probability | commission |
		| test deal1 | 1000 | 50 | 10 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |
Then close the browser