Feature: Hotel Booking in Adactin Application 

Scenario Outline: 

	Given user launch the application 
	When user enter the "<username>" in username field 
	And user enter the "<password>" in password field 
	Then user click on the login button It Navigates to the select homepage 
	
	Examples: 
	
		|username|password|
		|kArthik3073|L4ITAB|
		|Gowthami|3073|
		
		
		
		#Scenario: user search and select the room and details in the select Hotel page
		#When user select the hotel location
		#And user select the hotel
		#And user select the room type
		#And user select the number of rooms
		#And user select the check in date
		#And user select the check out update
		#And user select the adults per room
		#And user select the children per room
		#Then user click on the login button It Navigates to the select Hotelpage
		#
		#
		#Scenario: user confirm the Room in search Hotel page
		#When user confirmation the hotel location
		#Then user click the continue Button IT Navigates to the select HotelPage
		#
		#
		#Scenario:
		#When user Enter the Valid First Name
		#And user Enter the Valid Last Name
		#And user Enter the Billing Address
		#And user Enter the Valid Credit card Number
		#And user choose the Credit card Type
		#And user select the select Month 
		#And user select the year
		#And user the cvv number
		#Then user book now the hotel
		#
		#Scenario:
		#Then user the logout page
		
		
		
		
		
		
		
		
		
		
		
		
