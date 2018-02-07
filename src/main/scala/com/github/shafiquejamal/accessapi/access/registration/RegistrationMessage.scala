package com.github.shafiquejamal.accessapi.access.registration

trait RegistrationMessage {

  def maybeUsername: Option[String]

  def email: String

  def password: String

}
