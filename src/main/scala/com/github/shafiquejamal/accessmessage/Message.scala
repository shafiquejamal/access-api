package com.github.shafiquejamal.accessmessage

trait Message[T <: Message[T]] {

  def previousMessages: Seq[Message[_]]

  def add(m: Message[_]): T

}
