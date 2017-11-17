package com.okharkovskyi.bootiful.app

import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.springboot.SpringTestContextManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@RunWith(classOf[SpringRunner])
@SpringBootTest
@AutoConfigureMockMvc
class GreetingControllerScalaTest extends FunSpec with SpringTestContextManager {

  @Autowired() var mockMvc: MockMvc = _

  describe("GreetingController") {
    it("should respond with Message(Hello World) on /hello endpoint") {
      var response =
        mockMvc
          .perform(MockMvcRequestBuilders.get("/hello"))

      response
        .andExpect(MockMvcResultMatchers.status().is(200))
        .andExpect(MockMvcResultMatchers.content().json("""{message: "Hello World"}"""))
    }
  }

}
