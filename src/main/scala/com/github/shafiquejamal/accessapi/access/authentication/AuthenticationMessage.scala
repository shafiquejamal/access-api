package com.github.shafiquejamal.accessapi.access.authentication

trait AuthenticationMessage {
  def maybeUsername: Option[String]

  def maybeEmail: Option[String]

  def password: String
}
