#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Meli
Feature: Website of MercadoLibre
  I want to use this template for my feature file
	
	@SmokeTEst
	Scenario: Home page of MELI ARG
	Given Enter to the website mercadolibrecom
	When Pick ARG flag
	Then Validate Creá tu cuenta of Home page 
	And Validate ingresá text of Home page
	
	@SmokeTEst
	Scenario: Home page of MELI ARG
	Given Enter to the website mercadolibrecomar
	When Search for "play station 5"
	Then The results of searching "play station 5" is "true"
	
	@Meli3
	Scenario: Home page of MELI ARG
	Given Enter to the website mercadolibrecomar
	When Search for "iPhone 12 Pro"
	Then The results of searching "iPhone 12 Pro" is "true"
	
	@Meli4
	Scenario: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "play station 5" 
	When Search for the price between "180000" and "220000"
	Then The results is "true"
	
	@Meli5
	Scenario: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "play station 5" 
	When Search for the price between "500000" and "600000"
	Then The results is "false"
	
	@Meli6
	Scenario: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "iPhone 12 Pro"
	When Search for the price between "270000" and "350000"
	Then The results is "true"
	
	@Meli7
	Scenario: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "iPhone 12 Pro"
	When Search for the price between "600000" and "800000"
	Then The results is "false"
	
	@Meli8
	Scenario: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "iPhone 12 Pro"
	When Search for the price between 
	| 400000 | 500000 |
	| 500000 | 600000 |
	| 600000 | 700000 |
	Then The results is "true"
	
	@RegTest
	Scenario Outline: Results of searching iphone12PRo in mercadolibrecomar
	Given The result of searching "iPhone 12 Pro"
	When Search for the price betwen <initialPrice> and <price>
	Then The results is "true"
	
	Examples:
	|initialPrice|price  | 
	|400000			 |500000 |
	|500000			 |600000 |
	|600000			 |700000 |
	
	@RegTest
	Scenario Outline: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "Play Station 5"
	When Search for the price betwen <initialPrice> and <price>
	Then The results is "true"
	
	Examples:
	|initialPrice|price  | 
	|120000			 |140000 |
	|140000			 |170000 |
	|170000			 |200000 |
	