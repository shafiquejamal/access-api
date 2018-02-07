package com.github.shafiquejamal.accessapi.user

trait ChangeEmailMessage extends RequirePassword {

  def newEmailAddress: String

}
