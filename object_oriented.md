usxxbandyrm1:sandbox bandyr$ sbt  
-sbt-create  
[info] Loading global plugins from /Users/bandyr/.sbt/0.13/plugins  
[info] Set current project to sandbox (in build file:/Users/bandyr/Documents/scalacode/test/src/sandbox/)  
>   
>   
>   
> run  
[info] Compiling 1 Scala source to /Users/bandyr/Documents/scalacode/test/src/sandbox/target/scala-2.11/classes...  
[info] Running calculator.Calculator   
[error] (run-main-0) java.lang.IllegalArgumentException: Usage: Calculator <expression>  
java.lang.IllegalArgumentException: Usage: Calculator <expression>  
	at calculator.Calculator$.main(Calculator.scala:59)  
	at calculator.Calculator.main(Calculator.scala)  
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)  
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)  
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)  
	at java.lang.reflect.Method.invoke(Method.java:606)  
[trace] Stack trace suppressed: run last compile:run for the full output.  
java.lang.RuntimeException: Nonzero exit code: 1  
	at scala.sys.package$.error(package.scala:27)  
[trace] Stack trace suppressed: run last compile:run for the full output.  
[error] (compile:run) Nonzero exit code: 1  
[error] Total time: 4 s, completed Oct 4, 2015 9:32:21 AM  
>   
>   
>   
>   
> run "1 1 +"  
[info] Running calculator.Calculator 1 1 +  
2  
[success] Total time: 0 s, completed Oct 4, 2015 9:32:30 AM  
> run-main calculator.Calculator "1 1 +"  
[info] Running calculator.Calculator 1 1 +  
2  
[success] Total time: 0 s, completed Oct 4, 2015 9:32:51 AM  
>   
>   
> compile  
[info] Compiling 1 Scala source to /Users/bandyr/Documents/scalacode/test/src/sandbox/target/scala-2.11/classes...  
[success] Total time: 0 s, completed Oct 4, 2015 9:34:34 AM  
>   
>   
> console  
[info] Starting scala interpreter...  
[info]   
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_60).  
Type in expressions to have them evaluated.  
Type :help for more information.  
  
scala>   
  
scala>   
  
scala>   
  
scala> import cookbook.Cookbook  
import cookbook.Cookbook  
  
scala> new Cookbook  
res0: cookbook.Cookbook = cookbook.Cookbook@186952b0  
  
scala> res0  
res1: cookbook.Cookbook = cookbook.Cookbook@186952b0  
  
scala> sys.exit  
  
Exception: sbt.TrapExitSecurityException thrown from the UncaughtExceptionHandler in thread "run-main-4"  
  
[success] Total time: 40 s, completed Oct 4, 2015 9:36:13 AM  
>   
>   
> console  
[info] Compiling 1 Scala source to /Users/bandyr/Documents/scalacode/test/src/sandbox/target/scala-2.11/classes...  
[info] Starting scala interpreter...  
[info]   
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_60).  
Type in expressions to have them evaluated.  
Type :help for more information.  
  
scala> import cookbook.{Recipe, Cookbook}  
import cookbook.{Recipe, Cookbook}  
  
scala> import cookbook._  
import cookbook._  
  
scala> val cookbook = new Cookbook  
cookbook: cookbook.Cookbook = cookbook.Cookbook@4300c26  
  
scala> val recipe = new Recipe  
recipe: cookbook.Recipe = cookbook.Recipe@2c5dabc5  
  
scala> cookbook.recipes  
recipes   recipes_=  
  
scala> cookbook.recipes = Map("p.b. & j." -> recipe)  
cookbook.recipes: Map[String,cookbook.Recipe] = Map(p.b. & j. -> cookbook.Recipe@2c5dabc5)  
  
scala> recipe.ingredients  
ingredients   ingredients_=  
  
scala> recipe.ingredients = List("prenut butter", "jelly", "bread")  
recipe.ingredients: List[String] = List(prenut butter, jelly, bread)  
  
scala> recipe.directions  
directions   directions_=  
  
scala> recipe.directions =   
     |   List("put peanut butter and jelly on the bread")  
