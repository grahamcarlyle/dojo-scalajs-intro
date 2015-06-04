# Getting started

## Get compiling to Javascript

* Clone the repo
* Start sbt
* Run the sbt task "fastOptJS"
 + this compiles the Scala to javascript in directory target/scala-2.11/
* Open the HTML in a browser to check the javascript has been
  compiled correctly and run (file index.html)
 + Verify by looking for the scala println output from the main def
   has appeared in the console

## Get your IDE ready

* Import the SBT project into Intellij or whatever

## See source maps working in the browser

* In intro.IntroApp.main method Change the "limit" val to be 1 to force a
  runtime error
* Run the sbt task "fastOptJS" to update the Javascript (or re-compile on
  scala file change by using ~fastOptJS)
* Ensure your browser will pause on exceptions
* View the page and see call stack of the corresponding Scala code to the
  JavaScript using the power of source maps, and track it back to the call
  from the JavaScript in the web page.

## Run some tests

The ScalaTest, the common Scala testing framework relies on a reflection which
doesn't work with Scala.js. So lets look at the test written with another
testing framework.

* Run the tests with the sbt task "test"
* Add a test for the exception example
* Fix the test

## Write some pure scala code

* Uncomment the Fibonacci test
* Make it pass