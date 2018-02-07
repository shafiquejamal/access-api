package com.github.shafiquejamal.accessapi.access.authentication

import java.time.Instant
import java.util.UUID

import scala.util.Try

trait AuthenticationAPI[UM] {

  def userById(id: UUID): Option[UM]

  def validateOneTime(id: UUID, iat: Instant): Option[UM]

  def user(authenticationMessage: AuthenticationMessage): Option[UM]

  def storePasswordResetCode(email: String, passwordResetCode: String): Try[UM]

  def retrievePasswordResetCode(email: String): Option[PasswordResetCodeAndDate]

  def resetPassword(email: String, code: String, newPassword: String): Try[UM]

  def allLogoutDate(id: UUID): Option[Instant]

  def logoutAllDevices(id: UUID): Try[UM]
}
