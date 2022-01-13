lazy val myproject = project.settings(
  scalaVersion := "2.13.8",
  semanticdbEnabled := true,
  semanticdbVersion := scalafixSemanticdb.revision,
  scalacOptions ++= List(
    "-Wunused"
  )
)
