package vn.dxg.tikihomedemo.utils

import android.view.View

val View.isVisible: Boolean
  get() = visibility == View.VISIBLE

val View.isInvisible: Boolean
  get() = visibility == View.INVISIBLE

val View.isGone: Boolean
  get() = visibility == View.GONE

fun View.visible() {
  visibility = View.VISIBLE
}

fun View.invisible() {
  visibility = View.INVISIBLE
}

fun View.gone() {
  visibility = View.GONE
}

fun View.disable() {
  isEnabled = false
}

fun View.enable() {
  isEnabled = true
}