package com.example.bmitask

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel

class HrViewModel: ViewModel() {
    var heightInput by mutableStateOf("")

    var weightInput by mutableStateOf("")

    private var height: Float = 0.0f
        get(){
            return heightInput.toFloatOrNull() ?:0.0f
        }
    private var weight: Float = 0.0f
        get(){
            return weightInput.toFloatOrNull() ?:0.0f
        }


    private fun calculate(): Float{
       return if (height > 0 && weight > 0) weight  / (height * height) else 0.0f
    }

    val bmi: Float
        get(){
            return calculate()
        }


}
