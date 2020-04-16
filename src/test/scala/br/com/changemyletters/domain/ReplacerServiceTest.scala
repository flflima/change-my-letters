package br.com.changemyletters.domain

import org.scalatest.FunSuite

class ReplacerServiceTest extends FunSuite {
  test("given a lower case letter must replace all occurrences with *") {
    assert(ReplacerService.replace("Hello", "l") === "He**o")
  }

  test("given an upper case letter must replace all occurrences with *") {
    assert(ReplacerService.replace("Hello", "L") === "He**o")
  }

  test("given a lower case letter must replace only the lower cases occurrences with *") {
    assert(ReplacerService.replace("Hello", "l", true) === "He**o")
  }

  test("given an upper case letter must replace only the upper cases occurrences with *") {
    assert(ReplacerService.replace("HELLO", "L", true) === "He**o")
  }
}
