package com.company

class CustomMobile(private var _name:String,
                   private var _camera:Int=12,
                   private var _ram:Int=4,
                   private var _OS:String="Android"
                      ):Mobile {
       private val ramPrice=1000
       private val cameraPrice=100
       private val extraBuildCost = 5000
       override fun name(): String =_name

       override fun camera(): String = _camera.toString()

       override fun ram(): String =_ram.toString()

       override fun price(): Int = _camera*cameraPrice + _ram*ramPrice + extraBuildCost

       override fun OS(): String = _OS

    companion object{
        var OS_MIUI = "MIUI"
        var OS_COLOR = "COLOR OS"

    }

   }