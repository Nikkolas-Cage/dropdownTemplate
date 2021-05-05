package com.eteltechnologies.dropdowntemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import jrizani.jrspinner.JRSpinner;

public class MainActivity extends AppCompatActivity {
    private JRSpinner mySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySpinner = findViewById(R.id.spn_my_spinner);
        mySpinner.setTitle("Select your coop");
        mySpinner.setExpandTint(R.color.jrspinner_color_default);
        mySpinner.setItems(new String[]{
                "Aklan Integrated Transport Cooperative",
                "Altavas Kalibo Jeepney Transport",
                "Banga-Kalibo Jeepney Transport Service",
                "Boracay Island Hopping Adventure",
                "Boracay Land Transport Multi-Purpose",
                "Caticlan-Boracay Transport Multi-Purpose",
                "Dumaguit Jeepney Transport Service",
                "Kalibo and Caticlan Airports Multi-Purpose",
                "Kiata Transport Service Cooperative",
                "Libacao-Kalibo Transportation Service",
                "Madalag, Daja, Malinao Transport",
                "Makato Transport Cooperative",
                "Malinao Lezo Transport Cooperative",
                "Matoda Transport Multi-Purpose",
                "New Washington Kalibo Transport",
                "Paradise Island Transport Multi-Purpose",
                "Star Express Tourist Transport Cooperative",
                "Tangalan Transport Cooperative (TTC)",
                "Antique Comprehensive Land Tourist and",
                "Antique Land Transport Cooperative (ALTC)",
                "FEJODA Transport Cooperative",
                "Panay Land Transport Cooperative",
                "San Jose Hamtic Guinsang-an Transport",
                "Capiz Transport Service Cooperative",
                "D First Capiz Transport Service Cooperative",
                "Dao, Cuartero, Roxas City Jeepney",
                "Jamindan Roxas City Capiz Transport",
                "Lawaan Roxas City Transport Cooperative",
                "Lonoy Transport Cooperative",
                "Maayon Van Transport Cooperative",
                "Panay Island Transport Service Cooperative",
                "Roxas City Pontevedra UV Transport",
                "Buenavista Jeepney Operators and Drivers",
                "Guimaras Operator and Driver Transport",
                "Guimaras Tourist Transport Cooperative",
                "Jordan Jeepney Operators and Drivers",
                "Jordan Motor Banca Cooparative",
                "Aerostar 1 Transport Multi-Purpose",
                "Alliance of Provincial Operators and Drivers",
                "Calumpang-Iloilo Transport Service",
                "Gigantes Island General Services",
                "ICAJODA Panay Transport Cooperative",
                "Igbaras Jeepney Transport Cooperative",
                "Iloilo City Alliance Operators and Drivers",
                "Iloilo Superman Owners and Drivers",
                "Iloilo Taxi Transport Cooperative",
                "Iloilo Transport Service Cooperative",
                "Kooperatiba Naton Multi-Purpose",
                "Leon Public Utility Van Transport",
                "Leon Tigbauan Multicab Transport",
                "Leon Transport Service Cooperative",
                "Metro Iloilo Transport Service Cooperative",
                "Molo Transport Service Cooperative",
                "Northern Panay Transport Cooperative",
                "Panay Transport Service Cooperative",
                "Pavia Iloilo Jeepney Owners and Drivers",
                "Province of Iloilo Transport Services",
                "San Miguel Iloilo Transport Cooperative",
                "Santa Barbara-Iloilo Transport Cooperative",
                "Southern Iloilo Transport Cooperative",
                "Taxi and Jeepney Drivers Interlink",
                "Tubungan Transport Service Cooperative",
                "United Leon Transport Cooperative (ULTC)",
                "United Owners and Drivers Transport",
                "Western Visayas Transport Cooperative",
                "Bacolod South, Sum-ag, Punta Taytay",
                "LC Star Transport Cooperative",
                "Metro Bacolod Transport Service",
                "Negros East Transport Service Cooperative",
                "Negros Occidental Transport Cooperative",
                "Regional Transport Service Cooperative",
                "Southern Negros Transport Service",
                "United Negros Transport Cooperative"
        });



    }
}