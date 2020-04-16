package br.com.changemyletters

import br.com.changemyletters.application.InputReader
import br.com.changemyletters.service.ReaderService

object Main extends App {
  println("Application started!")

  new InputReader(new ReaderService()).execute()
}
