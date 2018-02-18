package com.github.shafiquejamal.accessapi.access.authentication

import java.time.Instant
import java.util.UUID

import scala.util.Try

trait AuthenticationAPI[UD] {

  def userByID(iD: UUID): Option[UD]

  def validateOneTime(id: UUID, iat: Instant): Option[UD]

  def user(maybeUsername: Option[String], maybeEmail: Option[String], password: String): Option[UD]

  def user(iD: UUID, password: String): Option[UD]

  def storePasswordResetCode(email: String, passwordResetCode: String): Try[UD]

  def retrievePasswordResetCode(email: String): Option[PasswordResetCodeAndDate]

  def resetPassword(email: String, code: String, newPassword: String): Try[UD]

  def allLogoutDate(id: UUID): Option[Instant]

  def logoutAllDevices(id: UUID): Try[UD]
}
