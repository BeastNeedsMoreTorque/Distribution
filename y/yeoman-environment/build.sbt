organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20200227Z-f677a1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-17b669",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-1a97ed",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-51c44e",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-9cdce8",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-5818d2",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200515Z-b6eed2",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20200515Z-6b68c1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
