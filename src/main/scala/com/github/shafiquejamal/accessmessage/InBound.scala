package com.github.shafiquejamal.accessmessage

object InBound {

  trait AuthenticateMeMessage {

    def jWT: String

  }

  trait LogMeInMessage {

    def maybeUsername: Option[String]

    def maybeEmail: Option[String]

    def password: String
  }

  trait PasswordResetCodeRequestMessage {

    def email: String

  }

  trait ResetMyPasswordMessage {

    def email: String

    def code: String

    def newPassword: String

  }

  trait IsEmailAvailableMessage {

    def email: String

  }

  trait IsUsernameAvailableMessage {

    def username: String

  }

  trait RegisterMeMessage {

    def maybeUsername: Option[String]

    def email:String

    def password:String

  }

  trait ChangeMyPasswordMessage {

    def currentPassword: String

    def newPassword: String

  }

  trait ActivateMyAccountMessage {

    def emailOrUsername: String

    def code: String

  }

  trait ResendMyActivationCodeMessage {

    def email: String

  }

  trait LogMeOutMessage {

  }

  trait LogMeOutOfAllDevicesMessage {

  }


}
