package com.company

abstract class RealMe:Mobile {
  abstract  override fun camera(): String

  abstract  override fun ram(): String
  abstract override fun price(): Int
  override fun OS() = "color OS 6"
}