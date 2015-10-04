scala> 1+1
res0: Int = 2

scala> 

scala> 1+3
res1: Int = 4

scala> var x: Int = 1 + 1
x: Int = 2

scala> x
res2: Int = 2

scala> x = x + 1
x: Int = 3

scala> var s: String = "Hello"
s: String = Hello

scala> s
res3: String = Hello

scala> s = s + " Scala"
s: String = Hello Scala

scala> if (true) x = x +1 else x = x -1

scala> x
res5: Int = 4

scala> x = if (true) x + 1 else x - 1
x: Int = 5

scala> x
res6: Int = 5

scala> :t x
Int

scala> :t 1
Int

scala> :t "hello"
String

scala> :t if (true) x + 1 else x - 1
Int

scala> var y = if (false) {
     | x + 1
     | } else
     | if (true) {
     |   x -1
     | } else {
     | x -2
     | }
y: Int = 4

scala> val z: Int = 1 + 1
z: Int = 2

scala> z = z + 1
<console>:11: error: reassignment to val
       z = z + 1
         ^

scala> 

