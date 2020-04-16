package br.com.changemyletters.domain

import org.scalatest.funsuite.AnyFunSuite

class ReplacerTest extends AnyFunSuite {
  val replacerService = new Replacer()

  test("given a lower case letter must replace all occurrences with *") {
    assert(replacerService.replace("Hello", "l") === "He**o")
  }

  test("given a lower case letter and an upper case text must replace all occurrences with *") {
    assert(replacerService.replace("HELLO", "l") === "HE**O")
  }

  test("given an upper case letter must replace all occurrences with *") {
    assert(replacerService.replace("hello", "L") === "he**o")
  }

  test("given a lower case letter must replace only the lower cases occurrences with *") {
    assert(replacerService.replace("hello", "l", false) === "he**o")
  }

  test("given an upper case letter must replace only the upper cases occurrences with *") {
    assert(replacerService.replace("HELLO", "L", false) === "HE**O")
  }

  test("given an upper case letter must not replace if the case letter does not exist") {
    assert(replacerService.replace("HELLO", "l", false) === "HELLO")
  }
}
