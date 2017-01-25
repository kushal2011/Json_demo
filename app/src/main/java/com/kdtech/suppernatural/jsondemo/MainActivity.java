package com.kdtech.suppernatural.jsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<event> eventArrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private event_adapter mAdapter;
    public static List eventArray = new ArrayList();
    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("events.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return json;
    }


    private static List<String> extractFeatureFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }

        // Create an empty ArrayList that we can start adding events to
        eventArray = new ArrayList<>();

        // Try to parse the JSON response string. If there's a problem with the way the JSON
        // is formatted, a JSONException exception object will be thrown.
        // Catch the exception so the app doesn't crash, and print the error message to the logs.
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject technicalEvents = eventType.getJSONObject("technical");
            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");


            JSONArray chemoquest = technicalEvents.getJSONArray("Chemo-quest");
            if (chemoquest != null) {
                for (int i=0;i<chemoquest.length();i++){
                    eventArray.add(chemoquest.getString(i));
                }
            }


        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.
        }
        // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        return eventArray;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        extractFeatureFromJson(loadJSONFromAsset());
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new event_adapter(eventArrayList);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {

        event event = new event("description", (String) eventArray.get(0));
        eventArrayList.add(event);

        event = new event("no of participants", (String) eventArray.get(1));
        eventArrayList.add(event);

        event = new event("Registration fees", (String) eventArray.get(2));
        eventArrayList.add(event);

        event = new event("price worth", (String) eventArray.get(3));
        eventArrayList.add(event);

        event = new event("rounds", (String) eventArray.get(4));
        eventArrayList.add(event);


        event = new event("contact",(String) eventArray.get(5));
        eventArrayList.add(event);

        mAdapter.notifyDataSetChanged();
    }
}
