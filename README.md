# Structure of Programming Languages Project

This project compares the language differences between Haskell and Java.

## Example 1 - Purely Functional vs Object Oriented

Haskell is a purely functional language with no method for OOP. Java is entirely Object Oriented, as each method must be defined within some class.

To get the area of a square in Java, we create a Square class which has a method called getArea(). By intializing a Square object with a size, we can call the getArea() method on the object itself.

In a purely functional language such as Haskell, the data is separate from the implementation (functions). As a result, a getSquareArea function is defined which takes in the area of the square and returns the area.

## Example 2 - Type inference

The return and parameter types in Haskell are inferred during compile time, allowing function definitions without any type declarations.

Java does not have type inference for methods, requiring a specified return and parameter type for each method and parameter.

## Example 3 - Variable (Im)mutability

Haskell is unique in that all variables are immutable, meaning they cannot be changed after initialization. 

Java, like most other programming languages, does allow for reassigning variables after they have been initialized.
