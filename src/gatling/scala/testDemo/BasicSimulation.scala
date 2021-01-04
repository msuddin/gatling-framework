package testDemo

import io.gatling.http.Predef._
import io.gatling.core.Predef._

class BasicSimulation extends Simulation {

  val httpConf = http.baseUrl("https://www.ikea.com/")

  val scn = scenario("Basic Simulation")
    .exec(http("IKEA Landing Page")
      .get("/"))
    .pause(5)

  setUp(
    scn.inject(
      atOnceUsers(1)
    )
  ).protocols(httpConf)
}