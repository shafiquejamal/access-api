package com.github.shafiquejamal.accessapi.access.authentication

import java.util.UUID

trait TokenValidator {

  def decodeAndValidateToken(
      token: String,
      blockToExecuteIfAuthorized: => (UUID, String) => Option[(UUID, String)],
      blockToExecuteIfUnauthorized: => Option[(UUID, String)]): Option[(UUID, String)]

  def blockToExecuteIfAuthorized: (UUID, String) => Option[(UUID, String)]

  def blockToExecuteIfUnauthorized: Option[(UUID, String)]

}