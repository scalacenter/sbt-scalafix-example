lazy val myproject = project.settings(
  scalaVersion := "3.3.5",
  semanticdbEnabled := true,
  scalacOptions ++= List(
    "-Wunused:all"
  )
)
