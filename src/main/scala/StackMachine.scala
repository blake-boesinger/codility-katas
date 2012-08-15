import collection.mutable

class StackMachine {

  val stack: mutable.Stack[Int] = new mutable.Stack[Int]()


  def stack_machine_emulator(S: String): Int = {

    for (c <- S) {
      val i = c.toString
      if (i != "+" && i != "*") {
        stack.push(i.toInt)
      } else {
        if (performOps(i)) {
          return -1
        }
      }

    }

     return stack.pop()

  }


  def performOps(i: String) : Boolean = {
    if ( stack.size < 2) {
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
}
