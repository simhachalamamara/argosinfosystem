package com.argosinfo.argosinfosystem

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = ArgosinfosystemApplication)
class ArgosinfosystemApplicationSpoc extends Specification {

    @Autowired
    ApplicationContext context

    def "context is as expected"() {
        expect:
        context
        context.getBean("echoService")
    }
}
