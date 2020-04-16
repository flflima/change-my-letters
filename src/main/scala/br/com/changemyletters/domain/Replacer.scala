package br.com.changemyletters.domain

class Replacer {
  def replace(text: String, letter: String, ignoreCase: Boolean = true): String =
    if (ignoreCase) {
      text.replaceAll(s"(${letter.toLowerCase()}|${letter.toUpperCase()})", "*")
    } else {
      text.replace(letter, "*")
    }
}
