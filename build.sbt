lazy val myproject = project.settings(
  scalaVersion := "3.3.4",
  semanticdbEnabled := true,
  scalacOptions ++= List(
    "-Wunused:all"
  )
)
