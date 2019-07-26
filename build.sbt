import sbtcrossproject.CrossPlugin.autoImport.{crossProject, CrossType}
lazy val root = crossProject(JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .in(file("."))
  .settings(
    scalaVersion := "2.11.12",
  )
