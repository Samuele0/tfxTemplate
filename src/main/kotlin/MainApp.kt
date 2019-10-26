package com.github.samuele0.tfxtemplate
import tornadofx.App
import tornadofx.View
import tornadofx.hbox
import tornadofx.label

class MainApp : App(HelloWorld::class) {

}
class HelloWorld : View() {
    override val root = hbox {
        label("Hello, world!")
    }
}
