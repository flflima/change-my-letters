package br.com.changemyletters.domain

object ReplacerService {
  def replace(text: String, letter: String, ignoreCase: Boolean = true) =
    if (ignoreCase) {
      text.replaceAll(s"(${letter.toLowerCase()}|${letter.toUpperCase()})", "*")
    } else {
      text.replace(letter, "*")
    }
}
