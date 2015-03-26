name := "Gantt"

version := "0.9.0-SNAPSHOT"

scalaVersion := "2.11.1"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

resolvers ++= Seq("nparry.com" at "http://repository.nparry.com/releases",
                  "typesafe"   at "http://repo.typesafe.com/typesafe/releases",
                  "eaio.com"   at "http://eaio.com/maven2")

libraryDependencies ++= Seq("log4j"                %  "log4j"        % "1.2.16" % "compile",
                            "org.specs2"           %  "specs2_2.11"  % "2.3.12" % "test",
                            "org.mockito"          %  "mockito-all"  % "1.9.0"  % "test",
                            "org.scalacheck"       %% "scalacheck"   % "1.11.4" % "test",
                            "junit"                %  "junit"        % "4.7"    % "test",
                            "org.scala-lang"       %  "scala-actors" % "2.11.1",
                            "com.eaio.uuid"        %  "uuid"         % "3.2")

testOptions in Test += Tests.Argument(TestFrameworks.Specs2, "junitxml", "console", "showtimes")

unmanagedBase := baseDirectory.value / "lib"

ScctPlugin.instrumentSettings

parallelExecution in ScctTest := false

parallelExecution in Scct := false

parallelExecution in Test := false

logBuffered := false


