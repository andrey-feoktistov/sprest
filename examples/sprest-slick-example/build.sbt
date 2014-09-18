resolvers += "spray repo" at "http://repo.spray.io"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Sprest Releases" at "http://sprest.io/releases"

scalaVersion := "2.10.3"

name := "sprest-slick-example"

scalacOptions += "-feature"

libraryDependencies ++= Seq(
  "postgresql" % "postgresql" % "9.1-901.jdbc4",
  "com.typesafe.akka" %% "akka-actor" % "2.2.3",
  "ch.qos.logback" % "logback-classic" % "1.0.1",
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.3",
  "sprest" %% "sprest-slick" % "0.3.2",
  "org.specs2" %% "specs2" % "2.2" % "test"
)

seq(Revolver.settings: _*)

seq(coffeeSettings: _*)

seq(lessSettings:_*)
