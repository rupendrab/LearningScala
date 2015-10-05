package cookbook2

/**
 * The class contains instance members 
 * We make the constructor private to make sure we can only use the factory method in the object
 * Made public as it is more prevalent
*/
class Recipe (val ingredients: List[String], val directions: List[String])

/** 
 *  To define static members 
 *  Must be defined in the same file as class so the scala compiler knows they are companions
 *  added default List.empty to apply method instead of class constructor
 */
object Recipe {
  def apply(ingredients: List[String] = List.empty, 
      directions: List[String] = List.empty): Recipe =
    new Recipe(ingredients, directions)
  
  def unapply(recipe: Recipe): Option[(List[String], List[String])] =
    Some((recipe.ingredients, recipe.directions))
}

object Cookbook {
  val pbj = Recipe(
      List("peanut butter", "jelly", "bread"),
      List("put the peanut butter and jelly on the bread"))
  
  val baconPancakes = Recipe(
      List("bacon", "pancakes"),
      List("take some bacon and put it in a pancake"))
}
