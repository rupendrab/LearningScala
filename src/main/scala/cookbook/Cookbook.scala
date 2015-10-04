package cookbook

/**
 * The class contains instance members 
 * We make the constructor private to make sure we can only use the factory method in the object
*/
class Recipe private (
    val ingredients: List[String] = List.empty,
    val directions: List[String] = List.empty) {
  println("Ingredients: " + ingredients)
  println("Directions: " + directions)
}

/** 
 *  To define static members 
 *  Must be defined in the same file as class so the scala compiler knows they are companions
 */
object Recipe {
  def make(ingredients: List[String], directions: List[String]): Recipe =
    new Recipe(ingredients, directions)
}

/*
class Cookbook(val recipes: Map[String, Recipe]) {
  println("Recipes: " + recipes)
  
  // Define an auxiliary constructor
  def this() = this(Map.empty)
}
*/

object Cookbook {
  val pbj = Recipe.make(
      List("peanut butter", "jelly", "bread"),
      List("put the peanut butter and jelly on the bread"))
  
  val baconPancakes = Recipe.make(
      List("bacon", "pancakes"),
      List("take some bacon and put it in a pancake"))
}