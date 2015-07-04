import sbt._
import sbt.Keys._

object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="norm"$",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "$scala_version$",
      scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
      retrieveManaged := true,
      libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.4" % "test",
	"org.scalacheck" %% "scalacheck" % "1.11.3" % "test",
	"junit" % "junit" % "4.11" % "test"
      )
    ) ++ net.virtualvoid.sbt.graph.Plugin.graphSettings
  )
}
