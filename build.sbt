lazy val myproject = project.settings(
  scalaVersion := "2.12.15",
  semanticdbEnabled := true,
  semanticdbVersion := scalafixSemanticdb.revision
  // with -Wunused compilation fails
//  scalacOptions ++= List(
//    "-Wunused"
//  )
)
