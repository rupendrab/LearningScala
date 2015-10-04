scala> val x: Int = 1  
x: Int = 1  
  
scala> val x = 1  
x: Int = 1  
  
scala> :t x  
Int  
  
scala> val s = "hello"  
s: String = hello  
  
scala> val s = if (true) "hello" else "good bye"  
s: String = hello  
  
scala> :t if (true) "hello" else 1  
Any  
  
scala> :t if (false) "hello" else 1  
Any  
  
scala> :t if (true) 1 else 1.0  
Double  
  
scala> :t if (true) "hello" else List(1,2,3)  
java.io.Serializable  
  
scala> val s: String = if (true) "hello" else 1  
<console>:10: error: type mismatch;  
 found   : Int(1)  
 required: String  
       val s: String = if (true) "hello" else 1  
                                              ^  
  
scala> List(1,2,3)  
res7: List[Int] = List(1, 2, 3)  
  
scala> val s: String = if (false) "hello" else 1  
<console>:10: error: type mismatch;  
 found   : Int(1)  
 required: String  
       val s: String = if (false) "hello" else 1  
                                               ^  
  
scala>   
