package domain

import java.util.UUID

import play.api.libs.json.Json

/**
  * Created by sanXion on 2016/11/24.
  */
case class Complaint (id : String,
                      author : Organization,
                      title : String,
                      description : String,
                      date : String = Date,
                      dateSubmitted : String = Date,
                      dateAnswered : String = Date,
                      dateEscalated : String = Date,
                      dateDecision : String = Date,
                      dateCanceled : String = Date,
                      status : String,
                      ttype : String,
                      resolutionType : String,
                      satisfied : Boolean,
                      decision : String,
                      cancellationReason : String,
                      relatedLot : String,
                      tendererAction : String,
                      documents : List[Document],
                      tendererActionDate : String = Date)

object Complaint{
  implicit val complaintFmt = Json.format[Complaint]
}