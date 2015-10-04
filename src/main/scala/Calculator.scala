import scala.collection.mutable.Stack

object Calculator {

  /**
   * if the token is an operator, pop two operands of the stack, perform the operation and push the result back to stack
   */
  def handleOperator(token: String, stack: Stack[Int]): Boolean = token match {
    case "+" =>
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(lhs + rhs)
      true
    case "-" =>
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(lhs - rhs)
      true
    case "*" =>
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(lhs * rhs)
      true
    case "/" =>
      val rhs = stack.pop()
      val lhs = stack.pop()
      stack.push(lhs / rhs)
      true
    case _ => false
  }

  /**
   * if the token is a number push it to the stack
   */
  def handleNumber(token: String, stack: Stack[Int]): Boolean = try {
    stack.push(token.toInt)
    true
  } catch {
    case _: NumberFormatException => false
    // throw new IllegalArgumentException("Invalid token: " + token)
  }

  def calculate(expression: String): Int = {
    val stack = new Stack[Int]
    // handle each token
    for (token <- expression.split(" ")) {
      if (!handleOperator(token, stack) && !handleNumber(token, stack)) {
        throw new IllegalArgumentException("Invalid token: " + token)
      }
    }
    stack.pop()
  }

  def main(args: Array[String]): Unit =
    if (args.length != 1) {
      // expect exactly one argument
      throw new IllegalArgumentException("Usage: Calculator <expression>")
    } else {
      println(calculate(args(0)))
    }

}