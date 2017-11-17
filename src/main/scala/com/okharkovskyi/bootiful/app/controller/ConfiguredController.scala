package com.okharkovskyi.bootiful.app.controller

import com.okharkovskyi.bootiful.app.config.CustomConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class ConfiguredController @Autowired()(config: CustomConfig) {

  @RequestMapping(Array("/data"))
  def whatDoIKnow() = {
    s"I know that ${config.customUUID} knows magic number: ${config.magicNumber}"
  }
}
