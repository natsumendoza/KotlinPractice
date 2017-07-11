package classes

import interfaces.Clickable
import interfaces.Focusable

/**
 * Created by Jay-Ar Gabriel on 6/29/2017.
 */
class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() = super<Clickable>.showOff()

}