lazy val myproject = project.settings(
  scalaVersion := "3.9.0",
  semanticdbEnabled := true,
  scalacOptions ++= List(
    "-Wunused:all"
  )
)
