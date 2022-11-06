/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();
        earthquakes.add(new Earthquake(5.1,"Kepulauan Talaud, Indonesia", Long.parseLong("1667662510007")));
        earthquakes.add(new Earthquake(4.6,"South Africa", Long.parseLong("1667662510007")));
        earthquakes.add(new Earthquake(5.0,"39 km SSW of San Martín, Argentina",Long.parseLong("1667650359559") ));
        earthquakes.add(new Earthquake (5.0, "31 km WSW of Malango, Solomon Islands", Long.parseLong("1667637120510")));
        earthquakes.add(new Earthquake (4.8,"Bathurst Island region, Nunavut, Canada",Long.parseLong("1667635175714")));
        earthquakes.add(new Earthquake (5.0,"120 km WSW of Constitución, Chile",Long.parseLong("1667635039393")));
        earthquakes.add(new Earthquake (5.0,"Pulau-Pulau Talaud, Indonesia",Long.parseLong("1667634129812")));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
