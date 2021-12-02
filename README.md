# Algebraic Data Types

Data defined in terms of logical ors and logical ands

A is B or C. A sum type

``` scala
sealed trait A
final case class B() extends A
final case class C() extends A
```

A is B and C. A product type

``` scala
final case class A(b: B, c: C)
```


# Structural Recursion

Any transformation on an algebraic data type can be written using structural recursion

Two implementation strategies in Scala:

- pattern matching
- dynamic dispatch


## Pattern Matching

A is B or C

``` scala
anA match {
  case B() => ???
  case C() => ???
}
```

A is B and C

``` scala
case A(b, c) => ???
```


## Dynamic Dispatch

A is B or C

``` scala
sealed trait A {
  def aMethod: D
}
final case class B() extends A { 
  def aMethod: D = ???
}
final case class C() extends A {
  def aMethod: D = ???
}
```

A is B and C

``` scala
final case class A(b: B, c: C) {
  def aMethod: D = ???
}
```


## Recursion rule

When the data is recursive the method is recursive in the same place.



# Companion Object

An object with
- the same name as some type
- in the same file as the type

By convention used in Scala to hold constructors (and other things). Kinda like static methods.


# Apply method

If an object has a method called `apply` you can call that object as if it was a function (i.e. without naming the method `apply` explicitly)

``` scala
object Applyable {
  def apply(x: Int): Unit = println(s"The magic number is $x")
}

Applyable.apply(42)
Applyable(42)
```

(Something to think about: are functions, in Scala, objects?)
