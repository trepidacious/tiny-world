name := "tiny-world"

version := "0.1"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalaz"         % "scalaz-core_2.10"       % "7.0.6",
  "org.scalaz"         % "scalaz-effect_2.10"     % "7.0.6",
  "org.scalaz"         % "scalaz-concurrent_2.10" % "7.0.6"    % "test",
  "org.scala-stm"      %% "scala-stm"             % "0.7"      % "test",
  "com.typesafe.slick" %% "slick"                 % "1.0.0"    % "test",
  "org.slf4j"          % "slf4j-nop"              % "1.6.4"    % "test",
  "com.h2database"     % "h2"                     % "1.3.170"  % "test"  
)           





