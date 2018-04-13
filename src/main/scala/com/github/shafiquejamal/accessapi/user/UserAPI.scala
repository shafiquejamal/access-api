package com.github.shafiquejamal.accessapi.user

import java.util.UUID

import scala.util.Try

trait UserAPI[UD] {

  def changeUsername(userId: UUID, newUsername: String): Try[UD]

  def requestChangeEmail(userId: UUID, newEmailAddress: String): Try[UD]

  def changeEmail(userId: UUID, newEmailAddress: String, code: String): Try[UD]

  def changePassword(userId: UUID, newPassword: String): Try[UD]

  def findUnverifiedUser(email: String): Option[UD]

  def by(username: String): Option[UUID]

  def by(userId: UUID): Option[String]

  def sendActivationCodeForNewEmail(userId: UUID, currentEmail: String, newEmail: String): Try[UD]

}
