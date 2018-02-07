package com.github.shafiquejamal.accessapi.access.authentication

import java.time.Instant

trait PasswordResetCodeAndDate {

  def code: String

  def date: Instant

}
