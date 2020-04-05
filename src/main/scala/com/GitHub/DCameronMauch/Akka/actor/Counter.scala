package com.GitHub.DCameronMauch.Akka.actor

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors

object Counter {
  sealed trait Message
  final case object Get extends Message

  def apply(): Behavior[Message] = Behaviors.receive(
    (context, message) =>
    message match {
      case Get => println("got get message")
    }
  )
}
