organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20200515Z-63abcd"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20200515Z-5bcbd5",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20200515Z-1d89e5",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20200515Z-b1049e",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20200515Z-bdc640",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20200515Z-16f14e",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
