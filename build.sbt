import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.meliore"
ThisBuild / organizationName := "Meliore Ltd"

lazy val root = (project in file("."))
  .settings(
    name := "shopping-cart",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      mockitoScala % Test
    )
  )

