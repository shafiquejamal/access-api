package com.github.shafiquejamal.accessapi.access.registration

import com.github.shafiquejamal.accessapi.user.UserDetails

trait AccountActivationCodeSender[US, UD <: UserDetails[US]] {

  def sendActivationCode(userDetails: UD): Unit

  def statusOnRegistration: US

}
