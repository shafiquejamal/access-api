package com.github.shafiquejamal.accessapi.access.registration

import com.github.shafiquejamal.accessapi.user.UserDetails

trait CodeSender[US, UD <: UserDetails[US]] {

  def sendActivationCode(userDetails: UD, code: String, messageInfo: Map[String, String]): Unit

  def statusOnRegistration: US

}
