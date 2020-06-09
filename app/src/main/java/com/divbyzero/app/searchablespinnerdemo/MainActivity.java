package com.divbyzero.app.searchablespinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.chivorn.smartmaterialspinner.SmartMaterialSpinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SmartMaterialSpinner spCountry, spPresident;
    private List<String> countryList, presidentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initSpinner();
    }

    private void initSpinner(){
        spCountry = findViewById(R.id.sp_country);
        spPresident = findViewById(R.id.sp_president);

        countryList = new ArrayList<String>();
        presidentList = new ArrayList<String>();

        countryList.add("Algeria");
        countryList.add("Austria");
        countryList.add("Belgium");
        countryList.add("Canada");
        countryList.add("Denmark");
        countryList.add("Egypt");
        countryList.add("Estonia");
        countryList.add("Jamaica");
        countryList.add("Japan");
        countryList.add("Germany");
        countryList.add("Greece");
        countryList.add("India");
        countryList.add("Ireland");
        countryList.add("Malta");
        countryList.add("Malaysia");
        countryList.add("Mongolia");

        presidentList.add("James Monroe");
        presidentList.add("Zachary Taylor");
        presidentList.add("Grover Cleveland");
        presidentList.add("James Madison");
        presidentList.add("William McKinley");
        presidentList.add("John Adams");
        presidentList.add("Herbert Hoover");
        presidentList.add("William Howard Taft");
        presidentList.add("Richard Nixon");
        presidentList.add("Ronald Reagan");
        presidentList.add("James A. Garfield");
        presidentList.add("John Tyler");

        spCountry.setItem(countryList);
        spPresident.setItem(presidentList);

    }
}