# Java Advanced OOP & Algorithm Implementations

This repository contains university-level Java implementations focused on fundamental Object-Oriented Programming (OOP) concepts, generic structures, and algorithmic multi-dimensional array operations.

## Features & Modules

### 1. Java Generics & Wildcards
* **`KayitListesi<T>`**: A fully custom generic collection wrapper utilizing `ArrayList` under the hood to store generic elements safely.
* **`EtkinikUtils`**: Demonstrates the efficient use of:
  * **Unbounded Wildcards (`<?>`)** to process and print lists of unknown types dynamically.
  * **Upper Bounded Wildcards (`<? extends Number>`)** to perform safe mathematical calculations (summation) on any numeric sub-type (`Integer`, `Double`, etc.).

### 2. Main Entry Point (Driver Class)
* **`Main.java`**: Acts as the test execution layer. It initializes a custom `KayitListesi` for both `String` and `Double` data types, handles sequential record insertions, and triggers the `EtkinikUtils` methods to validate type-safe wildcard variance and custom collection processing.

## Tech Stack & Concepts
* **Language:** Java 8+
* **Core Concepts:** Generic Type Safety, Wildcard Multi-Variance, Custom Collection Wrappers, and Polymorphic Method Callbacks.
