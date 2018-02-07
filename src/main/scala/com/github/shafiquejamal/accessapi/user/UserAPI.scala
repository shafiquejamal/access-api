package com.github.shafiquejamal.accessapi.user

import java.util.UUID

import scala.util.Try

trait UserAPI[UM] {

  def changeUsername(userId: UUID, changeUsernameMessage: ChangeUsernameMessage): Try[UM]

  def changeEmail(userId: UUID, changeEmailMessage: ChangeEmailMessage): Try[UM]

  def changePassword(userId: UUID, changePasswordMessage: ChangePasswordMessage): Try[UM]

  def findByEmailLatest(email: String): Option[UM]

  def findUnverifiedUser(email: String): Option[UM]

  def by(username: String): Option[UUID]

  def by(userId: UUID): Option[String]
}
