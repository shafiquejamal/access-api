package com.github.shafiquejamal.accessapi.authentication

trait AuthenticationMessage {
  def maybeUsername: Option[String]

  def maybeEmail: Option[String]

  def password: String
}
