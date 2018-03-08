package com.github.shafiquejamal.accessmessage

import java.util.UUID

trait Message[T <: Message[T]] {

  def iD: UUID
  
}
