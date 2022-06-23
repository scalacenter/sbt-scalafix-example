import scala.concurrent.Future
object a {
  // scalafix 0.9.34 still has the bug
  // scalafix 0.10.1 doesn't have the bug
  implicit val x = 3 :: 42 :: Nil
  implicit var v = "3" :: "42" :: Nil
}
