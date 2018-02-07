package com.github.shafiquejamal.accessapi.access.authentication

import scala.util.Try

trait PasswordResetCodeSender[UM, R] {

  def send(user: UM): Try[R]

}
