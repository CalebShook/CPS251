package com.example.tipcalculatorproject3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tipcalculatorproject3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun buttonClicked(view: View) {
        val billTotal: Float? = binding.editTextNumber.text.toString().toFloatOrNull()

        if(billTotal != null) {
            val tenPercent = String.format("%.2f", billTotal + (billTotal * .10))
            val fifteenPercent = String.format("%.2f", billTotal + (billTotal * .15))
            val twentyPercent = String.format("%.2f", billTotal + (billTotal * .20))
            binding.statusText.text = "Totals After Tip Calculation:\n\n10% - $tenPercent\n15% - $fifteenPercent\n20% - $twentyPercent"
        } else {
            binding.statusText.text = "Please Enter Bill Amount"
        }

    }
}
