crossScalaVersions := Seq("2.11.12", "2.12.8")

wartremoverWarnings ++= Warts.all

wartremoverWarnings += Wart.JavaConversions
