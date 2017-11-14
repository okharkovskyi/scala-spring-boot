package com.okharkovskyi.bootiful.app

import org.springframework.boot.actuate.health.{Health, HealthIndicator}
import org.springframework.stereotype.Component

@Component
class CustomHealthCheck extends HealthIndicator {
  override def health(): Health = {
    val healthBuilder = new Health.Builder()
    if(Math.random()>0.5d)
      healthBuilder.up().build()
    else
      healthBuilder.outOfService().withDetail("reason", "Something went terribly wrong").build()
  }
}
