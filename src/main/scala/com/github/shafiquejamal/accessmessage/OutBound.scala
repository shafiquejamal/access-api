package com.github.shafiquejamal.accessmessage

object OutBound {

  trait LoginAttemptResultMessage

  trait YourLoginAttemptFailedMessage extends LoginAttemptResultMessage

  trait YourLoginAttemptSucceededMessage extends LoginAttemptResultMessage {

    def username: String

    def email: String

    def payload: String

  }

  trait PasswordResetCodeSentMessage {

  }

  trait PasswordResetSuccessfulMessage {

  }

  trait PasswordResetFailedMessage {

  }

  trait EmailIsAvailableMessage {

    def email: String

    def emailIsAvailable: Boolean

  }

  trait UsernameIsAvailableMessage {

    def username: String

    def usernameIsAvailable: Boolean

  }

  trait RegistrationAttemptResultMessage

  trait YourRegistrationAttemptFailedMessage extends RegistrationAttemptResultMessage

  trait YourRegistrationAttemptSucceededMessage extends RegistrationAttemptResultMessage

  trait AccountActivationAttemptResultMessage

  trait AccountActivationAttemptFailedMessage extends AccountActivationAttemptResultMessage {

    def errorMessage: String

  }

  trait AccountActivationAttemptSucceededMessage extends AccountActivationAttemptResultMessage

  trait AccountActivationCodeCreator {

    def generate(toHash: String, key: String): String

    def isMatch(toHash: String, toCheck: String, key: String): Boolean

  }

  trait ResendActivationCodeResultMessage {

    def message: String

  }

  trait YouAreAlreadyAuthenticatedMessage

  trait LoggingYouOutMessage

  trait ChangePasswordAttemptResultMessage

  trait ChangePasswordFailedMessage extends ChangePasswordAttemptResultMessage

  trait ChangePasswordSucceededMessage extends ChangePasswordAttemptResultMessage

}
