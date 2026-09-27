# Mars Colony System

## Assignment 2 — Creational Design Patterns

### Factory Method & Abstract Factory

## 1. Overview

This project demonstrates two creational design patterns:
* Factory Method
* Abstract Factory

The project uses the Mars Colony domain.
Factory Method is used to create one type of product: Robot.
Abstract Factory is used to create a family of related products: Robot, Habitat, and Vehicle.
The main goal is to separate object creation from client code and reduce direct dependency on concrete classes.

## 2. Domain

The system represents different types of Mars colonies.
The project contains two main colony families:

* Mining Colony
* Research Colony

A Mining Colony uses mining-related robots, habitats, and vehicles.
A Research Colony uses exploration and research-related robots, habitats, and vehicles.

## 3. Factory Method

Factory Method defines an interface for creating an object in a superclass while allowing subclasses to decide which concrete object to create.
In this project, `Robot` is the Product interface.

The Concrete Products are:

* `MiningRobot`
* `MedicalRobot`
* `ExplorationRobot`

The Creator is `RobotCreator`.

The Concrete Creators are:

* `MiningRobotCreator`
* `MedicalRobotCreator`
* `ExplorationRobotCreator`

The business method `startMission()` uses the `Robot` interface instead of depending on a concrete robot.

The structure is:

```text
RobotCreator
    |
    |-- MiningRobotCreator ------> MiningRobot
    |
    |-- MedicalRobotCreator -----> MedicalRobot
    |
    |-- ExplorationRobotCreator -> ExplorationRobot
```

Factory Method relies mainly on inheritance because Concrete Creators extend the abstract Creator and override the factory method.

## 4. Abstract Factory

Abstract Factory provides an interface for creating families of related products without specifying their concrete classes.

In this project, the Abstract Factory is `ColonyFactory`.

It creates three related products:

* `Robot`
* `Habitat`
* `Vehicle`

The Concrete Factories are:

* `MiningColonyFactory`
* `ResearchColonyFactory`

The structure is:

```text
ColonyFactory
    |
    |-- MiningColonyFactory
    |       |-- MiningRobot
    |       |-- MiningHabitat
    |       `-- MiningVehicle
    |
    `-- ResearchColonyFactory
            |-- ExplorationRobot
            |-- ResearchHabitat
            `-- ResearchVehicle
```

Abstract Factory relies on composition because `ColonyClient` receives a `ColonyFactory` through its constructor and uses that factory to create the products.

## 5. Factory Method vs Abstract Factory

Factory Method creates one product and delegates its creation to subclasses.

Abstract Factory creates a family of related products and keeps the products compatible with each other.

In this project:

```text
Factory Method
RobotCreator
     ↓
   Robot
```

```text
Abstract Factory
ColonyFactory
     ↓
Robot + Habitat + Vehicle
```

Factory Method focuses on one product type.

Abstract Factory focuses on switching a complete product family.

## 6. SOLID Principles

### Single Responsibility Principle

Object creation is separated from the code that uses the objects.
Concrete creators are responsible for creating specific robots.
Concrete factories are responsible for creating specific colony families.
The client is responsible only for using the products.

### Open/Closed Principle

The system can be extended with new product implementations without changing existing client code.
For example, a new robot type can be added with a new Concrete Product and Concrete Creator.
A new colony family can be added by creating another Concrete Factory.
Existing clients can continue to work with the interfaces.

## 7. Client and Concrete Classes

The client does not directly create concrete products.
For Factory Method, the client works with `RobotCreator`.
For Abstract Factory, `ColonyClient` works with `ColonyFactory`.
The concrete family is selected in one place in `Main`.

Example:

ColonyFactory factory = new MiningColonyFactory();


The client does not need to know the concrete classes created by the factory.

## 8. Project Structure

```text
src/
└── main/
    └── java/
        └── org.example/
            ├── Main.java
            │
            ├── factorymethod/
            │   ├── Robot.java
            │   ├── MiningRobot.java
            │   ├── MedicalRobot.java
            │   ├── ExplorationRobot.java
            │   ├── RobotCreator.java
            │   ├── MiningRobotCreator.java
            │   ├── MedicalRobotCreator.java
            │   └── ExplorationRobotCreator.java
            │
            └── abstractfactory/
                ├── Robot.java
                ├── Habitat.java
                ├── Vehicle.java
                ├── MiningRobot.java
                ├── MiningHabitat.java
                ├── MiningVehicle.java
                ├── ExplorationRobot.java
                ├── ResearchHabitat.java
                ├── ResearchVehicle.java
                ├── ColonyFactory.java
                ├── MiningColonyFactory.java
                ├── ResearchColonyFactory.java
                └── ColonyClient.java
```

## 9. Advantages

Factory Method separates product creation from client code and makes it easier to introduce new product types.
Abstract Factory allows the application to switch between complete product families while keeping related products compatible.
Both patterns reduce direct dependency on concrete product classes.

## 10. Disadvantages

Factory Method can increase the number of classes because each product type may require a Concrete Creator.
Abstract Factory can add complexity when the project is small.
Adding a new product category to an Abstract Factory requires changing the Abstract Factory interface and all Concrete Factories.
Therefore, these patterns should be used when their flexibility and separation of responsibilities are useful.

## 11. When to Use

Factory Method is appropriate when the system needs to create different versions of one product and the exact concrete type should be decided by subclasses.
Abstract Factory is appropriate when the system needs to create several related products as a consistent family.
Abstract Factory is especially useful when the whole product family may need to be switched.

## 13. Author

Khanzada Nyshanbek Adilqyzy
