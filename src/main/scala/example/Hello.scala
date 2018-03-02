package example

object Test extends App {
  def test()(implicit s: String): String = s

  implicit val str: String = "test"

  println(test())
}
