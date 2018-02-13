package com.github.shafiquejamal.accessapi.access.authentication

import java.time.Instant
import java.util.UUID

import scala.util.Try

trait AuthenticationAPI[UM] {

  def userByID(iD: UUID): Option[UM]

  def validateOneTime(id: UUID, iat: Instant): Option[UM]

  def user(maybeUsername: Option[String], maybeEmail: Option[String], password: String): Option[UM]

  def user(iD: UUID, password: String): Option[UM]

  def storePasswordResetCode(email: String, passwordResetCode: String): Try[UM]

  def retrievePasswordResetCode(email: String): Option[PasswordResetCodeAndDate]

  def resetPassword(email: String, code: String, newPassword: String): Try[UM]

  def allLogoutDate(id: UUID): Option[Instant]

  def logoutAllDevices(id: UUID): Try[UM]
}
