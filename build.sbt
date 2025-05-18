val scala3Version = "3.7.0"

lazy val root = project
  .in(file("."))
  .enablePlugins(RedactedPlugin)
  .settings(
    name := "Redacted exercise",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    redactedVersion := "0.9.0",
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
