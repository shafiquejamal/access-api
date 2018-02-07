package com.github.shafiquejamal.accessapi.user

trait ChangeUsernameMessage extends RequirePassword {

  def newUsername: String

}
