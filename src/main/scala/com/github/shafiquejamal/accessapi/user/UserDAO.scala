package com.github.shafiquejamal.accessapi.user

import java.time.Instant
import java.util.UUID

import com.github.shafiquejamal.accessapi.access.authentication.PasswordResetCodeAndDate

import scala.util.Try

trait UserDAO[U, US] {

  def byUsername(username: String, userFilter: U => Boolean): Option[U]

  def byEmail(email: String, userFilter: U => Boolean): Option[U]

  def add(
      user: U,
      created: Instant,
      uUID: UUID,
      userFilter: U => Boolean): Try[U]

  def by(id: UUID, userFilter: U => Boolean): Option[U]

  def validateOneTime(
      xuserId: UUID,
      iat: Instant,
      statusOfUserFilter: StatusField[US] => Boolean,
      created: Instant,
      uUID: UUID): Option[U]

  def changeUsername(
      id: UUID, newUsername: String,
      created: Instant,
      userFilter: U => Boolean): Try[U]

  def changePassword(id: UUID, newHashedPassword: String, created: Instant): Try[U]

  def addStatus(id: UUID, userStatus: US, created: Instant): Try[U]

  def addPasswordResetCode(userId: UUID, passwordResetCode: String, created: Instant, active: Boolean): Try[U]

  def passwordResetCode(userId: UUID): Option[PasswordResetCodeAndDate]

  def allLogoutDate(id: UUID): Option[Instant]

  def addAllLogoutDate(id: UUID, allLogoutDate: Instant, created: Instant): Try[U]

}
