version := "0.0.1-SNAPSHOT"

crossSbtVersions := Vector("0.13.16", "1.0.3")

lazy val root = (project in file("foo"))
  .settings(
    sbtPlugin := true
  )
