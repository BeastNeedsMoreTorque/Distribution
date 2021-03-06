organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20200515Z-ba593e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20200515Z-5658c3",
  "org.scalablytyped" %%% "markdown-it" % "v10.0.0-dt-20200426Z-7f4a4b",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20200515Z-53ca59",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20200515Z-611dde",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20200515Z-367e01",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
