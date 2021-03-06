organization := "org.scalablytyped"
name := "rsocket-websocket-server"
version := "0.0-dt-20200515Z-356e5c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20200218Z-802dbc",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20200515Z-f0b2c2",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20200515Z-555020",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200629Z-e2bf41")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
