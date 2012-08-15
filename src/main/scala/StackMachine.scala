import collection.mutable

class StackMachine {

  val stack: mutable.Stack[Int] = new mutable.Stack[Int]()


  def stack_machine_emulator(input: String): Int = {

    for (c <- input) {
      val i = c.toString
      if (digit(i)) {
        stack.push(i.toInt)
      } else {
        if (errorWhenPerformingOperation(i)) {
          return -1
        }
      }
    }
     return stack.pop()
  }


  def errorWhenPerformingOperation(i: String): Boolean = {
    performOps(i)
  }

  def digit(i: String): Boolean = {
    i != "+" && i != "*"
  }

  def performOps(i: String) : Boolean = {
    if ( notEnoughElementsInStack) {
      return true
    }

    if (i == "+") {
      val a = stack.pop()
      val b = stack.pop()
      val result = a + b;
      stack.push(result)
    }

    if (i == "*") {
      val a = stack.pop()
      val b = stack.pop()
      val result = a * b;
      stack.push(result)
    }
      return false
  }

  def notEnoughElementsInStack: Boolean = {
    stack.size < 2
  }
}
