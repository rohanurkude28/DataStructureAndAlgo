import Dependencies._

ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "edu.rohan.ds"

lazy val root = (project in file("."))
  .settings(
    name := "DataStructureAndAlgo",
    libraryDependencies += scalaTest % Test
  )
