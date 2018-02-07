package com.github.shafiquejamal.accessapi.user

import java.util.UUID

trait User[US] extends StatusField[US] {

  def maybeId: UUID
  def username: String
  def email: String

}

trait StatusField[US] {

  def userStatus: US

}
