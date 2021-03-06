organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20200515Z-c23ba1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200520Z-17bf41",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-e72aa3",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20200515Z-0636b7",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20200515Z-8bc104",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
