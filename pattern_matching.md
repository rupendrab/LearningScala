scala> // Pattern Matching

scala> def month_name(n: Int): String = 
     |   if (n == 1) {
     |     "Januar"
     |   else if (n == 2) {
<console>:4: error: ';' expected but 'else' found.
  else if (n == 2) {
  ^

scala> def month_name(n: Int): String = 
     |   if (n == 1) {
     |     "January"
     |   } else if (n == 2) {
     |     "February"
     |   } else {
     |     "Unknown"
     |   }
month_name: (n: Int)String

scala> month_name(1)
res0: String = January

scala> month_name(2)
res1: String = February

scala> month_name(3)
res2: String = Unknown

scala> month_name(1)
res3: String = January

scala> month_name(13)
res4: String = Unknown

scala> def monthName(n: Int): String =
     |   n match {
     |     case 1 => "January"
     |     case 2 => "February"
     |   }
monthName: (n: Int)String

scala> monthName(1)
res5: String = January

scala> monthName(2)
res6: String = February

scala> monthName(13)
scala.MatchError: 13 (of class java.lang.Integer)
  at .monthName(<console>:11)
  ... 43 elided

scala> monthName(13)
scala.MatchError: 13 (of class java.lang.Integer)
  at .monthName(<console>:11)
  ... 43 elided

scala> def monthName(n: Int): String =
     |   n match {
     |     case 1 => "January"
     |     case 2 => "February"
     |     case _ => "Unknown"
     |   }
monthName: (n: Int)String

scala> monthName(13)
res9: String = Unknown

scala> monthName(1)
res10: String = January

scala> monthName(2)
res11: String = February

scala> def daysInMonth(n: Int): Int = n match {
     |   case 1 | 3 | 5 | 7 | 8 | 10 
     | 
     | 
You typed two blank lines.  Starting a new command.

scala> 

scala> def daysInMonth(n: Int): Int = n match {
     |   case 1 | 3 | 5 | 7 | 8 | 10 | 12 => 31
     |   case 4 | 6 | 9 | 11 => 30
     |   case 2 => 28
     | }
daysInMonth: (n: Int)Int

scala> daysInMonth(1)
res12: Int = 31

scala> daysInMonth(12)
res13: Int = 31

scala> def whatIsIt(something: Any): String = something match {
     |   case 1 => "the number 1"
     |   case "hello" => "a greeting"
     |   case List(_,_,_) => "list of three values"
     |   case List(_,_) => "a list of two values"
     | }
whatIsIt: (something: Any)String

scala> 

scala> 

scala> whatIsIt(1)
res14: String = the number 1

scala> whatIsIt(List("Hello", "Goodbye"))
res15: String = a list of two values

scala> whatIsIt(List("Hello", "Goodbye", 2))
res16: String = list of three values

scala> whatIsIt(List("Hello", "Goodbye", 2, 4))
scala.MatchError: List(Hello, Goodbye, 2, 4) (of class scala.collection.immutable.$colon$colon)
  at .whatIsIt(<console>:10)
  ... 43 elided

scala> def whatIsIt(something: Any): String = something match {
     |   case n: Int => "The number " + n
     |   case s: String => "The string " + s
     |   case _ => 
     | "something else"
     | }
whatIsIt: (something: Any)String

scala> whatIsIt(3)
res18: String = The number 3

scala> whatIsIt(300)
res19: String = The number 300

scala> whatIsIt("hello")
res20: String = The string hello

scala> whatIsIt(List())
res21: String = something else

scala> def whatIsIt(something: Any): String = something match {
     |   case List(a,b,c) => "a list of three elements " + a + ", " + b + ", " + c
     |   case _ => "something else"
     | }
whatIsIt: (something: Any)String

scala> whatIsIt(1)
res22: String = something else

scala> whatIsIt("hello")
res23: String = something else

scala> whatIsIt(List(1,2,3))
res24: String = a list of three elements 1, 2, 3

scala> whatIsIt(List(1,2,"three"))
res25: String = a list of three elements 1, 2, three

scala> 

