package br.com.changemyletters.domain

import org.scalatest.FunSuite

class ReplacerServiceTest extends FunSuite {
  test("given a lower case letter must replace all occurrences with *") {
    assert(ReplacerService.replace("Hello", "l") === "He**o")
  }

  test("given a lower case letter and an upper case text must replace all occurrences with *") {
    assert(ReplacerService.replace("HELLO", "l") === "HE**O")
  }

  test("given an upper case letter must replace all occurrences with *") {
    assert(ReplacerService.replace("hello", "L") === "he**o")
  }

  test("given a lower case letter must replace only the lower cases occurrences with *") {
    assert(ReplacerService.replace("hello", "l", false) === "he**o")
  }

  test("given an upper case letter must replace only the upper cases occurrences with *") {
    assert(ReplacerService.replace("HELLO", "L", false) === "HE**O")
  }

  test("given an upper case letter must not replace if the case letter does not exist") {
    assert(ReplacerService.replace("HELLO", "l", false) === "HELLO")
  }
}
