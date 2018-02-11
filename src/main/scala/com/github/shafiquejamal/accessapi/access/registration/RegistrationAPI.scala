package com.github.shafiquejamal.accessapi.access.registration

import java.util.UUID

import scala.util.Try

trait RegistrationAPI[UM, US] {

  def signUp(maybeUsername: Option[String], email: String, password: String, statusOnRegistration: US): Try[UM]

  def isUsernameIsAvailable(username: String): Boolean

  def isEmailIsAvailable(email: String): Boolean

  def activate(userId: UUID): Try[UM]

}
