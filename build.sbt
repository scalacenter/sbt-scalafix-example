lazy val myproject = project.settings(
  scalaVersion := "2.12.11",
  semanticdbEnabled := true,
  semanticdbVersion := scalafixSemanticdb.revision
  // with -Wunused compilation fails
//  scalacOptions ++= List(
//    "-Wunused"
//  )
)
