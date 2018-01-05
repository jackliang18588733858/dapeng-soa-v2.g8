
name := "$name$"

version := "$version$"

scalaVersion := "$scalaVersion$"

sbtPlugin := true

organization := "$organization$"

resolvers += Resolver.mavenLocal

lazy val commonSettings = Seq(
  organization := "$organization$",
  version := "$version$",
  scalaVersion := "$scalaVersion$"
)

lazy val api = (project in file("$name$-api"))
  .settings(
    commonSettings,
    name := "$name$-api",
    libraryDependencies ++= Seq(
      "com.isuwang" % "dapeng-core" % "$dapengVersion$",
      "com.isuwang" % "dapeng-client-netty" % "$dapengVersion$",
      "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0"
    )
  ).enablePlugins(ThriftGeneratorPlugin)


lazy val service = (project in file("$name$-service"))
  .dependsOn( api )
  .settings(
    commonSettings,
    name := "$name$_service",
    libraryDependencies ++= Seq(
      "com.isuwang" % "dapeng-spring" % "$dapengVersion$",
      "com.github.wangzaixiang" %% "scala-sql" % "2.0.0",
      "org.slf4j" % "slf4j-api" % "1.7.13",
      "ch.qos.logback" % "logback-classic" % "1.1.3",
      "ch.qos.logback" % "logback-core" % "1.1.3",
      "org.codehaus.janino" % "janino" % "2.7.8", //logback (use if condition in logBack config file need this dependency)
      "mysql" % "mysql-connector-java" % "5.1.36",
      "com.alibaba" % "druid" % "1.0.17",
      "org.springframework" % "spring-context" % "4.2.4.RELEASE",
      "com.isuwang" % "dapeng-registry-zookeeper" % "$dapengVersion$",
      "com.isuwang" % "dapeng-client-netty" % "$dapengVersion$"
    )).enablePlugins(ImageGeneratorPlugin)
    .enablePlugins(DbGeneratorPlugin)
  .enablePlugins(RunContainerPlugin)