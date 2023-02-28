# computer-shop

This program allows to construct and buy your own configuration of a computer,
using its parts - components.

All interaction occurs through the console.

## Functionality
 - interacting with the user through the console
 - displaying the list of available components in each group
 - making your chose and filling the customer's cart
 - calculating the total price of components and buying
 - customer's cart content removing from the shop storage

## Structure
- all components are inherited from Component class
- Component class has common fields (brand, model, price)
- every component has its own unique fields and characteristics
- Customer class holds the name and shopping cart as a list
- ShopService stores all the components through dao layer and has methods to communicate with the user
- program uses List to emulate working of DB
- PrintService and ConsoleReader class help to interact with a customer

## Technologies
- Java 17
- Maven
- checkstyle plugin

## Instructions
- download the project
- run using Maven
- follow the console tips
