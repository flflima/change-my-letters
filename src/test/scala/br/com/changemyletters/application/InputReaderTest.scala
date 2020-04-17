package br.com.changemyletters.application

import br.com.changemyletters.service.ReaderService
import org.scalamock.scalatest.MockFactory
import org.scalatest.PrivateMethodTester
import org.scalatest.flatspec.AnyFlatSpec

class InputReaderTest extends AnyFlatSpec with MockFactory with PrivateMethodTester {

  "given two valid inputs" should "output a correct String" in {
    val printOutput = PrivateMethod[Unit]('printOutput)

    val readerService = mock[ReaderService]

    (readerService.readInput _).expects().returning("l").once()
    (readerService.readInput _).expects().returning("Hello").once()

    val reader = new InputReader(readerService)
    reader.execute()

    reader invokePrivate printOutput("l", "Hello")
  }

  "given a first invalid input and a second valid" should "output a correct String" in {
    val printOutput = PrivateMethod[Unit]('printOutput)

    val readerService = mock[ReaderService]

    (readerService.readInput _).expects().returning("ll").twice()
    (readerService.readInput _).expects().returning("l").once()
    (readerService.readInput _).expects().returning("Hello").once()

    val reader = new InputReader(readerService)
    reader.execute()

    reader invokePrivate printOutput("l", "Hello")
  }

}
