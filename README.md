# Head First Design Patterns

## OO Basics

1. Abstraction
2. Encapsulation
3. Polymorphism
4. Inheritance

## OO Principles

1. Encapsulate what varies
2. Favor composition over inheritance
3. Program to interfaces, not implementations
4. Strive for loosely coupled designs between objects that interact
5. Classes should be open for extension, but closed for modification
6. Depend on abstractions, do not depend on concrete classes

## OO Patterns

### 1. Strategy

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy
lets the algorithm vary independently from clients that use it.

### 2. Observer

The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all it's
dependents are notified and updated manually.

### 3. Decorator

The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible
alternative to subclassing for extending functionality.

### 4. Factory Method

The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to
instantiate. Factory Method lets a class defer instantiation to subclasses.

### 5. Singleton

The Singleton Pattern ensures a class only has one instance and provides a global point of access to it.

### 6. Command

The Command Pattern encapsulates a request as an object, thereby letting you parameterize other objects with different
requests, queue or log requests, and support undoable operations

### 7. Adapter

The Adapter Pattern converts the interface of a class into another interface the clients expect. Adapter lets classes
work together that couldn't otherwise because of incompatible interfaces.

### 8.Facade

The Facade Patterns provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher level
interface that makes the subsystem easier to use.

### 9. Template Method

The Template Method pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

### 10. Iterator

The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its
underlying representation.

### 11. Composite

The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. Composite
lets clients treat individual objects and composition of objects uniformly.

### 12. State

The State Pattern allows an object to alter its behavior when its internal state changes. The object will appear to
change its class.

### 13. Proxy

The Proxy Pattern provides a surrogate or placeholder for another object to control access to it.

### 14. Compound

The Compound Pattern is a pattern of patterns working together.