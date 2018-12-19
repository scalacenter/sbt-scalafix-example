lazy val myproject = project.settings(
  scalaVersion := "2.12.7",
  addCompilerPlugin(scalafixSemanticdb),
  scalacOptions ++= List(
    "-Yrangepos",
    "-Ywarn-unused"
  )
)
