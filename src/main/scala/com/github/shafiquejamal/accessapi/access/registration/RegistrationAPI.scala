package com.github.shafiquejamal.accessapi.access.registration

import java.util.UUID

import scala.util.Try

trait RegistrationAPI[UD, US] {

  def signUp(maybeUsername: Option[String], email: String, password: String, statusOnRegistration: US): Try[UD]

  def isUsernameIsAvailable(username: String): Boolean

  def isEmailIsAvailable(email: String): Boolean

  def activate(userId: UUID): Try[UD]

}
