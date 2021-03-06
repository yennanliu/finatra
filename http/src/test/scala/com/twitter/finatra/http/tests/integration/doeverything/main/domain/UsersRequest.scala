package com.twitter.finatra.http.tests.integration.doeverything.main.domain

import com.twitter.finatra.http.annotations.QueryParam
import com.twitter.finatra.validation.constraints.{Max, PastTime}
import org.joda.time.DateTime

case class UsersRequest(
  @Max(100) @QueryParam max: Int,
  @PastTime @QueryParam startDate: Option[DateTime],
  @QueryParam verbose: Boolean = false)
