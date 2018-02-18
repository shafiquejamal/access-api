package com.github.shafiquejamal.accessapi.access.authentication

import java.time.Instant

trait JWTCreator[UD] {

  def create(userDetails: UD, time: Instant): String

}
