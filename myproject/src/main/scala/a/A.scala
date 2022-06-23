import scala.concurrent.Future
object a {
  // scalafix 0.9.34 still has the bug
  // scalafix 0.10.1 still has the bug

  // it's weird that running sbt scalafix doesn't always change the 2 lines, but when running sbt clean before then it is changing the 2 lines
  // when running sbt scalafix repeteadly sometimes the 2 lines don't change, sometimes they do, but if they change they both do
  // anyways the desired behaviour of having only the var line fixed never occurs, hence something is to be fixed
  implicit val x: List[Int] = 3 :: 42 :: Nil
  implicit var v: List[String] = "3" :: "42" :: Nil
}
