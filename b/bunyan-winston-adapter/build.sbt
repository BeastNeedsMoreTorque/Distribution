organization := "org.scalablytyped"
name := "bunyan-winston-adapter"
version := "0.2-dt-20200515Z-44bd62"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-22b1fb",
  "org.scalablytyped" %%% "logform" % "2.2.0-8f7c56",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "winston" % "3.3.3-8a1bb4",
  "org.scalablytyped" %%% "winston-transport" % "4.4.0-c91063")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