recipe.directions: List[String] = List(put peanut butter and jelly on the bread)  
  
scala> cookbook.recipes  
res0: Map[String,cookbook.Recipe] = Map(p.b. & j. -> cookbook.Recipe@2c5dabc5)  
  
scala> cookbook.recipes("p.b. and j.")  
java.util.NoSuchElementException: key not found: p.b. and j.  
  at scala.collection.MapLike$class.default(MapLike.scala:228)  
  at scala.collection.AbstractMap.default(Map.scala:59)  
  at scala.collection.MapLike$class.apply(MapLike.scala:141)  
  at scala.collection.AbstractMap.apply(Map.scala:59)  
  ... 43 elided  
  
scala> cookbook.recipes("p.b. & j.")  
res2: cookbook.Recipe = cookbook.Recipe@2c5dabc5  
  
scala> sys.exit  
  
Exception: sbt.TrapExitSecurityException thrown from the UncaughtExceptionHandler in thread "run-main-5"  
  
[success] Total time: 284 s, completed Oct 4, 2015 9:45:02 AM  
> console  
[info] Compiling 1 Scala source to /Users/bandyr/Documents/scalacode/test/src/sandbox/target/scala-2.11/classes...  
[info] Starting scala interpreter...  
[info]   
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_60).  
Type in expressions to have them evaluated.  
Type :help for more information.  
  
scala> import cookbook._  
import cookbook._  
  
scala> val recipe = new Recipe(List("peanut butter", "jelly", "bread"),  
     |   List("put peanut butter and jelly on the bread")  
     | )  
Ingredients: List(peanut butter, jelly, bread)  
Directions: List(put peanut butter and jelly on the bread)  
recipe: cookbook.Recipe = cookbook.Recipe@354bf24d  
  
scala> sys.exit  
  
Exception: sbt.TrapExitSecurityException thrown from the UncaughtExceptionHandler in thread "run-main-6"  
  
[success] Total time: 151 s, completed Oct 4, 2015 9:51:48 AM  
> console  
[info] Compiling 1 Scala source to /Users/bandyr/Documents/scalacode/test/src/sandbox/target/scala-2.11/classes...  
[info] Starting scala interpreter...  
[info]   
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_60).  
Type in expressions to have them evaluated.  
Type :help for more information.  
  
scala> import cookbook._  
import cookbook._  
  
scala> new Recipe  
Ingredients: List()  
Directions: List()  
res0: cookbook.Recipe = cookbook.Recipe@1bb94fcf  
  
scala> new Recipe(List("peanut butter", "jelly", "bread"))  
Ingredients: List(peanut butter, jelly, bread)  
Directions: List()  
res1: cookbook.Recipe = cookbook.Recipe@705a0081  
  
scala> new Recipe(directions = List("make a sandwich"))  
Ingredients: List()  
Directions: List(make a sandwich)  
res2: cookbook.Recipe = cookbook.Recipe@31e2deb5  
  
scala> sys.exit  
  
Exception: sbt.TrapExitSecurityException thrown from the UncaughtExceptionHandler in thread "run-main-7"  
  
[success] Total time: 214 s, completed Oct 4, 2015 9:55:24 AM  
> console  
[info] Starting scala interpreter...  
[info]   
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_60).  
Type in expressions to have them evaluated.  
Type :help for more information.  
  
scala> import cookbook._  
import cookbook._  
  
> console  
[info] Compiling 1 Scala source to /Users/bandyr/Documents/scalacode/test/src/sandbox/target/scala-2.11/classes...  
[info] Starting scala interpreter...  
[info]   
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_60).  
Type in expressions to have them evaluated.  
Type :help for more information.  
  
scala> import cookbook._  
import cookbook._  
  
scala> new Cookbook  
Recipes: Map()  
res0: cookbook.Cookbook = cookbook.Cookbook@b9658ca  
  
scala>   
  
scala>   
  
scala>   
  
scala>   
  
scala>   
  
scala> sys.exit  
  
Exception: sbt.TrapExitSecurityException thrown from the UncaughtExceptionHandler in thread "run-main-9"  
  
