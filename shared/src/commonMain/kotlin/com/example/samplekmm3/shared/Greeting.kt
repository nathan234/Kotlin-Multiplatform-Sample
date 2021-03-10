package com.example.samplekmm3.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun bye(): String {
        return "Bye, ${Platform().platform}"
    }
}
