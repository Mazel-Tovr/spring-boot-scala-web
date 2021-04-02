package mvctest.sugar

class ScalaSugarApply {


  def tryApplyMethodCoverage(): Unit ={

    val aLetter = new ApplayTest("sCALA")

    val introduction = aLetter("This is")

    val truee = introduction == "This is sCALA"

  }


}

class ApplayTest(letter: String) {
  def apply(introduction: String): String = s"${introduction} ${letter}"
}
