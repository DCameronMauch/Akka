package com.GitHub.DCameronMauch.Akka.actor

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl._

object Counter {
  sealed trait Message
  final case object Get extends Message

  def apply(): Behavior[Message] =
    Behaviors.setup(context => new Counter(context))
}

import Counter.{Get, Message}

class Counter(context: ActorContext[Message]) extends AbstractBehavior[Message](context) {
  def onMessage(message: Message): Behavior[Message] =
    message match {
      case Get =>
        println("foo")
        this
    }
}
