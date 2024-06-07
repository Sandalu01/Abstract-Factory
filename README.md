# Abstract Factory Design Pattern in Java

This project demonstrates the use of the Abstract Factory design pattern to create families of related objects without specifying their concrete classes. The example provided focuses on creating different types of phones based on operating systems and brands.

## Project Structure

Abstract-Factory/
│
├── Enums/
│ ├── BrandType.java
│ └── osType.java
│
├── Process/
│ ├── AbstractPhoneFactory.java
│ ├── osFactory.java
│ ├── Phone.java
│ └── PhoneFactoryImplementation.java
│
├── Appnizilizer.java
│
└── README.md



## How to Run

1. Compile all Java files:
    ```bash
    javac Enums/*.java Process/*.java Appnizilizer.java
    ```

2. Run the main class:
    ```bash
    java Appnizilizer
    ```

## Explanation

The Abstract Factory design pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. This example creates different types of phones (Apple, Google, Samsung) based on the operating system (iOS, Android).

### Key Points:
- The `AbstractPhoneFactory` class provides a method to get the factory for a specific operating system.
- Each factory (e.g., `iOSFactory`, `AndroidFactory`) implements the `osFactory` interface and provides the concrete implementation to build specific phone brands.
- The `Appnizilizer` class demonstrates how to use these factories to create phones.

This design pattern helps in creating a scalable and maintainable codebase where new operating systems or phone brands can be added with minimal changes to the existing code.


## image1 


![Screenshot 2024-06-07 191719](https://github.com/Ran-som/Abstract-Factory/assets/108582011/df210668-2314-48d6-bef4-75cd101cb889)

## images 2
![Screenshot 2024-06-07 170213](https://github.com/Ran-som/Abstract-Factory/assets/108582011/22d11702-1a65-4313-a89c-4e575c878f78)
