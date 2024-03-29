name := "flight_prediction"

version := "0.1"

scalaVersion := "2.12.9"

val sparkVersion = "2.4.4"

mainClass in Compile := Some("scala.MakePrediction")

resolvers ++= Seq(
  "apache-snapshots" at "https://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.spark" % "spark-sql-kafka-0-10_2.12" % sparkVersion,
  "org.mongodb.spark" %% "mongo-spark-connector" % "2.4.1",
  "org.mongodb.scala" %% "mongo-scala-bson" % "1.2.0"

)
