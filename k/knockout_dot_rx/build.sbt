organization := "org.scalablytyped"
name := "knockout_dot_rx"
version := "1.0-dt-20200515Z-563744"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20200515Z-995118",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200515Z-268656",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20200515Z-ec0778",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
