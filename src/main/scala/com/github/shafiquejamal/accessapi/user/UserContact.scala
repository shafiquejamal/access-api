package com.github.shafiquejamal.accessapi.user

import java.util.UUID

trait UserContact {

  def userID: UUID

  def username: String

  def email: String

}
