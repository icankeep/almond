package org.apache.spark.sql.almondinternals
import argonaut._
import argonaut.Argonaut._

final case class CancelStageReq(stageId: Int)

object CancelStageReq {
  import argonaut.ArgonautShapeless._
  implicit val decoder = DecodeJson.of[CancelStageReq]
}
