import scala.concurrent.Future
object a {
  // the bug is reproduced, the memberKind config is ignored, implicit val shouldn't be touched
  implicit val x: List[Int] = 3 :: 42 :: Nil
  implicit var v: List[Int] = 3 :: 42 :: Nil
}
