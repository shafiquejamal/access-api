package com.github.shafiquejamal.accessapi.user

trait ChangePasswordMessage extends RequirePassword {

  def currentPassword: String

}
