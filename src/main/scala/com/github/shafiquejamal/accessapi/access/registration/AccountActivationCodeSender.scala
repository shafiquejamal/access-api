package com.github.shafiquejamal.accessapi.access.registration

import com.github.shafiquejamal.accessapi.user.UserDetails

trait AccountActivationCodeSender[US, UD <: UserDetails[US]] {

  def sendActivationCode(userDetails: UD, code: String): Unit

  def statusOnRegistration: US

}
