organization := "org.scalablytyped"
name := "jointjs"
version := "3.0.4-32771b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20190619Z-f444dc",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-e99267",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-830e2a",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190918Z-94766d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        