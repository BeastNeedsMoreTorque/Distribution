organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-f429d7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.5-264795",
  "org.scalablytyped" %%% "apollo-client" % "2.6.10-6e954d",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-6f7d74",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.3-4d4c37",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "graphql" % "14.6.0-578a82",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "redux" % "4.0.5-86d675",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-23d451",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20200515Z-677fcc",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-71140e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
