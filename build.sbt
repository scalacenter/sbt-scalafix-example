lazy val myproject = project.settings(
  scalaVersion := "3.3.6",
  semanticdbEnabled := true,
  scalacOptions ++= List(
    "-Wunused:all"
  )
)
