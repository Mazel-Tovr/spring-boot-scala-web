package mvctest.web

import mvctest.sugar.{ScalaSugarApply, ScalaSugarSubFunc, ScalaSugarSwitchCase}
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping}

@Controller
@RequestMapping(Array("/sugar"))
class SugarController {

  @GetMapping
  def all():String = {

    val switchCase = new ScalaSugarSwitchCase()
    switchCase.checkCoverageOfSwitchCaseFunction100PercentCovered()
    switchCase.checkCoverageOfSwitchCaseFunction66PercentCovered()
    switchCase.checkCoverageOfSwitchCaseFunction33PercentCovered()

    val subFunc = new ScalaSugarSubFunc()
    subFunc.checkCoverageOfSubFunction100PercentCovered()
    subFunc.checkCoverageOfSubFunction50PercentCoveredFalse()
    subFunc.checkCoverageOfSubFunction50PercentCoveredTrue()


    val ss = new ScalaSugarApply()
    ss.tryApplyMethodCoverage()

     "String"
  }




}
