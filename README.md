# 🚲 Bike Rental System

## 📖 Project Overview

The **Bike Rental System** is a console-based application developed using **Core Java** that simulates a real-world bike rental service. It allows administrators to manage bike inventory while enabling customers to rent and return bikes through a simple menu-driven interface.

The project is built to demonstrate the practical implementation of **Object-Oriented Programming (OOP)** concepts and the **Java Collections Framework**. All application data is managed in memory using Java collections without relying on databases or external frameworks.

---

## 🛠 Tech Stack

- **Language:** Java
- **IDE:** Eclipse IDE
- **Core Concepts:**
  - Object-Oriented Programming (OOP)
    - Encapsulation
    - Inheritance
    - Polymorphism
    - Abstraction
    - Interfaces
  - Java Collections Framework
    - ArrayList
    - HashMap
  - Exception Handling
  - Method Overriding
  - Constructor Chaining

---

## 🔄 Project Workflow

```text
                    START
                      │
                      ▼
          Bike Rental System Menu
                      │
         ┌────────────┴────────────┐
         │                         │
         ▼                         ▼
     Admin Module             Customer Module
         │                         │
         │                         │
 ┌───────┼────────┐        ┌────────┼─────────┐
 │       │        │        │        │         │
 ▼       ▼        ▼        ▼        ▼         ▼
Add    Remove   Search   View     Rent     Return
Bike    Bike     Bike    Bikes    Bike      Bike
 │       │        │        │        │         │
 └──────────────┬──────────┘        │         │
                ▼                   ▼         ▼
        Bike Collection      Create Rental   Update
       (ArrayList<Bike>)        Record      Availability
                │                   │
                └───────────┬───────┘
                            ▼
                  Rental Collection
               (ArrayList<Rental>)
                            │
                            ▼
                  Display Rental History
                            │
                            ▼
                           EXIT
```

### Admin Workflow

- Add a new bike
- Remove an existing bike
- View all registered bikes
- Search a bike using its ID

### Customer Workflow

- View available bikes
- Rent a bike
- Return a rented bike
- View rental history

### Rental Process

1. Customer selects a bike.
2. System verifies bike availability.
3. Rental amount is calculated based on bike type and rental duration.
4. Bike status is updated to **Rented**.
5. A rental record is created and stored.
6. Upon return, bike availability is restored.

---
