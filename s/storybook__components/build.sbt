organization := "org.scalablytyped"
name := "storybook__components"
version := "5.3.19-58659a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-934451",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-a2accd",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-250146",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-7dfe58",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-8cb514",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-06730c",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-56e130",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "11.0-dt-20200515Z-30bbda",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.19-246eca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
