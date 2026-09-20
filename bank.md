# Bank Management System

A desktop banking application built with **Java Swing** for the user interface and **JDBC** with **MySQL** for data storage. It covers everyday banking operations such as creating accounts, deposits, withdrawals, and checking balances.

## Features

- Create new customer accounts
- Secure login using account number and PIN
- Deposit and withdraw money
- Balance enquiry
- Transaction history / mini statement
- PIN change
- Data stored persistently in MySQL

## Tech Stack

| Layer     | Technology              |
|-----------|-------------------------|
| Language  | Java                    |
| UI        | Java Swing (AWT)        |
| Database  | MySQL                   |
| Access    | JDBC                    |
| Tools     | Git, GitHub             |

## Project Structure

```
Bank_management/
├── src/
│   ├── Login.java
│   ├── Signup.java
│   ├── Transactions.java
│   ├── Deposit.java
│   ├── Withdraw.java
│   ├── BalanceEnquiry.java
│   ├── MiniStatement.java
│   └── Conn.java          # JDBC connection class
└── README.md
```

> Update the file names above to match your actual classes.

## Getting Started

### Prerequisites

- JDK 8 or later
- MySQL Server
- MySQL Connector/J (JDBC driver) added to the project classpath
- Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans)

### Setup

1. Clone the repository
   ```bash
   git clone https://github.com/kartikthapa249-ux/Bank_management.git
   ```
2. Create the database and tables
   ```sql
   CREATE DATABASE bankmanagement;
   USE bankmanagement;

   CREATE TABLE login (
       account_no VARCHAR(20) PRIMARY KEY,
       pin VARCHAR(10) NOT NULL
   );

   CREATE TABLE bank (
       id INT AUTO_INCREMENT PRIMARY KEY,
       account_no VARCHAR(20),
       date DATETIME,
       type VARCHAR(20),
       amount DECIMAL(12,2)
   );
   ```
   Adjust the schema to match your code.
3. Set your MySQL credentials in the connection class
   ```java
   Connection c = DriverManager.getConnection(
       "jdbc:mysql://localhost:3306/bankmanagement", "YOUR_USERNAME", "YOUR_PASSWORD");
   ```
4. Add the MySQL Connector/J jar to your project libraries.
5. Run the `Login` class to start the application.

## How It Works

1. A new user signs up and receives an account number and PIN.
2. The user logs in with those credentials.
3. From the transactions screen, they can deposit, withdraw, check balance, or view a mini statement.
4. Every transaction is recorded in MySQL through JDBC.

## Future Improvements

- Hash PINs/passwords instead of storing them in plain text
- Use `PreparedStatement` everywhere to prevent SQL injection
- Fund transfer between accounts
- Admin panel and better input validation

## Author

**Kartik Thapa**
GitHub: [kartikthapa249-ux](https://github.com/kartikthapa249-ux)
