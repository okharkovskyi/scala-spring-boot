package com.okharkovskyi.bootiful.MyApp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


object ScalaApplication extends App {
  SpringApplication.run(classOf[SpringConfig], args: _*)
}

@SpringBootApplication
class SpringConfig {

}
