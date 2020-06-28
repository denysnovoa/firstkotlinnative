package com.app.firstkotlinnative

expect fun platformName(): String

class Greeting {
    fun greeting(): String = "Hello, ${platformName()}"
}