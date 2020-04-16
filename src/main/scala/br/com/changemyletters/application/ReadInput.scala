package br.com.changemyletters.application

import br.com.changemyletters.domain.ReplacerService

import scala.io.StdIn.readLine

class ReadInput {

  def execute(): Unit = {
    print("Enter the letter to replace: ")
    val letter = readLine()

    print("Enter your text: ")
    val text = readLine()

    println("")
    println(s"Your output is: ${new ReplacerService().replace(text, letter)}")
  }

}
