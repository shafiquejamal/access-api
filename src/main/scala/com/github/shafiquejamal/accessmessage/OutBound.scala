package com.github.shafiquejamal.accessmessage

import java.util.UUID

object OutBound {

  trait OutboundMessage[J, T <: OutboundMessage[J, T]] extends Message[T] {
    def toJSON: J
  
    def previousMessageID: Option[UUID]
  }

  trait AuthenticationSuccessfulMessage[J] extends OutboundMessage[J, AuthenticationSuccessfulMessage[J]]

  trait LoginAttemptResultMessage[J] extends OutboundMessage[J, LoginAttemptResultMessage[J]]

  trait YourLoginAttemptFailedMessage[J] extends LoginAttemptResultMessage[J]

  trait LoginFieldsValidationFailedMessage[J] extends YourLoginAttemptFailedMessage[J] {
    def reason: String
  }

  trait YourLoginAttemptSucceededMessage[J] extends LoginAttemptResultMessage[J] {
    def username: String

    def email: String

    def payload: String
  }

  trait PasswordResetCodeSentMessage[J] extends OutboundMessage[J, PasswordResetCodeSentMessage[J]]

  trait PasswordResetSuccessfulMessage[J] extends OutboundMessage[J, PasswordResetSuccessfulMessage[J]]

  trait PasswordResetFailedMessage[J] extends OutboundMessage[J, PasswordResetFailedMessage[J]]

  trait EmailIsAvailableMessage[J] extends OutboundMessage[J, EmailIsAvailableMessage[J]] {
    def email: String

    def isEmailIsAvailable: Boolean
  }

  trait UsernameIsAvailableMessage[J] extends OutboundMessage[J, UsernameIsAvailableMessage[J]] {
    def username: String

    def isUsernameIsAvailable: Boolean
  }

  trait RegistrationAttemptResultMessage[J] extends OutboundMessage[J, RegistrationAttemptResultMessage[J]]

  trait YourRegistrationAttemptFailedMessage[J] extends RegistrationAttemptResultMessage[J]

  trait RegistrationFieldsValidationFailedMessage[J] extends YourRegistrationAttemptFailedMessage[J] {
    def reason: String
  }

  trait YourRegistrationAttemptSucceededMessage[J] extends RegistrationAttemptResultMessage[J]

  trait AccountActivationAttemptResultMessage[J] extends OutboundMessage[J, AccountActivationAttemptResultMessage[J]]

  trait AccountActivationAttemptFailedMessage[J] extends AccountActivationAttemptResultMessage[J] {
    def errorMessage: String
  }

  trait AccountActivationAttemptSucceededMessage[J] extends AccountActivationAttemptResultMessage[J]

  trait ResendActivationCodeResultMessage[J] extends OutboundMessage[J, ResendActivationCodeResultMessage[J]] {
    def message: String
  }

  trait YouAreAlreadyAuthenticatedMessage[J] extends OutboundMessage[J, YouAreAlreadyAuthenticatedMessage[J]]

  trait LoggingYouOutMessage[J] extends OutboundMessage[J, LoggingYouOutMessage[J]]

  trait ChangePasswordAttemptResultMessage[J] extends OutboundMessage[J, ChangePasswordAttemptResultMessage[J]]

  trait ChangePasswordFailedMessage[J] extends ChangePasswordAttemptResultMessage[J]

  trait ChangePasswordSucceededMessage[J] extends ChangePasswordAttemptResultMessage[J]

  trait RequestChangeEmailFailedMessage[J] extends OutboundMessage[J, RequestChangeEmailFailedMessage[J]]

  trait RequestChangeEmailSucceededMessage[J] extends OutboundMessage[J, RequestChangeEmailSucceededMessage[J]]

  trait ActivateNewEmailFailedMessage[J] extends OutboundMessage[J, ActivateNewEmailFailedMessage[J]]

  trait ActivateNewEmailSucceededMessage[J] extends OutboundMessage[J, ActivateNewEmailSucceededMessage[J]]

}
