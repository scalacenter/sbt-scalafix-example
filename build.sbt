lazy val myproject = project.settings(
  scalaVersion := "3.3.8",
  semanticdbEnabled := true,
  scalacOptions ++= List(
    "-Wunused:all"
  )
)
