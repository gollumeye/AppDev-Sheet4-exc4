package com.example.appdev_sheet4_exc4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.appdev_sheet4_exc4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(e->{
            String conversion_mode = binding.spinner.getSelectedItem().toString();
            Double to_value = 0.0;
            if(!binding.frominput.getText().toString().equals("")){
            Double from_value = Double.parseDouble(binding.frominput.getText().toString());

                switch (conversion_mode) {
                    case ("meter to inch"):
                        to_value = from_value * 39.3701;
                        break;
                    case ("inch to meter"):
                        to_value = from_value * 0.0254;
                        break;
                    case ("celsius to fahrenheit"):
                        to_value = from_value * (9 / 5) + 32;
                        break;
                    case ("fahrenheit to celcius"):
                        to_value = (from_value - 32) * (5 / 9);
                        break;
                    case ("kilometers to miles"):
                        to_value = from_value * 0.621371;
                        break;
                    case ("miles to kilometers"):
                        to_value = from_value * 1.609;
                        break;
                    case ("knots to meter per second"):
                        to_value = from_value * 0.51;
                        break;
                    case ("meter per second to knots"):
                        to_value = from_value * 1.94384;
                        break;
                    default:
                        ;
                }

                binding.toinput.setText(to_value.toString());
            }
            else{
                binding.toinput.setText("");
            }
        });



    }
}




/*

POSSIBLE IMPROVEMENTS:

-> use Textfield for "To" instead of input field
-> Write the Units instead of "From" and "To"
-> Result under the calculate button
-> automatic calculation instead already while writing input instead of needing to press calculate button

 */