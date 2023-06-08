lazy val myproject = project.settings(
  scalaVersion := "2.13.11",
  semanticdbEnabled := true,
  semanticdbVersion := scalafixSemanticdb.revision,
  scalacOptions ++= List(
    "-Wunused"
  )
)
