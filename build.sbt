ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.GitHub.DCameronMauch"

lazy val mainDependencies: Seq[ModuleID] = Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % "2.6.4"
)

lazy val testDependencies: Seq[ModuleID] = Seq(
  "org.scalatest" %% "scalatest" % "3.1.1"
)

lazy val allDependencies: Seq[ModuleID] = mainDependencies ++ testDependencies.map(_ % Test)

lazy val root = (project in file("."))
  .settings(
    assemblyJarName in assembly := "akka.jar",
    libraryDependencies ++= allDependencies,
    name := "Akka",
    test in assembly := {}
  )
