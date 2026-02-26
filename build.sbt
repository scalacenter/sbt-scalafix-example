lazy val myproject = project.settings(
  scalaVersion := "3.3.7",
  semanticdbEnabled := true,
  scalacOptions ++= List(
    "-Wunused:all"
  )
)
