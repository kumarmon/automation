Feature: Login Feature

#without examples keyword

#Scenario: Login Test Scenario
#
#Given User is already on login page
#When title of login page is FreeCRM
#Then User enters "kumarmon" and "Kumar@2108"
#Then User clicks on login button
#Then User is on HomePage


#With Examples Keyword
Scenario Outline: Login Test Scenario

Given User is already on login page
When title of login page is FreeCRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then User is on HomePage
Then close the browser

Examples:

	| username | password  |
	| kumarmon | Kumar@2108|
	| tom      | Tom@123   |
