Overview
A fully-functional ATM machine simulator implementing core banking operations using Java and Object-Oriented Programming principles. Developed as part of the Java learning path.

Features
💳 Account Types

Savings Account (minimum balance enforcement)

Current Account (overdraft facility)

🔐 Secure Transactions

PIN verification (simulated)

Input validation

💰 Banking Operations

Cash withdrawal

Cash deposit

Balance inquiry

🛡️ Error Handling

Invalid amount detection

Minimum balance protection

Type-safe input validation

-- Technical Implementation
Code

classDiagram
    class ATM_Machine{
        +main()
    }
    
    abstract class Account{
        -balance
        +deposit()
        +checkBalance()
        +withdraw()*
    }
    
    class Saving{
        -minBalance
        +withdraw()
    }
    
    class Current{
        +withdraw()
    }
    
    ATM_Machine --> Account
    Account <|-- Saving
    Account <|-- Current

How to Run
Clone the repository:

git clone https://github.com/yourusername/ATM-Interface-Java.git

Compile and run:

javac ATM_Machine.java
java ATM_Machine

Best Practices Demonstrated
SOLID Principles

Encapsulation

Polymorphism

Exception Handling

Clean Code Architecture

Future Enhancements
Database integration

Transaction history

GUI implementation

Multi-user support

License
MIT License - Free for educational and personal use