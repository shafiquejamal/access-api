package com.github.shafiquejamal.accessapi.access.authentication


import com.github.shafiquejamal.accessapi.user.UserDetails

trait TokenValidator[US, T <: UserDetails[US]] {
  
  def decodeAndValidateToken(token: String): Option[T]
  
}

