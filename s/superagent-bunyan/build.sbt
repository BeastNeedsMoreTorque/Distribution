organization := "org.scalablytyped"
name := "superagent-bunyan"
version := "5.2-dt-20190703Z-8432de"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-22b1fb",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-8c92b9",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200627Z-649ca8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
