# ATM Machine Simulator (Java, OOP)

A fully functional ATM machine simulator built using Java and object-oriented programming principles. Enables secure, console-based banking interactions with clear structure and modularity.

---

##  Features

- **Account Types**  
  - Savings Account (enforces minimum balance)  
  - Current Account (supports overdraft)

- **Secure Transactions**  
  - PIN (simulated) verification  
  - Robust input validation

- **Banking Operations**  
  - Cash withdrawal  
  - Cash deposit  
  - Balance inquiry

- **Error Handling**  
  - Handles invalid inputs (e.g., negative amounts)  
  - Prevents overdrawing and enforces safety limits

---

##  How to Run

```bash
git clone https://github.com/yourusername/CODSOFT.git
cd CODSOFT/Task3-ATM_Machine
javac ATM_Machine.java
java ATM_Machine

Design Overview
classDiagram
    class ATM_Machine {
        +main()
    }

    abstract class Account {
        -balance
        +deposit()
        +checkBalance()
        +withdraw()*
    }

    class Saving {
        -minBalance
        +withdraw()
    }

    class Current {
        +withdraw()
    }

    ATM_Machine --> Account
    Account <|-- Saving
    Account <|-- Current

Highlighted Principles
SOLID Design

Clean architecture and object separation

Structured error handling and input safety measures

License & Author
License: MIT (free for personal and educational use)

Author: Krishna Agarwal — Java Intern @ CodSoft
