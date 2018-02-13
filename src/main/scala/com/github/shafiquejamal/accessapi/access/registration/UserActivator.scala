package com.github.shafiquejamal.accessapi.access.registration

trait UserActivator[UM, M] {

  def activateUser(user: UM, code:String): M

}