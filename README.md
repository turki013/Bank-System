# Bank Management System
Overview :
The Bank Management System is a Java-based console application designed to provide core banking functionalities through a clean, menu-driven interface. The application utilizes Object-Oriented Programming (OOP) principles to encapsulate business logic, ensuring scalability and maintainability. This project serves as a practical implementation of foundational programming concepts while simulating real-world banking operations.

# **Features**
```
Deposit Funds: Allows secure addition of funds to the user's account.
Withdraw Funds: Enables users to withdraw money while maintaining balance integrity.
Balance Inquiry: Displays the current account balance dynamically.
Account Information Display: Provides detailed information about the account holder, including account number and name.
Session Termination: Exits the system gracefully, ensuring a clean shutdown.
```
## **Architecture and Design**
This project is structured around the core principles of software development :
```
Modular Design: Each functionality is encapsulated within dedicated methods for clarity and reusability.
Separation of Concerns: Business logic resides in the SystemBank class, while the user interface is handled via the main method.
Error Handling: Ensures invalid inputs are handled gracefully, maintaining program stability.
```
## **Technical Specifications**
Programming Language: Java
Core Concepts Implemented:
Object-Oriented Programming (OOP)
Iterative control with do-while loops
Decision-making using switch-case statements
Input/Output: Console-based for simplicity and ease of interaction.

## **Usage Instructions**
Prerequisites
```
Java Development Kit (JDK) installed and configured.
Optional: An Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse for debugging and execution.
Steps to Run
Clone or Download:

Clone the repository or download the project files to your local machine.
Compile:

Open a terminal or IDE and navigate to the project directory.
Compile the program with:

javac BankManagementSystem.java
```
Execute:
```
Run the compiled program using:

java BankManagementSystem
```
 Interact:
```
The application will display a menu prompting the user to choose actions. Input the number corresponding to your desired action.
```
## **Workflow**
The application operates in a loop to allow continuous interaction until the user decides to exit. The main menu provides the following options:

Deposit: Prompts the user to enter an amount, which is added to the current balance.
Withdraw: Checks if sufficient balance exists before deducting the specified amount.
Check Balance: Displays the current balance in a user-friendly format.
Display Account Info: Shows key details about the account, including the holder’s name and account number.
Exit: Terminates the application with a confirmation message.

## **Program Workflow**
Upon running the program, users will see a menu with five options:
Program Workflow
Upon running the program, users will see a menu with five options:
```
Welcome to the Bank System
1. Deposit
2. Withdraw
3. Check Balance
4. Display Account Info
5. Exit
Please select an option:
```
The user can select an option by entering the corresponding number. The system will execute the selected functionality and return to the main menu until the user chooses the exit option.



## **Example Execution**
Scenario:
```
Starting balance: 500
User selects 1. Deposit and enters 200.
New Balance: 700
User selects 2. Withdraw and enters 300.
New Balance: 400
User selects 3. Check Balance.
Output: "Your current balance is 400."
User selects 5. Exit.
Output: "Exiting... Goodbye!"
```
## **Future Enhancements**

This project lays the foundation for more advanced systems. Potential upgrades include:

Multi-Account Support: Enable management of multiple accounts within the same system.
Persistent Storage: Integrate file handling or a database for saving account details and transaction history.
Enhanced Security: Add authentication mechanisms like PIN or password verification.
GUI Integration: Transition to a graphical interface for a modern user experience.
Transaction History: Implement a log to track all deposits, withdrawals, and balance checks.

## **Code Structure**
SystemBank Class:
Contains core functionalities for managing account operations such as deposit, withdrawal, and balance checks.
Stores account information, ensuring encapsulation and data integrity.
Main Method:
Acts as the user interface, leveraging loops and switch-case logic to process user commands.

## **Learning Outcomes**
This project demonstrates:

Practical application of Object-Oriented Programming in Java.
Effective use of control structures (do-while, switch-case) for interactive systems.
Modular programming techniques for clean and maintainable code.
Real-world problem-solving by simulating banking operations.

## ***Author***
This project was developed to explore Java programming fundamentals, showcasing the integration of OOP principles with a user-friendly interface. It represents the starting point for more complex, enterprise-level applications.

