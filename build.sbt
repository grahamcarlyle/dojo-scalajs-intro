enablePlugins(ScalaJSPlugin)

name := "Dojo Scala.js Intro"

scalaVersion := "2.11.6"

libraryDependencies += "org.monifu" %%% "minitest" % "0.12" % "test"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

testFrameworks += new TestFramework("minitest.runner.Framework")
