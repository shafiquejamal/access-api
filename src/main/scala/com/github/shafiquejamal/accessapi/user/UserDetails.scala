package com.github.shafiquejamal.accessapi.user

trait UserDetails[S] extends UserContact {

  def userStatus: S
}
