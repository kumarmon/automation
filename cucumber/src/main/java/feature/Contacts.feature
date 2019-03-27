Feature: Free CRM Contact Page

Scenario Outline: Create new Contact

Given User is already on login page
When title of login page is FreeCRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then User is on HomePage
Then User moves to new contact page
Then User enters "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:

	| username | password | firstname | lastname | position |
	| kumarmon | Kumar@2108 | Alistair| Cook | Captain |
	| kumarmon | Kumar@2108 | James | Anderson | Vice Captain|