enablePlugins(ScalaJSPlugin)

name := "Dojo Scala.js Intro"

scalaVersion := "2.11.6"

libraryDependencies += "org.monifu" %%% "minitest" % "0.12" % "test"

testFrameworks += new TestFramework("minitest.runner.Framework")
