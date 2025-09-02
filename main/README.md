# Food Delivery App Project

This project simulates a food delivery application with various classes representing different entities involved in the process. Below is a brief overview of each class and its purpose.

## Classes Overview

1. **Employee**
   - Attributes: `name`, `id`, `salary`
   - Methods: 
     - `displayDetails()`: Displays the employee's details.

2. **Circle**
   - Attributes: `radius`
   - Methods: 
     - `calculateArea()`: Calculates the area of the circle.
     - `calculateCircumference()`: Calculates the circumference of the circle.
     - `displayDetails()`: Displays the area and circumference.

3. **Book**
   - Attributes: `title`, `author`, `price`
   - Methods: 
     - `displayDetails()`: Displays the book's details.

4. **Item**
   - Attributes: `itemCode`, `itemName`, `price`
   - Methods: 
     - `displayDetails()`: Shows item details.
     - `calculateTotalCost(int quantity)`: Calculates the total cost for a given quantity.

5. **MobilePhone**
   - Attributes: `brand`, `model`, `price`
   - Methods: 
     - `displayDetails()`: Shows all the details of the phone.

6. **Student**
   - Attributes: `name`, `rollNumber`, `marks`
   - Methods: 
     - `calculateGrade()`: Calculates the grade based on marks.
     - `displayDetails()`: Displays the student's details and grade.

7. **BankAccount**
   - Attributes: `accountHolder`, `accountNumber`, `balance`
   - Methods: 
     - `deposit(double amount)`: Deposits money into the account.
     - `withdraw(double amount)`: Withdraws money if sufficient balance exists.
     - `displayBalance()`: Displays the current balance.

8. **PalindromeChecker**
   - Attributes: `text`
   - Methods: 
     - `isPalindrome()`: Checks if the text is a palindrome.
     - `displayResult()`: Displays the result of the palindrome check.

9. **MovieTicket**
   - Attributes: `movieName`, `seatNumber`, `price`
   - Methods: 
     - `bookTicket()`: Assigns a seat and updates the price.
     - `displayDetails()`: Displays ticket details.

10. **CartItem**
    - Attributes: `itemName`, `price`, `quantity`
    - Methods: 
      - `addItem()`: Adds an item to the cart.
      - `removeItem()`: Removes an item from the cart.
      - `displayTotalCost()`: Displays the total cost of items in the cart.

## How to Run the Programs

1. Ensure you have a Java development environment set up.
2. Compile each Java file using the command:
   ```
   javac ClassName.java
   ```
3. Run the desired class using the command:
   ```
   java ClassName
   ```

This project provides a foundational understanding of object-oriented programming concepts such as classes, objects, encapsulation, and method definitions.