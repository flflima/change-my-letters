package br.com.changemyletters.domain

object ReplacerService {
  def replace(letter: String) = {
    "Hello".replace(letter, "*")
  }

}
