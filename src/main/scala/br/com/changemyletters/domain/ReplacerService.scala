package br.com.changemyletters.domain

object ReplacerService {
  def replace(text: String, letter: String, respectCase: Boolean = false) =
    if (respectCase) {
      text.replaceAllLiterally(letter, "*")
    } else {
      text.replace(letter.toLowerCase(), "*")
    }
}
