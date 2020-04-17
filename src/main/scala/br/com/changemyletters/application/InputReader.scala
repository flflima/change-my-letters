package br.com.changemyletters.application

import br.com.changemyletters.domain.Replacer
import br.com.changemyletters.service.ReaderService

class InputReader(readerService: ReaderService) {

  def execute(): Unit = {
    print("Enter the letter to replace: ")
    var letter = readerService.readInput()

    while (letter.length == 0 || letter.length > 1) {
      print("Invalid input [input only ONE letter]: ")
      letter = readerService.readInput()
    }

    print("Enter your text: ")
    val text = readerService.readInput()

    printOutput(letter, text)
  }

  private def printOutput(letter: String, text: String) = {
    println("")
    println(s"Your output is: ${new Replacer().replace(text, letter)}")
  }
}
