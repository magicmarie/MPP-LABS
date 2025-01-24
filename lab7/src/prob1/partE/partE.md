## PART D

```aiignore
Key Features of Java SE 8 to Handle the Diamond Problem
Default Methods: Introduced in interfaces to provide a method body, enabling behavioral multiple inheritance.
Explicit Override:
A class or interface inheriting conflicting methods must explicitly override and resolve the conflict.
Super Keyword for Default Methods:
Use InterfaceName.super.method() to specify which parent interface's method to invoke.
```

Scenario i: When D is a class, and A, B, and C are interfaces
In this case:

Abstract Method in Interface A:

If A defines method() as an abstract method, both B and C must implement it or declare it as a default method.
When D implements both B and C, the implementation provided by either B or C will be available to D.
If both B and C provide their own default implementations, Java forces D to explicitly override method() to resolve the conflict.
Default Methods in Java SE 8:

A default method in an interface provides a method body, enabling "behavioral" multiple inheritance.
Java resolves ambiguity in case of conflicts by enforcing rules:
Explicit Override in D: If both B and C provide a default implementation, D must explicitly override method() and specify which version to use.

Scenario ii: When D is an interface
If D is also an interface, the rules are slightly different:

If both B and C provide conflicting default methods, D must explicitly declare and override the method to resolve the ambiguity.
If D does not resolve the conflict, any class implementing D will be required to override the conflicting method.

- Diamond problem and how Java 8 now supports multiple inheritance;

a. When the type D is a class and A, B, C are interfaces.

```aiignore
- Java resolves the diamond conflict by requiring D to explicitly override 
the conflicting method by providing its own implementation OR specifying which implementation to call using the super keyword.
```

b. When the type D is an interface also

```
- When D is an interface, Java 8 allows D to declare a default method to resolve the conflict.
If D doesn't resolve it, then it must be implemented by its implementating classes.
```