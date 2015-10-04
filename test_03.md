scala> val x = 1
x: Int = 1

scala> val x: Int = 1
x: Int = 1

scala> def add(a: Int, b: Int): Int = a + b
add: (a: Int, b: Int)Int

scala> add(1,1)
res0: Int = 2

scala> def add(a,b) = a + b
<console>:1: error: ':' expected but ',' found.
def add(a,b) = a + b
         ^

scala> def add(a: Int, b: Int) = a + b
add: (a: Int, b: Int)Int

scala> add(1,2)
res1: Int = 3

scala> // Return cannot be inferred when the method is recursive

scala> def fib(n: Int) = if (n == 1 || n == 2) 1 else fib(n-1) + fib(n-2)
<console>:10: error: recursive method fib needs result type
       def fib(n: Int) = if (n == 1 || n == 2) 1 else fib(n-1) + fib(n-2)
                                                      ^

scala> def fib(n: Int): Int = if (n == 1 || n == 2) 1 else fib(n-1) + fib(n-2)
fib: (n: Int)Int

scala> fib(10)
res2: Int = 55

scala> // Methods that don't return anything

scala> println("hello")
hello

scala> :t println("hello")
Unit

scala> def printHello() = pritln("hello")
<console>:10: error: not found: value pritln
       def printHello() = pritln("hello")
                          ^

scala> def printHello() = println("hello")
printHello: ()Unit

scala> printHello
hello

scala> printHello()
hello

scala> ()

scala> :t ()
Unit

scala> def printHello = println("hello")
printHello: Unit

scala> printHello
hello

scala> printHello()
<console>:12: error: Unit does not take parameters
       printHello()
                 ^

scala> def x = 1
x: Int

scala> x
res9: Int = 1

scala> // Lazy evaluation with def; Uniform access principle

scala> 

