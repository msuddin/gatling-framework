package testDemo

import io.gatling.http.Predef._
import io.gatling.core.Predef._

class CampaignSimulation extends Simulation {

  val token: String = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ilg1ZVhrNHh5b2pORnVtMWtsMll0djhkbE5QNC1jNTdkTzZRR1RWQndhTmsifQ.eyJpc3MiOiJodHRwczovL2dsb2JhbGF1dGh1YXQuYjJjbG9naW4uY29tLzRkNDZkYjYxLTQ4ZTctNDczYi05NDViLTZiNzU0NGJkMWYyMS92Mi4wLyIsImV4cCI6MTU4MTAwMjkxNCwibmJmIjoxNTgwOTk5MzE0LCJhdWQiOiJiNTcxNzc0Yy05YzI5LTQwNGYtYTVjMi03MzEzNGYzZmU4OTgiLCJvaWQiOiI3MzM5OTlkMS1kZDA2LTQ2MzgtYWI0Yi1kOGEyZGYwYTI2ZjMiLCJzdWIiOiI3MzM5OTlkMS1kZDA2LTQ2MzgtYWI0Yi1kOGEyZGYwYTI2ZjMiLCJmYW1pbHlfbmFtZSI6IkZvckF1dG9tYXRpb24iLCJnaXZlbl9uYW1lIjoiQWRtaW5Vc2VyIiwibmFtZSI6ImFtaWRvdGVzdGVtYWlsK2RhZGFkbWluQGdtYWlsLmNvbSIsImVtYWlscyI6WyJhbWlkb3Rlc3RlbWFpbCtkYWRhZG1pbkBnbWFpbC5jb20iXSwidGZwIjoiQjJDXzFfREFYX1RFU1RfU2lnbkluIiwibm9uY2UiOiJsUnhCdjcwT2ZrbkJkRW5XZEdUZ2xjUDJVZ29VdmlBV3NLZXRLZDRKIiwic2NwIjoicmVhZCIsImF6cCI6ImI1NzE3NzRjLTljMjktNDA0Zi1hNWMyLTczMTM0ZjNmZTg5OCIsInZlciI6IjEuMCIsImlhdCI6MTU4MDk5OTMxNH0.Q_WDPbSRRpSt-tkFInXQJBmx_15MhC2wIkuA4VmTmv4_OPS5ybUnW2jT5oyy9U3vKOUtKE6NZkaQu3XnEF31hsqWn1O7FXj_dy13TU6FLl0iUmohIeh2GQMjjwrvIAAHpdi_fJVPpAJubwrsRQHafFK1ZY1znHfwVrMxaxBzeeKpfcVqgkGxtcy6zAQuBOfpaKB0-7bnrzwsH8ot83hMgK11A91mge9qgbma0yPPRzHwruNGcXGeoK-QKaOxB1sVGQMDuYDMzQLhr4sdliQaJ73U2OwcQOs5GJSThr3Yl91pfgNvynn4MK1yz8sAJnSecQsRzdGqQwIgEgBJ0z84Cg"
  val campaignId: String = "17"

  val httpConf = http
    .baseURL("https://test.dashboard.thisisdax.com/api")
    .authorizationHeader(s"Bearer $token")
    .acceptHeader("application/json, */*")
    .acceptCharsetHeader("UTF-8")

  val scn1 = scenario("Loading Campaign - Meta Data")
    .exec(
      http("Campaign - Meta Data")
        .get(s"/campaigns/$campaignId")
        .check(
          status.is(200),
          bodyString.saveAs("BODY")
        )
    )
    .exec(session => {
      val response = session("BODY").as[String]
      println(s"Response body: \n$response")
      session
    })

  val scn2 = scenario("Loading Campaign - Exposure Summary 01")
    .exec(
      http("Campaign - Exposure Summary")
        .get(s"/reporting/exposure-summary/$campaignId")
        .check(
          status.is(200),
          bodyString.saveAs("BODY")
        )
    )
    .exec(session => {
      val response = session("BODY").as[String]
      println(s"Response body: \n$response")
      session
    })

  val scn3 = scenario("Loading Campaign - Exposure Summary 02")
    .exec(
      http("Campaign - Exposure Summary")
        .get(s"/reporting/exposure-summary/$campaignId")
        .check(
          status.is(200),
          bodyString.saveAs("BODY")
        )
    )
    .exec(session => {
      val response = session("BODY").as[String]
      println(s"Response body: \n$response")
      session
    })

  val scn4 = scenario("Loading Campaign - Daily Exposure Summaries 01")
    .exec(
      http("Campaign - Daily Exposure Summary")
        .get(s"/reporting/daily-exposure-summaries/$campaignId")
        .check(
          status.is(200),
          bodyString.saveAs("BODY")
        )
    )
    .exec(session => {
      val response = session("BODY").as[String]
      println(s"Response body: \n$response")
      session
    })

  val scn5 = scenario("Loading Campaign - Daily Exposure Summaries 02")
    .exec(
      http("Campaign - Daily Exposure Summary")
        .get(s"/reporting/daily-exposure-summaries/$campaignId")
        .check(
          status.is(200),
          bodyString.saveAs("BODY")
        )
    )
    .exec(session => {
      val response = session("BODY").as[String]
      println(s"Response body: \n$response")
      session
    })

  val scn6 = scenario("Loading Campaign - Campaign Exposure Times 01")
    .exec(
      http("Campaign - Daily Exposure Summary")
        .get(s"/reporting/campaign-exposure-times/$campaignId")
        .check(
          status.is(200),
          bodyString.saveAs("BODY")
        )
    )
    .exec(session => {
      val response = session("BODY").as[String]
      println(s"Response body: \n$response")
      session
    })

  val scn7 = scenario("Loading Campaign - Campaign Exposure Times 02")
    .exec(
      http("Campaign - Daily Exposure Summary")
        .get(s"/reporting/campaign-exposure-times/$campaignId")
        .check(
          status.is(200),
          bodyString.saveAs("BODY")
        )
    )
    .exec(session => {
      val response = session("BODY").as[String]
      println(s"Response body: \n$response")
      session
    })

  setUp(
    scn1.inject(
      atOnceUsers(1)
    ),
    scn2.inject(
      atOnceUsers(1)
    ),
    scn3.inject(
      atOnceUsers(1)
    ),
    scn4.inject(
      atOnceUsers(1)
    ),
    scn5.inject(
      atOnceUsers(1)
    ),
    scn6.inject(
      atOnceUsers(1)
    ),
    scn7.inject(
      atOnceUsers(1)
    )
  )
  .protocols(httpConf)
}