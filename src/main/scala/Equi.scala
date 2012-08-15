

object Equi {


  def equi(A: List[Int]): Int = {


    for (i <- 0 until A.length) {
      val first: List[Int] = A.slice(0, i)
      val second: List[Int] = A.slice(i + 1, A.length)

      if (first.sum == second.sum) {
        return i
      }

    }

    return -1


  }

}
