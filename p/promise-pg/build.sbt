organization := "org.scalablytyped"
name := "promise-pg"
version := "0.0-unknown-dt-20200515Z-f7719f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "pg" % "7.14-dt-20200515Z-16d6a3",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20200515Z-54c1db",
  "org.scalablytyped" %%% "q" % "1.5-dt-20200515Z-4aa10c",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
