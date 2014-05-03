import sbt._

object dependencies {
  
  object V {
    val Reactivemongo = "0.10.0"
  }

  val playJson = "com.typesafe.play" %% "play-json" % "2.2.2"
  val playReactiveMongo = "org.reactivemongo" %% "play2-reactivemongo" % "0.10.2"
  val reactiveMongo = "org.reactivemongo" %% "reactivemongo" % V.Reactivemongo
  
  val jodaTime = "joda-time" % "joda-time" % "2.1"
  val jodaConvert = "org.joda" % "joda-convert" % "1.4"
  
  val junit = "junit" % "junit" % "4.5"
  val junitInterface = "com.novocode" % "junit-interface" % "0.6"
  val specs2 = "org.specs2" %% "specs2" % "1.12.3"
  
  val mongoDependencies =
    Seq(reactiveMongo, jodaTime, jodaConvert)

  val recordDependencies =
    Seq(playReactiveMongo, playJson)
    
  val coreDependencies =
    Seq(playReactiveMongo, playJson)
    
  val recordDslDependencies =
    Seq(junit % "test", specs2 % "test", junitInterface % "test")
}
