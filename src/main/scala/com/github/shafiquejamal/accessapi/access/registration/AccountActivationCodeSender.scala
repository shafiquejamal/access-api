package com.github.shafiquejamal.accessapi.access.registration

trait AccountActivationCodeSender[UM, US] {

  def sendActivationCode(username: String, email: String, code: String): Unit

  def statusOnRegistration: US

}
