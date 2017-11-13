package com.okharkovskyi.bootiful.app

import com.okharkovskyi.bootiful.app.jackson.JacksonConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import


object ScalaApplication extends App {
  SpringApplication.run(classOf[SpringConfig], args: _*)
}

@SpringBootApplication
@Import(classOf[JacksonConfig])
class SpringConfig {

}
