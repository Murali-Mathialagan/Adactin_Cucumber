Feature: Hotel Booking In Adactin Application

Scenario: Login Functionality

Given user "adactin" The Application

When user Enter The "muralimariyan" In Username Textbox

And user Enter The "U0TZS3" In Password Textbox

Then user Click The Login Button And It Navigates To Search Hotel Module

Scenario: Search Hotel Functionality

When user Select The Location In Location Dropdown Field

And user Select The Hotels In Hotel Dropdown Field

And user Select The Roomtype In Roomtype Dropdown Field

And user Select The Number Of Rooms In Number Of Rooms Dropdown Field

And user Enter The "12/09/2022" In CheckIn Date Field

And user Enter The "15/09/2022" In Checkout Date Field

And user Select The Adults Per Room In Adults Per Room Dropdown Field

And user Select The Children Per Room In Children Per Room Dropdown Field

Then user Click The Search Button And It Navigates To Select Hotel Module

Scenario: Select Hotel Functionality

When user Click The Radio Button In Select Radio Button Field

Then user Click The Continue Button And It Navigates To Book A Hotel Module

Scenario: Book A Hotel Functionality

When user Enter The "Dhanush" In The First Name textbox

And user Enter The "Mariyan" In The Last Name Textbox

And user Enter The "Canada" In The Billing Address Textbox

And user Enter The "1234567890987654" In The Credit Card No. Textbox

And user Select The Credit Card Type In The Credit Card Type Dropdown Field

And user Select The Expiry Month In The Expiry Month Dropdown Field

And user Select The Expiry Year In The Expiry Year Dropdown Field

And user Enter The "345" In The CVV Number Textbox

Then user Click The Book Now Button And It Navigates To Confirmation Module































