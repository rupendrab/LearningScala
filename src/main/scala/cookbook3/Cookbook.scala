package cookbook3

/**
 * The class contains instance members 
 * We make the constructor private to make sure we can only use the factory method in the object
 * Made public as it is more prevalent
 * Eliminate boilerplate code like
 * apply
 * unapply
 * equals
 * hashcode
 * tostring
 * no need to declare class parameters as val as well
 * using case class
*/
case class Recipe (ingredients: Map[String, Mass] = Map.empty, directions: List[String] = List.empty)

abstract class Mass(val amount: Double) {
    def toGrams: Grams
}
class Grams(amount: Double) extends Mass(amount) {
  override def toGrams: Grams = this
  override def toString: String = amount + "g"
}
class Milligrams(amount: Double) extends Mass(amount) {
  override def toGrams: Grams = new Grams(amount / 1000)
  override def toString: String = amount + "mg"
}
class Kilograms(amount: Double) extends Mass(amount) {
  override def toGrams: Grams = new Grams(amount * 1000)
  override def toString: String = amount + "kg"
}

object Cookbook {
  val pbj = Recipe(
      Map("peanut butter" -> new Grams(10), 
          "jelly" -> new Kilograms(0.5), 
          "bread" -> new Grams(250)),
      List("put the peanut butter and jelly on the bread"))
  
  val baconPancakes = Recipe(
      Map("bacon" -> new Kilograms(1), 
          "pancakes" -> new Milligrams(10)),
      List("take some bacon and put it in a pancake"))
}
