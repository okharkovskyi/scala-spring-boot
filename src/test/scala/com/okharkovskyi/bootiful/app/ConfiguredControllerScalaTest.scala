package com.okharkovskyi.bootiful.app

import com.okharkovskyi.bootiful.app.config.CustomConfig
import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.springboot.SpringTestContextManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@RunWith(classOf[SpringRunner])
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles(Array("test"))
class ConfiguredControllerScalaTest  extends FunSpec with SpringTestContextManager {
  @Autowired() var mockMvc: MockMvc = _
  @Autowired() var config: CustomConfig = _

  describe("ConfiguredController") {
    it("should respond with certain text on /data endpoint") {
      val response =
        mockMvc
          .perform(MockMvcRequestBuilders.get("/data"))

      val expectedResponse = s"I know that ${config.customUUID} knows magic number: ${config.magicNumber}"

      response
        .andExpect(MockMvcResultMatchers.status().is(200))
        .andExpect(MockMvcResultMatchers.content().string(expectedResponse))
    }
  }
}
