scala> // For Loop  
  
scala> for (i: Int <- 1 to 10) println("I'M AWESOME")  
I'M AWESOME  
I'M AWESOME  
I'M AWESOME  
I'M AWESOME  
I'M AWESOME  
I'M AWESOME  
I'M AWESOME  
I'M AWESOME  
I'M AWESOME  
I'M AWESOME  
  
scala> val original = List(1,2,3)  
original: List[Int] = List(1, 2, 3)  
  
scala> // Mutable  
  
scala> import collection.mutable.Mu  
MultiMap   MutableList  
  
scala> import collection.mutable.MutableList  
import collection.mutable.MutableList  
  
scala> val transformed = new MutableList[Int]  
transformed: scala.collection.mutable.MutableList[Int] = MutableList()  
  
scala> for (i: Int <- 0 until original.size) transformed += original(i) * 2  
  
scala> transformed  
res2: scala.collection.mutable.MutableList[Int] = MutableList(2, 4, 6)  
  
scala> transformed.cl  
clear   clone  
  
scala> transformed.cl  
clear   clone  
  
scala> transformed.clear  
  
scala> for (i <- original) transformed += i * 2  
  
scala> transformed  
res5: scala.collection.mutable.MutableList[Int] = MutableList(2, 4, 6)  
  
scala> for (i <- original) yield i * 2  
res6: List[Int] = List(2, 4, 6)  
  
scala> for (i <- List(1,2,3); j <- List(4,5,6)) yield i * j  
res7: List[Int] = List(4, 5, 6, 8, 10, 12, 12, 15, 18)  
  
scala> for {  
     |   i <- List(1,2,3)  
     |   j <- List(4,5,6)  
     | } yield i * j  
res8: List[Int] = List(4, 5, 6, 8, 10, 12, 12, 15, 18)  
  
scala> for {  
     |   i <- List(1,2,3)  
     |   j <- List(4,5,6)  
     |   product = i * j  
     |   if product % 2 == 0  
     | } yield product  
res9: List[Int] = List(4, 6, 8, 10, 12, 12, 18)  
  
scala>   
  
