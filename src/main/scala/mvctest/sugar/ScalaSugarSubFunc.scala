package mvctest.sugar

class ScalaSugarSubFunc {
  val letters = Seq("a", "b", "c", "d")

  //Should be 100% covered
  def checkCoverageOfSubFunction100PercentCovered (){

    val containChecker: (String) => Boolean = (letter: String) => {
      if (!(letters contains letter)) {
        false
      } else {
        true
      }
    }
    //True branch
    val result = containChecker("a")
    //False branch
    val result2 = containChecker("1")


  }
  //Should be 50% covered
  def checkCoverageOfSubFunction50PercentCoveredTrue (){

    val containChecker1: (String) => Boolean = (letter: String) => {
      if (!(letters contains letter)) {
        false
      } else {
        true
      }
    }
    //True branch
    val result = containChecker1("a")

  }
  //Should be 50% covered
  def checkCoverageOfSubFunction50PercentCoveredFalse (){

    val containChecker2: (String) => Boolean = (letter: String) => {
      if (!(letters contains letter)) {
        false
      } else {
        true
      }
    }
    //True branch
    val result = containChecker2("a")
  }

}
