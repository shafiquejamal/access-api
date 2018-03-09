package com.github.shafiquejamal.accessapi.access.authentication


import java.time.temporal.TemporalUnit

import com.github.shafiquejamal.accessapi.user.UserDetails

trait TokenValidator[US, T <: UserDetails[US]] {
  
  def decodeAndValidateToken(token: String, jWTValidityLength: Long, jWTValidityUnit: TemporalUnit): Option[T]
  
}

