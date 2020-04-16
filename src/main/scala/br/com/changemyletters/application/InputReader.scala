package br.com.changemyletters.application

import br.com.changemyletters.domain.Replacer
import br.com.changemyletters.service.ReaderService

class InputReader(readerService: ReaderService) {

  def execute(): Unit = {
    print("Enter the letter to replace: ")
    val letter = readerService.readInput()

    print("Enter your text: ")
    val text = readerService.readInput()

    println("")
    println(s"Your output is: ${new Replacer().replace(text, letter)}")
  }

}
