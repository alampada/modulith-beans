package com.example.modulith.beans.b.nested

import org.springframework.stereotype.Service

@Service
class PrivateService {

  fun doesPrivateStuff(): String = "42"
}
