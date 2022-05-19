name := "dfdl-ntp"

organization := "com.owlcyberdefense.ntp"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.15"

libraryDependencies ++= Seq(
  "com.github.sbt" % "junit-interface" % "0.13.2" % "test",
  "junit" % "junit" % "4.13.2" % "test",
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.3.0" % "test",
  "org.apache.logging.log4j" % "log4j-core" % "2.17.1" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false

