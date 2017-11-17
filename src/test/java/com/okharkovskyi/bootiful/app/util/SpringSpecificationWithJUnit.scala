package com.okharkovskyi.bootiful.app.util

import org.specs2.mutable.SpecificationWithJUnit
import org.springframework.test.context.TestContextManager

trait SpringSpecificationWithJUnit extends SpecificationWithJUnit {
  private val springTestContextManager: TestContextManager = new TestContextManager(this.getClass)

  springTestContextManager.prepareTestInstance(this)
}