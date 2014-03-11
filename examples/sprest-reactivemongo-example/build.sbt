resolvers += "spray repo" at "http://repo.spray.io"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/service/local/repositories/snapshots/content"

resolvers += "Mark Schaake Releases" at "http://markschaake.github.com/releases"

scalaVersion := "2.10.3"

name := "sprest-reactivemongo-example"

scalacOptions += "-feature"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.2.3",
  "ch.qos.logback" % "logback-classic" % "1.0.1",
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.3",
  "sprest" %% "sprest-reactivemongo" % "0.3.2",
  "org.specs2" %% "specs2" % "2.2" % "test"
)

seq(Revolver.settings: _*)

seq(coffeeSettings: _*)

seq(lessSettings:_*)
