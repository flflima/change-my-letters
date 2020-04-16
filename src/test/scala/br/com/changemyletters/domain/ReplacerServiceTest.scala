package br.com.changemyletters.domain

import org.scalatest.FunSuite

class ReplacerServiceTest extends FunSuite {
  test("given a lower case letter must replace all occurrences with *") {
    assert(ReplacerService.replace("l") === "He**o")
  }
}
