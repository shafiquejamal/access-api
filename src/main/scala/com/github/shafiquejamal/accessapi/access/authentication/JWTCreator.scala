package com.github.shafiquejamal.accessapi.access.authentication

import java.time.Instant

trait JWTCreator[UM] {

  def create(userMessage: UM, time: Instant): String

}
