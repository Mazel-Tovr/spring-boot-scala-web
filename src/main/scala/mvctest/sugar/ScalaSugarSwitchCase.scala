package mvctest.sugar

class ScalaSugarSwitchCase {

  //Should be 100% covered
  def checkCoverageOfSwitchCaseFunction100PercentCovered() {

    val sting = "Sting"
    val notSting = "Not sting"
    num1(sting)
    num1(notSting)
    num1("def")
  }

  //Should be 66% covered
  def checkCoverageOfSwitchCaseFunction66PercentCovered() {
    val sting = "Sting"
    val notSting = "Not sting"
    num2(sting)
    num2(notSting)
  }


  //Should be 33% covered
  def checkCoverageOfSwitchCaseFunction33PercentCovered() {
    val sting = "Sting"
    num3(sting)
  }

  private def num1(string: String): Int = string match {
    case "String" => 1
    case "Not sting" => 2
    case default => 3
  }

  private def num2(string: String): Int = string match {
    case "String" => 1
    case "Not sting" => 2
    case default => 3
  }

  private def num3(string: String): Int = string match {
    case "String" => 1
    case "Not sting" => 2
    case default => 3
  }


}
