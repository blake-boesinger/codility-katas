import collection.mutable

/*
* -----------------------------------------------------------------------
*
* QATARLYST LIMITED
*
* -----------------------------------------------------------------------
*
* (C) Copyright 2012 Qatarlyst Limited. All rights reserved.
*
* NOTICE:  All information contained herein or attendant hereto is,
*          and remains, the property of Qatarlyst Limited.  Many of the
*          intellectual and technical concepts contained herein are
*          proprietary to Qatarlyst Limited. Any dissemination of this
*          information or reproduction of this material is strictly
*          forbidden unless prior written permission is obtained
*          from Qatarlyst Limited.
*
* -----------------------------------------------------------------------
*/

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