[success] Total time: 11912 s, completed Oct 4, 2015 1:14:46 PM  
>   
>   
>   
>   
>   
> console  
[info] Compiling 1 Scala source to /Users/bandyr/Documents/scalacode/test/src/sandbox/target/scala-2.11/classes...  
[info] Starting scala interpreter...  
[info]   
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_60).  
Type in expressions to have them evaluated.  
Type :help for more information.  
  
scala> import cookbook._  
import cookbook._  
  
scala> Cookbook  
Ingredients: List(peanut butter, jelly, bread)  
Directions: List(put the peanut butter and jelly on the bread)  
Ingredients: List(bacon, pancakes)  
Directions: List(take some bacon and put it in a pancake)  
res0: cookbook.Cookbook.type = cookbook.Cookbook$@2553f628  
  
scala> Cookbook  
res1: cookbook.Cookbook.type = cookbook.Cookbook$@2553f628  
  
scala> Cookbook.pbj  
res2: cookbook.Recipe = cookbook.Recipe@2fa7c78d  
  
scala> Cookbook.pbj.ingredients  
res3: List[String] = List(peanut butter, jelly, bread)  
  
scala> Cookbook.baconPancakes.ingredients  
res4: List[String] = List(bacon, pancakes)  
  
scala> :t Cookbook  
cookbook.Cookbook.type  
  
scala> sys.exit  
  
Exception: sbt.TrapExitSecurityException thrown from the UncaughtExceptionHandler in thread "run-main-a"  
  
[success] Total time: 644 s, completed Oct 4, 2015 1:25:33 PM  
> console  
[info] Compiling 1 Scala source to /Users/bandyr/Documents/scalacode/test/src/sandbox/target/scala-2.11/classes...  
[info] Starting scala interpreter...  
[info]   
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_60).  
Type in expressions to have them evaluated.  
Type :help for more information.  
  
scala> import cookbook._  
import cookbook._  
  
scala> :t Recipe  
cookbook.Recipe.type  
  
scala> :t Cookbook.pbj  
cookbook.Recipe  
  
scala> Recipe.ingredients  
<console>:14: error: value ingredients is not a member of object cookbook.Recipe  
       Recipe.ingredients  
              ^  
  
scala> Cook.pbj.make  
<console>:14: error: not found: value Cook  
       Cook.pbj.make  
       ^  
  
scala> Cook.pbj.make(List("celery", "peanut butter", "raisins"),  
     |   List("ants on a log!"))  
<console>:14: error: not found: value Cook  
       Cook.pbj.make(List("celery", "peanut butter", "raisins"),  
       ^  
  
scala> Cookbook.pbj.make(List("celery", "peanut butter", "raisins"),  
     |   List("ants on a log!"))  
<console>:14: error: value make is not a member of cookbook.Recipe  
       Cookbook.pbj.make(List("celery", "peanut butter", "raisins"),  
                    ^  
  
scala> import Cookbook.pbj  
import Cookbook.pbj  
  
scala> pbj  
Ingredients: List(peanut butter, jelly, bread)  
Directions: List(put the peanut butter and jelly on the bread)  
Ingredients: List(bacon, pancakes)  
Directions: List(take some bacon and put it in a pancake)  
res4: cookbook.Recipe = cookbook.Recipe@49988f5e  
  
scala> import pbj._  
import pbj._  
  
scala> ingredients  
res5: List[String] = List(peanut butter, jelly, bread)  
  
scala> directions  
res6: List[String] = List(put the peanut butter and jelly on the bread)  
  
scala>   
  
scala>   
  
scala>   
  
scala>   
  
scala> sys.exit  
  
Exception: sbt.TrapExitSecurityException thrown from the UncaughtExceptionHandler in thread "run-main-b"  
  
[success] Total time: 6936 s, completed Oct 4, 2015 3:21:10 PM  
> console  
[info] Starting scala interpreter...  
[info]   
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_60).  
Type in expressions to have them evaluated.  
Type :help for more information.  
  
scala> val list = List(1,2,3)  
list: List[Int] = List(1, 2, 3)  
  
scala> List.apply(1,2,3)  
res0: List[Int] = List(1, 2, 3)  
  
scala> list match {  
     |   case List(a,b,c) => a + b + c  
     | }  
res1: Int = 6  
  
scala> (1, "hello", List(1,2,3))  
res2: (Int, String, List[Int]) = (1,hello,List(1, 2, 3))  
  
scala> Tuple3(1, "hello", List(1,2,3))  
res3: (Int, String, List[Int]) = (1,hello,List(1, 2, 3))  
  
scala> def safeDivide(x: Int, y: Int): Option[Int] =   
     |   if (y == 0) None else Some(x/y)  
safeDivide: (x: Int, y: Int)Option[Int]  
  
scala> safeDivide(4,2)  
res4: Option[Int] = Some(2)  
  
scala> safeDivide(4,0)  
res5: Option[Int] = None  
  
scala> sys.exit  
  
Exception: sbt.TrapExitSecurityException thrown from the UncaughtExceptionHandler in thread "run-main-c"  
  
[success] Total time: 978 s, completed Oct 4, 2015 3:37:29 PM  
> console  
[info] Compiling 1 Scala source to /Users/bandyr/Documents/scalacode/test/src/sandbox/target/scala-2.11/classes...  
[info] Starting scala interpreter...  
[info]   
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_60).  
Type in expressions to have them evaluated.  
Type :help for more information.  
  
