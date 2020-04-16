package br.com.changemyletters.application

import br.com.changemyletters.service.ReaderService
import org.scalamock.scalatest.MockFactory
import org.scalatest.funsuite.AnyFunSuite

class InputReaderTest extends AnyFunSuite with MockFactory {

  test("testExecute") {
    val readerService = mock[ReaderService]

    (readerService.readInput _).expects().returning("l").once()

    new InputReader(readerService).execute()
  }

}
