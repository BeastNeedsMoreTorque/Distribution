organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "2.3.3-aa4259"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20200515Z-ae32b3",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20200515Z-828fde",
  "org.scalablytyped" %%% "gaxios" % "2.3.1-46e384",
  "org.scalablytyped" %%% "google-auth-library" % "5.10.1-5f8953",
  "org.scalablytyped" %%% "gtoken" % "4.1.4-65912d",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-0aab50",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
