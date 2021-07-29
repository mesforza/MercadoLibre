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
	
	@RegressionTestMeli
	Scenario Outline: Search products in mercadolibrecomar and with different validations
	Given User is on the result page of searching <product>
	When User search a product with price betwen <initialPrice> and <topprice>
	Then The <results> are displayed <status>
	
	Examples:
	| product        | initialPrice | topprice | results       | status | 
	| iPhone 12 Pro  | 200000	 	    | 300000   | resultados    | true   |
	| iPhone 12 Pro  | 300000       | 400000   | resultados    | true   |
	| iPhone 12 Pro  | 1000000      | 1200000  | no resultados | fail   |
	| Play Station 5 | 120000       | 140000   | resultados    | true   |
	| Play Station 5 | 140000       | 160000   | resultados    | true   |
	| Play Station 5 | 700000       | 800000   | no resultados | fail   |
	
	@RegressionTestMeli2
	Scenario: Home page of MELI ARG
	Given User is on the website mercadolibrecom
	When User pick arg flag
	Then Validate ofertas text is present in HomePage
	And Validate Beneficios_de_Mercado_Puntos text is present in HomePage
	And Validate Descubrí text is present in HomePage
	And Validate Las_mejores_tiendas_te_esperan text is present in HomePage
	
	@RegressionTestMeli3 
	Scenario Outline: Search products in mercadolibrecomar and with different validations
	Given User is on the result page of searching <product>
	When User pick color <color> for the product in results page
	And User pick location <location> for the product
	And User pick condition <condition> for the product
	Then The <results> are displayed <status>
	
	Examples:
	| product        | color 			| location						| condition | results			| status | 
	| iPhone 12 Pro  | Gris	 	    | Capital Federal			| Nuevo		  | resultados	| true   |
	| iPhone 12 Pro  | Negro      | Bs.As. G.B.A. Norte	| Usado			| resultados	| true   |
	
	@RegressionTestMeli4
	Scenario Outline: Products page in mercadolibrecom and with different validations
	Given User is on the product page of searching <product>
	When User select second picture <picture2> for the product
	And User select third picture <picture3> for the product
	And User pick color <color> for the product in product page
	And User pick memory <memory> for the product
	And User add to favorite the product
	Then The message <message> is necesary login to proceed <status>
	And The button Im New is displayed <status2>
	
	Examples:
	| product        | picture2	| picture3 | color 					| memory	| message    																					   	| status | status2	|
	| iPhone 12 Pro  | grey			| 300000   | Grafito				| 128 GB	| ¡Hola! Para agregar favoritos, ingresá a tu cuenta			| true   | true			|
	| iPhone 12 Pro  | black		| 400000 	 | Oro						| 512 GB	| ¡Hola! Para agregar favoritos, ingresá a tu cuenta	    | true   | true			|
	| iPhone 12 Pro  | 1000000	| 1200000  | Plata					| 128 GB	| ¡Hola! Para agregar favoritos, ingresá a tu cuenta			| true   | true			|
	| iPhone 12 Pro	 | 120000		| 140000   | Azul pacífico	| 512 GB	| ¡Hola! Para agregar favoritos, ingresá a tu cuenta			| true   | true			|
	
	@RegressionTestMeli5
	Scenario Outline: Products page in mercadolibrecom and with different validations
	Given User is on the product page of searching <product>
	When User select second picture <picture2> for the product
	And User select third picture <picture3> for the product
	And User add to shopping cart the product
	Then The message <message> is necesary login to proceed <status>
	And The button Im New is displayed <status2>
	
	Examples:
	| product     	| picture2	| picture3 | message   														   	| status | status2	|
	| iPhone 12 Pro | grey			| 300000   | ¡Hola! Para comprar, ingresá a tu cuenta	| true   | true			|
	| iPhone 12 Pro | black			| 400000 	 | ¡Hola! Para comprar, ingresá a tu cuenta	| true   | true			|
	
	
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
  
	