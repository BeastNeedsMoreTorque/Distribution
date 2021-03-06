organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-cognito-identity"
version := "0.1.0-preview.2-f5e943"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity-browser" % "0.1.0-preview.2-b083f9",
  "org.scalablytyped" %%% "aws-sdk__middleware-stack" % "0.1.0-preview.2-6de174",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-a2bb1b",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
