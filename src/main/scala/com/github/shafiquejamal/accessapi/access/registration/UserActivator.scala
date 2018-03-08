package com.github.shafiquejamal.accessapi.access.registration

import java.util.UUID

trait UserActivator[UD, M] {

  def activateUser(user: UD, maybePreviousMessageID: Option[UUID]): M

}