scala> import cookbook2._  
import cookbook2._  
  
scala> Cookbook.pbj match {  
     |   case Recipe(ingredients, directions) =>   
     |     println(ingredients)  
     |     println(directions)  
     | }  
List(peanut butter, jelly, bread)  
List(put the peanut butter and jelly on the bread)  
  
scala> def isSimple(recipe: Recipe): Boolean = recipe match {  
     |   case Recipe(_, List(_)) => true  
     |   case _ => false  
     | }  
isSimple: (recipe: cookbook2.Recipe)Boolean  
  
scala> isSimple(Cookbook.pbj)  
res1: Boolean = true  
  
scala> isSimple(Cookbook.baconPancakes))  
<console>:1: error: ';' expected but ')' found.  
isSimple(Cookbook.baconPancakes))  
                                ^  
  
scala> isSimple(Cookbook.baconPancakes)  
res2: Boolean = true  
  
scala> object Even {  
     |   def unapply(n: Int): Option[Int] =   
     |     if (n % 2 == 0) => some(n/2) else None  
<console>:3: error: illegal start of simple expression  
    if (n % 2 == 0) => some(n/2) else None  
                    ^  
  
scala> object Even {  
     |     if (n % 2 == 0) some(n/2) else None  
     | }  
<console>:14: error: not found: value n  
           if (n % 2 == 0) some(n/2) else None  
               ^  
<console>:14: error: not found: value some  
           if (n % 2 == 0) some(n/2) else None  
                           ^  
<console>:14: error: not found: value n  
           if (n % 2 == 0) some(n/2) else None  
                                ^  
  
scala> object Even {  
     |     if (n % 2 == 0) Some(n/2) else None  
     | }  
<console>:14: error: not found: value n  
           if (n % 2 == 0) Some(n/2) else None  
               ^  
<console>:14: error: not found: value n  
           if (n % 2 == 0) Some(n/2) else None  
                                ^  
  
scala> object Even {  
     |   def unapply(n: Int): Option[Int] =   
     |     if (n % 2 == 0) Some(n/2) else None  
     | }  
defined object Even  
  
scala> Even(2)  
<console>:15: error: Even.type does not take parameters  
       Even(2)  
           ^  
  
scala> Even.unapply(4)  
res4: Option[Int] = Some(2)  
  
scala> Even.unapply(3)  
res5: Option[Int] = None  
  
scala> 4 match {  
     |   case Even(half) => half  
     | }  
res6: Int = 2  
  
scala> 3 match {  
     |   case Even(half) => half  
     | }  
scala.MatchError: 3 (of class java.lang.Integer)  
  ... 47 elided  
  
scala>   
  
