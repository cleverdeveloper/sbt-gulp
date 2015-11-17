sbtPlugin := true

name := "sbt-gulp"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq()

addSbtPlugin("com.typesafe.sbt" % "sbt-js-engine" % "1.1.3")

scriptedSettings

scriptedLaunchOpts += s"-Dproject.version=${version.value}"
