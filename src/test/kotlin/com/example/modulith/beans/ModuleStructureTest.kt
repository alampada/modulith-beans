package com.example.modulith.beans

import org.junit.jupiter.api.Test
import org.springframework.modulith.core.ApplicationModules


class ModuleStructureTest {

  @Test
  fun validateModules() {
    ApplicationModules.of(BeansApplication::class.java).verify()
  }
}