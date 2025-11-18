name := "dfdl-ntp"

organization := "com.owlcyberdefense"

//
// Final assembly DFDL schemas should be setup to create a lib_managed baseDirectory
// This makes it easy to provide tools access to the required dependency jar files.
//
retrieveManaged := true

useCoursier := false // because of bug, retrieveManaged won't work without this

version := "1.0.0"

// defaults to version of daffodil used by daffodil-sbt plugin
// daffodilVersion := "4.0.0" // or can be 3.11.0, 3.10.0, 3.9.0, 3.7.0, 3.4.0

enablePlugins(DaffodilPlugin)

daffodilPackageBinVersions := Seq(daffodilVersion.value)

daffodilPackageBinInfos := Seq(
  DaffodilBinInfo(
    schema = "/com/owlcyberdefense/ntp/xsd/ntp-root.dfdl.xsd")
)

daffodilTdmlUsesPackageBin := true
