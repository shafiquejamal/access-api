package com.github.shafiquejamal.accessapi.access.authentication

import java.util.UUID

import com.github.shafiquejamal.accessapi.user.UserContact

trait TokenValidator {

  def decodeAndValidateToken(
      token: String,
      blockToExecuteIfAuthorized: => (UUID, String) => Option[UserContact],
      blockToExecuteIfUnauthorized: => Option[(UUID, String)]): Option[UserContact]

  def blockToExecuteIfAuthorized: (UUID, String) => Option[UserContact]

  def blockToExecuteIfUnauthorized: Option[(UUID, String)]

}

