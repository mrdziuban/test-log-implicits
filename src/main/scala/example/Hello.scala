package example

import example.implicits._

object Test extends App {
  def test()(implicit s: String): String = s

  println(test())
}
