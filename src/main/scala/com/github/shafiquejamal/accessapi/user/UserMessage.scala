package com.github.shafiquejamal.accessapi.user

import java.util.UUID

trait UserMessage[S] {

  def userID: UUID

  def username: String

  def email: String

  def userStatus: S
}
