package com.ualr.firstapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.firstapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = mBinding.getRoot();
        setContentView(rootView);
    }

    // DONE TODO 06. Avoid updating the text label (userMsgTV) when the text field (userInputET) is empty
    public void showTextMessage(View view) {
        if ((mBinding.userInputET.getText().toString()).isEmpty()){
            return;
        }

        mBinding.userMsgTV.setText(mBinding.userInputET.getText().toString());

        //cleanTextField(view); //placed here initially to clear text after user performs a button click
        //I originally thought I should handle clearing the textfield after a user clicks the show text button
    }

    // DONE TODO 07. Create a new method called cleanTextField to delete the text inside the text field
    public void cleanTextField(View view){
        mBinding.userInputET.setText("");
    }
}
