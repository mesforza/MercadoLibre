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
  
  #Background:
	#Given validate the browser
	#When Browser is triggered
	#Then check if browser is started
	
	@RegressionTest2
	Scenario: Home page of MELI ARG
	Given Enter to the website mercadolibrecom
	When Pick ARG flag
	Then Validate Creá tu cuenta of Home page 
	And Validate ingresá text of Home page
	
	@MobileTest
	Scenario: Home page of MELI ARG
	Given Enter to the website mercadolibrecomar
	When Search for "play station 5"
	Then The results of searching "play station 5" is "true"
	
	@MobileTest
	Scenario: Home page of MELI ARG
	Given Enter to the website mercadolibrecomar
	When Search for "iPhone 12 Pro"
	Then The results of searching "iPhone 12 Pro" is "true"
	
	@WebTest
	Scenario: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "play station 5" 
	When Search for the price between "180000" and "220000"
	Then The results is "true"
	
	@WebTest
	Scenario: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "play station 5" 
	When Search for the price between "500000" and "600000"
	Then The results is "false"
	
	@WebTest
	Scenario: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "iPhone 12 Pro"
	When Search for the price between "270000" and "350000"
	Then The results is "true"
	
	@WebTest
	Scenario: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "iPhone 12 Pro"
	When Search for the price between "600000" and "800000"
	Then The results is "false"
	
	@RegressionTest
	Scenario: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "iPhone 12 Pro"
	When Search for the price between 
	| 400000 | 500000 |
	| 500000 | 600000 |
	| 600000 | 700000 |
	Then The results is "true"
	
	@RegressionTest
	Scenario Outline: Results of searching iphone12PRo in mercadolibrecomar
	Given The result of searching "iPhone 12 Pro"
	When Search for the price betwen <initialPrice> and <price>
	Then The results is "true"
	
	Examples:
	|initialPrice|price  | 
	|400000      |500000 |
	|500000      |600000 |
	|600000      |700000 |
	
	@RegressionTest
	Scenario Outline: Results of searching ps5 in mercadolibrecomar
	Given The result of searching "Play Station 5"
	When Search for the price betwen <initialPrice> and <price>
	Then The results is "true"
	
	Examples:
	|initialPrice|price  | 
	|120000      |140000 |
	|140000      |170000 |
	|170000	     |200000 |
	