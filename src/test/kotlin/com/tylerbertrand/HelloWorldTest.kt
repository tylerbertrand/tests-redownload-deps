package com.tylerbertrand

import org.junit.jupiter.api.Test

internal class HelloWorldTest {

    private val helloWorld: HelloWorld = HelloWorld()

    @Test
    fun testHelloWorld() {
        helloWorld.hello()
    }

    @Test
    fun testHiWorld() {
        helloWorld.hi()
    }
}
