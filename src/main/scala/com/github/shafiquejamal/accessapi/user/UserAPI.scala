package com.github.shafiquejamal.accessapi.user

import java.util.UUID

import scala.util.Try

trait UserAPI[UM] {

  def changeUsername(userId: UUID, newUsername: String): Try[UM]

  def requestChangeEmail(userId: UUID, newEmailAddress: String): Try[UM]

  def changeEmail(userId: UUID, newEmailAddress: String, code: String): Try[UM]

  def changePassword(userId: UUID, newPassword: String): Try[UM]

  def findByEmailLatest(email: String): Option[UM]

  def findUnverifiedUser(email: String): Option[UM]

  def by(username: String): Option[UUID]

  def by(userId: UUID): Option[String]
}
