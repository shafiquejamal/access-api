package com.github.shafiquejamal.accessmessage

object InBound {

  trait AuthenticateMeMessage extends Message[AuthenticateMeMessage] {
    def jWT: String
  }

  trait LogMeInMessage extends Message[LogMeInMessage] {
    def maybeUsername: Option[String]

    def maybeEmail: Option[String]

    def password: String
  }

  trait PasswordResetCodeRequestMessage extends Message[PasswordResetCodeRequestMessage] {
    def email: String
  }

  trait ResetMyPasswordMessage extends Message[ResetMyPasswordMessage] {
    def email: String

    def code: String

    def newPassword: String
  }

  trait IsEmailAvailableMessage extends Message[IsEmailAvailableMessage] {
    def email: String
  }

  trait IsUsernameAvailableMessage extends Message[IsUsernameAvailableMessage] {
    def username: String
  }

  trait RegisterMeMessage extends Message[RegisterMeMessage] {
    def maybeUsername: Option[String]

    def email:String

    def password:String
  }

  trait ChangeMyPasswordMessage extends Message[ChangeMyPasswordMessage] {
    def currentPassword: String

    def newPassword: String
  }

  trait ActivateMyAccountMessage extends Message[ActivateMyAccountMessage] {
    def emailOrUsername: String

    def code: String
  }

  trait ResendMyActivationCodeMessage extends Message[ResendMyActivationCodeMessage] {
    def email: String
  }

  trait LogMeOutMessage extends Message[LogMeOutMessage]

  trait LogMeOutOfAllDevicesMessage extends Message[LogMeOutOfAllDevicesMessage]

  trait RequestChangeEmailMessage extends Message[RequestChangeEmailMessage] {
    def newEmail: String
  }

  trait ActivateNewEmailMessage extends Message[ActivateNewEmailMessage] {
    def newEmail: String

    def code: String
  }

}
