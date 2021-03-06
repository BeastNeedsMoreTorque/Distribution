organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-c6710c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.1.1-bc2eb2",
  "org.scalablytyped" %%% "samchon" % "2.1.4-6bd732",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "sxml" % "1.0.4-baab43",
  "org.scalablytyped" %%% "tstl" % "2.4.10-add8c9",
  "org.scalablytyped" %%% "url-variables" % "1.0.3-9844a7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
