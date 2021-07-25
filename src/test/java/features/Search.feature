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
@MercadoLibre
Feature: Search on website of MercadoLibre
  I want to use this template for my feature file
  
  
	
	@SmokeTestMeli
	Scenario: Home page of MELI ARG
	Given User enter to the website mercadolibrecomar
	When User search for "play station 5"
	Then The results of searching "play station 5" is "true"
	
	@RegressionTestMeli2
	Scenario: Home page of MELI ARG
	Given User is on the website mercadolibrecom
	When User pick <country> flag
	Then Validate <text> of Home page is <status>
	
	Examples:
	| country | text                           | status |
	| arg 		| ofertas                        | true   |
	| arg     | Beneficios_de_Mercado_Puntos   | true   |
	| arg     | Descubrí                       | true   |
	| arg     | Las_mejores_tiendas_te_esperan | true   |
	| arg     | Categoria_populares            | true   |
	| arg     | Categoria_inpopulares          | fail   |
	
	
	@RegressionTestMeli
	Scenario Outline: Search products in mercadolibrecomar and with different validations
	Given User is on the result page of searching <product>
	When User search a product with price betwen <initialPrice> and <topprice>
	Then The result <text> are displayed <status>
	
	Examples:
	| product        | initialPrice | topprice | text          | status | 
	| iPhone 12 Pro  | 200000	 	    | 300000   | resultados    | true   |
	| iPhone 12 Pro  | 300000       | 400000   | resultados    | true   |
	| iPhone 12 Pro  | 1000000      | 1200000  | no resultados | fail   |
	| Play Station 5 | 120000       | 140000   | resultados    | true   |
	| Play Station 5 | 140000       | 160000   | resultados    | true   |
	| Play Station 5 | 700000       | 800000   | no resultados | fail   |
	
	
	
@RegressionTestFravega
	Scenario Outline: Search products in mercadolibrecomar and with different validations2
	Given User is on the result page of searching <product>Fravega
	When User search a product with price betwen <initialPrice> and <price>Fravega
	Then The result <text> are displayed <status>Fravega
	
	Examples:
	| product  | initialPrice | price  | text              | status | 
	| TV 4k    | 60000		    | 100000 | resultados        | true   |
	| TV 4k    | 100000       | 200000 | resultados        | true   |
	| TV 4k    | 200000       | 300000 | resultados        | true   |
	| TV 4k    | 600000       | 700000 | no hay resultados | fail   |
	| notebook | 50000        | 100000 | resultados        | true   |
	| notebook | 100000       | 200000 | resultados        | true   |
	| notebook | 200000       | 300000 | resultados        | true   |
	| notebook | 400000       | 500000 | no hay resultados | fail   |
	

  
	