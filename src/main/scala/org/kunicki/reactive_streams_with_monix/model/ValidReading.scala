package org.kunicki.reactive_streams_with_monix.model

import scala.util.Random

sealed trait Reading {

  def id: Int
}

case class ValidReading(id: Int, value: Double = Random.nextDouble()) extends Reading

case class InvalidReading(id: Int) extends Reading
