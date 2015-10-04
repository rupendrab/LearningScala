scala> // Handle exceptions with patterns  
  
scala> def dumb(n: Int) = n match {  
     |   1 => "success!"  
<console>:2: error: 'case' expected but integer literal found.  
  1 => "success!"  
  ^  
  
scala> def dumb(n: Int) = n match {  
     |   case 1 => "success!"  
     | }  
dumb: (n: Int)String  
  
scala> dumb(1)  
res0: String = success!  
  
scala> dumb(2)  
scala.MatchError: 2 (of class java.lang.Integer)  
  at .dumb(<console>:10)  
  ... 43 elided  
  
scala> "1".toInt  
res2: Int = 1  
  
scala> "not a number".toInt  
java.lang.NumberFormatException: For input string: "not a number"  
  at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)  
  at java.lang.Integer.parseInt(Integer.java:492)  
  at java.lang.Integer.parseInt(Integer.java:527)  
  at scala.collection.immutable.StringLike$class.toInt(StringLike.scala:272)  
  at scala.collection.immutable.StringOps.toInt(StringOps.scala:30)  
  ... 43 elided  
  
scala> def parseInt(s: String): Int = try {  
     |   s.toInt  
     | } catch {  
     |   case e: NumberFormatException => 0  
     | }  
parseInt: (s: String)Int  
  
scala> parseInt("1")  
res4: Int = 1  
  
scala> parseInt("1.2")  
res5: Int = 0  
  
scala> parseInt("not a number")  
res6: Int = 0  
  
scala> parseInt("-20")  
res7: Int = -20  
  
scala> parseInt("hello")  
res8: Int = 0  
  
scala> def parseInt(s: String): Int = try {  
     |   s.toInt  
     | } catch {  
     |   case e: NumberFormatException => 0  
     |   case _ => 0  
     | }  
<console>:14: warning: This catches all Throwables. If this is really intended, use `case _ : Throwable` to clear this warning.  
         case _ => 0  
              ^  
parseInt: (s: String)Int  
  
scala> def parseInt(s: String): Option[Int] = try {  
     |   Some(s.toInt)  
     | } catch {  
     |   case e: NumberFormatException => None  
     | }  
parseInt: (s: String)Option[Int]  
  
scala> parseInt("100")  
res9: Option[Int] = Some(100)  
  
scala> parseInt("xx")  
res10: Option[Int] = None  
  
scala> parseInt("100")  
res11: Option[Int] = Some(100)  
  
scala>   
  
