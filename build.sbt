
name := "aws-lambda-scala-json-example"

version := "1.0"

scalaVersion := "2.11.8"

val circeVersion = "0.5.1"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.1.0"

libraryDependencies += "com.amazonaws" % "aws-lambda-java-events" % "1.1.0"

libraryDependencies += "com.amazonaws" % "aws-lambda-java-log4j" % "1.0.0"

libraryDependencies += "com.amazonaws" % "aws-java-sdk-cloudsearch" % "1.11.25"
libraryDependencies += "com.amazonaws" % "aws-java-sdk-ses" % "1.11.25"

libraryDependencies += "log4j" % "log4j" % "1.2.17"