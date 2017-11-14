package com.okharkovskyi.bootiful.app.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

import scala.beans.BeanProperty

@ConfigurationProperties("internal")
@Component
case class CustomConfig() {
  @BeanProperty var customUUID: String = _
  @BeanProperty var magicNumber: Int = _
}
