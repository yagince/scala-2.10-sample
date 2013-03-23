import sbt._
import Keys._

object Dependencies {
  val resolvers = Seq(
    "Typesage Releases"  at "http://repo.typesafe.com/typesafe/maven-releases",
    "Typesage Snapshots" at "http://repo.typesafe.com/typesafe/maven-snapshots",
    "Sonatype Releases"  at "http://oss.sonatype.org/content/repositories/releases",
    "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots"
  )

  val libraries = Seq(
    "org.specs2" %% "specs2" % "1.14" % "test"
  )
}
