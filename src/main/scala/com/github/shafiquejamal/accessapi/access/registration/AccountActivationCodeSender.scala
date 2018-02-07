package com.github.shafiquejamal.accessapi.access.registration

trait AccountActivationCodeSender[UM, US] {

  def sendActivationCode(user: UM, key: String): Unit

  def statusOnRegistration: US

}
