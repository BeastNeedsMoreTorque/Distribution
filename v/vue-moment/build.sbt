organization := "org.scalablytyped"
name := "vue-moment"
version := "4.0-dt-20200515Z-046cb9"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "moment" % "2.27.0-da83b2",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "vue" % "2.6.11-cf582f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
