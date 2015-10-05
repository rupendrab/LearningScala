package cookbook4

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
case class Recipe(ingredients: Map[String, Mass] = Map.empty, directions: List[String] = List.empty) {
  def shoppingList(kitchen: Map[String, Mass]): List[String] = 
    for {
      (name, need) <- ingredients.toList
      have = kitchen.getOrElse(name, Grams(0))
      if (have.compareTo(need) < 0)
    } yield name
}

/**
 * sealed means that all possible subclasses of Mass are defined in this file
 */
sealed abstract class Mass extends Comparable[Mass] {
  def amount: Double
  def toGrams: Grams
  def compareTo(that: Mass): Int = (this.toGrams.amount - that.toGrams.amount).toInt
}
case class Grams(amount: Double) extends Mass {
  override def toGrams: Grams = this
  override def toString: String = amount + "g"
}
case class Milligrams(amount: Double) extends Mass {
  override def toGrams: Grams = Grams(amount / 1000)
  override def toString: String = amount + "mg"
}
case class Kilograms(amount: Double) extends Mass {
  override def toGrams: Grams = Grams(amount * 1000)
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
