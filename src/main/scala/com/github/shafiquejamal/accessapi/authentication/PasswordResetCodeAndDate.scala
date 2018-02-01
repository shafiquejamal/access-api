package com.github.shafiquejamal.accessapi.authentication

import java.time.Instant

trait PasswordResetCodeAndDate {

  def code: String

  def date: Instant

}
