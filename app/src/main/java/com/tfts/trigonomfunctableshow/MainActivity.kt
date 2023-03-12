package com.tfts.trigonomfunctableshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tfts.trigonomfunctableshow.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val listOfCosSinDFraw = listOf<Int>(R.drawable.show_trigonometric_func_0,R.drawable.show_trigonometric_func_1,R.drawable.show_trigonometric_func_2,
        R.drawable.show_trigonometric_func_3,R.drawable.show_trigonometric_func_4,R.drawable.show_trigonometric_func_5,
        R.drawable.show_trigonometric_func_6,R.drawable.show_trigonometric_func_7,R.drawable.show_trigonometric_func_8,
        R.drawable.show_trigonometric_func_9,R.drawable.show_trigonometric_func_10,R.drawable.show_trigonometric_func_11,
        R.drawable.show_trigonometric_func_12,R.drawable.show_trigonometric_func_13,R.drawable.show_trigonometric_func_14        ,
        R.drawable.show_trigonometric_func_15,R.drawable.show_trigonometric_func_16)

    val trigFuncVal = listOf<Int>(
        1,2,3,4,5,6,
    7,8,9,10,11,2,
    12,2,11,10,9,8,
    13,2,15,8,16,0,
    14,0,16,8,15,2)
    var isZoom = false
       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        trigFuncReDraw()


        binding.imageView8.setOnClickListener { binding.imageView8.z = 1f
            binding.imageView8.animate().apply {
            duration = 999
            if (isZoom==false) {
                scaleXBy(2f)
                scaleYBy(2f)
                isZoom=true
            }else  {
                scaleXBy(-2f)
                scaleYBy(-2f)
                isZoom=false
            }

        }.start() }

           binding.imageView9.setOnClickListener { binding.imageView9.z = 1f
               binding.imageView9.animate().apply {
                   duration = 999
                   if (isZoom==false) {
                       scaleXBy(2f)
                       scaleYBy(2f)
                       isZoom=true
                   }else  {
                       scaleXBy(-2f)
                       scaleYBy(-2f)
                       isZoom=false
                   }

               }.start() }

           binding.imageView10.setOnClickListener { binding.imageView10.z = 1f
               binding.imageView10.animate().apply {
                   duration = 999
                   if (isZoom==false) {
                       scaleXBy(2f)
                       scaleYBy(2f)
                       isZoom=true
                   }else  {
                       scaleXBy(-2f)
                       scaleYBy(-2f)
                       isZoom=false
                   }

               }.start() }

           binding.imageView11.setOnClickListener { binding.imageView11.z = 1f
               binding.imageView11.animate().apply {
                   duration = 999
                   if (isZoom==false) {
                       scaleXBy(2f)
                       scaleYBy(2f)
                       isZoom=true
                   }else  {
                       scaleXBy(-2f)
                       scaleYBy(-2f)
                       isZoom=false
                   }

               }.start() }

           binding.imageView12.setOnClickListener { binding.imageView12.z = 1f
               binding.imageView12.animate().apply {
                   duration = 999
                   if (isZoom==false) {
                       scaleXBy(2f)
                       scaleYBy(2f)
                       isZoom=true
                   }else  {
                       scaleXBy(-2f)
                       scaleYBy(-2f)
                       isZoom=false
                   }

               }.start() }



    }

fun trigFuncReDraw() {
    binding.imageView.setImageResource(listOfCosSinDFraw[trigFuncVal[0]])
    binding.imageView2.setImageResource(listOfCosSinDFraw[trigFuncVal[1]])
    binding.imageView3.setImageResource(listOfCosSinDFraw[trigFuncVal[2]])
    binding.imageView4.setImageResource(listOfCosSinDFraw[trigFuncVal[3]])
    binding.imageView5.setImageResource(listOfCosSinDFraw[trigFuncVal[4]])
    binding.imageView6.setImageResource(listOfCosSinDFraw[trigFuncVal[5]])
    binding.imageView7.setImageResource(listOfCosSinDFraw[trigFuncVal[6]])
    binding.imageView8.setImageResource(listOfCosSinDFraw[trigFuncVal[7]])
    binding.imageView9.setImageResource(listOfCosSinDFraw[trigFuncVal[8]])
    binding.imageView10.setImageResource(listOfCosSinDFraw[trigFuncVal[9]])
    binding.imageView11.setImageResource(listOfCosSinDFraw[trigFuncVal[10]])
    binding.imageView12.setImageResource(listOfCosSinDFraw[trigFuncVal[11]])
    binding.imageView13.setImageResource(listOfCosSinDFraw[trigFuncVal[12]])
    binding.imageView14.setImageResource(listOfCosSinDFraw[trigFuncVal[13]])
    binding.imageView15.setImageResource(listOfCosSinDFraw[trigFuncVal[14]])
    binding.imageView16.setImageResource(listOfCosSinDFraw[trigFuncVal[15]])
    binding.imageView17.setImageResource(listOfCosSinDFraw[trigFuncVal[16]])
    binding.imageView18.setImageResource(listOfCosSinDFraw[trigFuncVal[17]])
    binding.imageView19.setImageResource(listOfCosSinDFraw[trigFuncVal[18]])
    binding.imageView20.setImageResource(listOfCosSinDFraw[trigFuncVal[19]])
    binding.imageView21.setImageResource(listOfCosSinDFraw[trigFuncVal[20]])
    binding.imageView22.setImageResource(listOfCosSinDFraw[trigFuncVal[21]])
    binding.imageView23.setImageResource(listOfCosSinDFraw[trigFuncVal[22]])
    binding.imageView24.setImageResource(listOfCosSinDFraw[trigFuncVal[23]])
    binding.imageView25.setImageResource(listOfCosSinDFraw[trigFuncVal[24]])
    binding.imageView26.setImageResource(listOfCosSinDFraw[trigFuncVal[25]])
    binding.imageView27.setImageResource(listOfCosSinDFraw[trigFuncVal[26]])
    binding.imageView28.setImageResource(listOfCosSinDFraw[trigFuncVal[27]])
    binding.imageView29.setImageResource(listOfCosSinDFraw[trigFuncVal[28]])
    binding.imageView30.setImageResource(listOfCosSinDFraw[trigFuncVal[29]])





}

}