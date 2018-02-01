package com.github.shafiquejamal.accessapi.registration

trait RegistrationMessage {

  def maybeUsername: Option[String]

  def email: String

  def password: String

}
