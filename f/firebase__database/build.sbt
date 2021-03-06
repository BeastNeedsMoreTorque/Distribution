organization := "org.scalablytyped"
name := "firebase__database"
version := "0.6.6-1f2179"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.6.1-924929",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.5-baeb5e",
  "org.scalablytyped" %%% "firebase__component" % "0.1.15-3e36ec",
  "org.scalablytyped" %%% "firebase__database-types" % "0.5.1-49d956",
  "org.scalablytyped" %%% "firebase__logger" % "0.2.5-9e97a2",
  "org.scalablytyped" %%% "firebase__util" % "0.2.50-04c0ec",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
