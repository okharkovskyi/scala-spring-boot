package com.okharkovskyi.bootiful.app.controller

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class GreetingController {

  @RequestMapping(Array("/hello"))
  def hello: Message = {
    Message("Hello World")
  }
}

case class Message(message: String)
