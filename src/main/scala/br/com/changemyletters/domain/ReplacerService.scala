package br.com.changemyletters.domain

object ReplacerService {
  def replace(text: String, letter: String, respectCase: Boolean = false) = {
    if (!respectCase) {
      text.replace(letter.toLowerCase(), "*")
    } else {

    }
  }
}
