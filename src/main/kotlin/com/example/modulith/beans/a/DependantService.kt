package com.example.modulith.beans.a

import com.example.modulith.beans.b.PublishedService
import com.example.modulith.beans.b.nested.PrivateService
import org.springframework.stereotype.Service
import org.springframework.web.client.RestClient

@Service
class DependantService(
  val publishedService: PublishedService,
//  val privateService: PrivateService  // if we uncomment this line,  then this breaks the module tests as expected
  val restClient: RestClient // why does this doesn't break the module tests?
) {
}