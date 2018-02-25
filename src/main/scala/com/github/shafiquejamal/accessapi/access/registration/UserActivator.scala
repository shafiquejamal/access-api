package com.github.shafiquejamal.accessapi.access.registration

trait UserActivator[UD, M] {

  def activateUser(user: UD, code:String): M

}