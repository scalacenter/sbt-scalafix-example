import scala.concurrent.Future
object a {
  // the bug is reproduced, the memberKind config is ignored
  implicit val x = 3 :: 42 :: Nil
  implicit var v = 3 :: 42 :: Nil
}
