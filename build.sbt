lazy val myproject = project.settings(
  scalaVersion := "2.12.6",
  semanticdbEnabled := true,
  semanticdbVersion := scalafixSemanticdb.revision,
  scalacOptions ++= List(
    "-Ywarn-unused-import"
  )
)
