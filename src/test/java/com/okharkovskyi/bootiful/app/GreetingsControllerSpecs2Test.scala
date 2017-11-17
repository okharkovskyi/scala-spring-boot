package com.okharkovskyi.bootiful.app

import com.okharkovskyi.bootiful.app.controller.Message
import com.okharkovskyi.bootiful.app.util.SpringSpecificationWithJUnit
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@RunWith(classOf[SpringRunner])
@AutoConfigureMockMvc
@SpringBootTest
class GreetingsControllerSpecs2Test extends SpringSpecificationWithJUnit {

  @Autowired var mockMvc: MockMvc = _

  "GreetingsController" should {
    "return Message(Hello World) on /hello endpoint" in {
      var response =
        mockMvc
          .perform(MockMvcRequestBuilders.get("/hello"))

      val expectedJson = """{message: "Hello World"}"""

      response
        .andExpect(MockMvcResultMatchers.status().is(200))
        .andExpect(MockMvcResultMatchers.content().json(expectedJson))

      ok
    }
  }

}
