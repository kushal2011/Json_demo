package com.kdtech.suppernatural.jsondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

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

    //creating lists for getting json arrays from local json file
    public static List eventArray = new ArrayList();
    public static List chemoquestL = new ArrayList();
    public static List CodeDesPirateL = new ArrayList();
    public static List CrackDeScrapL = new ArrayList();
    public static List EnginomaniaL = new ArrayList();
    public static List GeekWarsL = new ArrayList();
    public static List HactivistL = new ArrayList();
    public static List MaitreDeCivilL = new ArrayList();
    public static List SciOfStupidL = new ArrayList();
    public static List ShockTradiagtorL = new ArrayList();
    public static List StructoDraftL = new ArrayList();
    public static List AngryBirdL = new ArrayList();
    public static List BlackOutL = new ArrayList();
    public static List BoxCricketL = new ArrayList();
    public static List BoxFootballL = new ArrayList();
    public static List DrHolmesL = new ArrayList();
    public static List GroundZeroL = new ArrayList();
    public static List IPLL = new ArrayList();
    public static List LazerCombactL = new ArrayList();
    public static List LazerMazeL = new ArrayList();
    public static List LemmeTakeaSelfieL = new ArrayList();
    public static List TalentHuntL = new ArrayList();
    public static List TODReloadedL = new ArrayList();
    //public static ArrayList<List> listOfLists= new ArrayList<>();

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
//extracting and returning arrays from json file
    private static List extractChemoQuestFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }

        chemoquestL = new ArrayList<>();

        // Try to parse the JSON response string. If there's a problem with the way the JSON
        // is formatted, a JSONException exception object will be thrown.
        // Catch the exception so the app doesn't crash, and print the error message to the logs.
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject technicalEvents = eventType.getJSONObject("technical");
//            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray chemoquest = technicalEvents.getJSONArray("Chemo-quest");

            if (chemoquest != null) {
                for (int i = 0; i < chemoquest.length(); i++) {
                    chemoquestL.add(chemoquest.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.
        }

        // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        return chemoquestL;
    }

    private static List extractCodeDesPirateLFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        CodeDesPirateL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject technicalEvents = eventType.getJSONObject("technical");
//            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

          JSONArray CodeDesPirate = technicalEvents.getJSONArray("Code Des Pirate");

            if (CodeDesPirate != null) {
                for (int i=0;i<CodeDesPirate.length();i++){
                    CodeDesPirateL.add(CodeDesPirate.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

        // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
    }
        return CodeDesPirateL;
    }

    private static List extractCrackDeScrapFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        CrackDeScrapL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject technicalEvents = eventType.getJSONObject("technical");
//            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray CrackDeScrap = technicalEvents.getJSONArray("Crack-De-Scrap");

            if (CrackDeScrap != null) {
                for (int i=0;i<CrackDeScrap.length();i++){
                    CrackDeScrapL.add(CrackDeScrap.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return CrackDeScrapL;
    }

    private static List extractEnginomaniaFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        EnginomaniaL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject technicalEvents = eventType.getJSONObject("technical");
//            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray Enginomania = technicalEvents.getJSONArray("Enginomania");

            if (Enginomania != null) {
                for (int i=0;i<Enginomania.length();i++){
                    EnginomaniaL.add(Enginomania.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return EnginomaniaL;
    }

    private static List extractGeekWarsFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        GeekWarsL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject technicalEvents = eventType.getJSONObject("technical");
//            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray GeekWars = technicalEvents.getJSONArray("GeekWars");

            if (GeekWars != null) {
                for (int i=0;i<GeekWars.length();i++){
                    GeekWarsL.add(GeekWars.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return GeekWarsL;
    }
    private static List extractHactivistFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        HactivistL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject technicalEvents = eventType.getJSONObject("technical");
//            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray Hactivist = technicalEvents.getJSONArray("Hactivist");

            if (Hactivist != null) {
                for (int i=0;i<Hactivist.length();i++){
                    HactivistL.add(Hactivist.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return HactivistL;
    }
    private static List extractMaitreDeCivilFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        MaitreDeCivilL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject technicalEvents = eventType.getJSONObject("technical");
//            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray MaitreDeCivil = technicalEvents.getJSONArray("Maitre-De-Civil");

            if (MaitreDeCivil != null) {
                for (int i=0;i<MaitreDeCivil.length();i++){
                    MaitreDeCivilL.add(MaitreDeCivil.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return MaitreDeCivilL;
    }

    private static List extractSciOfStupidFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        SciOfStupidL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject technicalEvents = eventType.getJSONObject("technical");
//            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray SciOfStupid = technicalEvents.getJSONArray("Sci-Of-Stupid");

            if (SciOfStupid != null) {
                for (int i=0;i<SciOfStupid.length();i++){
                    SciOfStupidL.add(SciOfStupid.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return SciOfStupidL;
    }

    private static List extractShockTradiagtorFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        ShockTradiagtorL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject technicalEvents = eventType.getJSONObject("technical");
//            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray ShockTradiagtor = technicalEvents.getJSONArray("ShockTradiagtor");

            if (ShockTradiagtor != null) {
                for (int i=0;i<ShockTradiagtor.length();i++){
                    ShockTradiagtorL.add(ShockTradiagtor.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return ShockTradiagtorL;
    }

    private static List extractStructoDraftFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        ShockTradiagtorL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject technicalEvents = eventType.getJSONObject("technical");
//            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray StructoDraft = technicalEvents.getJSONArray("Structo-Draft");

            if (StructoDraft != null) {
                for (int i=0;i<StructoDraft.length();i++){
                    StructoDraftL.add(StructoDraft.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return StructoDraftL;
    }

    private static List extractAngryBirdtFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        AngryBirdL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray AngryBird = nonTechnicalEvents.getJSONArray("Angry Bird");

            if (AngryBird != null) {
                for (int i=0;i<AngryBird.length();i++){
                    AngryBirdL.add(AngryBird.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return AngryBirdL;
    }

    private static List extractBlackOutFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        AngryBirdL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray BlackOut = nonTechnicalEvents.getJSONArray("Black Out");

            if (BlackOut != null) {
                for (int i=0;i<BlackOut.length();i++){
                    BlackOutL.add(BlackOut.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return BlackOutL;
    }
    private static List extractBoxCricketFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        BoxCricketL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray BoxCricket = nonTechnicalEvents.getJSONArray("Box Cricket");

            if (BoxCricket != null) {
                for (int i=0;i<BoxCricket.length();i++){
                    BoxCricketL.add(BoxCricket.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return BoxCricketL;
    }
    private static List extractBoxFootballFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        BoxFootballL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray BoxFootball = nonTechnicalEvents.getJSONArray("Box Football");

            if (BoxFootball != null) {
                for (int i=0;i<BoxFootball.length();i++){
                    BoxFootballL.add(BoxFootball.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return BoxFootballL;
    }
    private static List extractDrHolmesFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        DrHolmesL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray DrHolmes = nonTechnicalEvents.getJSONArray("Dr. Holmes");

            if (DrHolmes != null) {
                for (int i=0;i<DrHolmes.length();i++){
                    DrHolmesL.add(DrHolmes.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return DrHolmesL;
    }
    private static List extractGroundZeroFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        GroundZeroL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray GroundZero = nonTechnicalEvents.getJSONArray("Ground Zero");

            if (GroundZero != null) {
                for (int i=0;i<GroundZero.length();i++){
                    GroundZeroL.add(GroundZero.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return GroundZeroL;
    }
    private static List extractIPLFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        IPLL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray IPL = nonTechnicalEvents.getJSONArray("IPL");

            if (IPL != null) {
                for (int i=0;i<IPL.length();i++){
                    IPLL.add(IPL.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return IPLL;
    }
    private static List extractLazerCombactFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        LazerCombactL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray LazerCombact = nonTechnicalEvents.getJSONArray("Lazer Combact");

            if (LazerCombact != null) {
                for (int i=0;i<LazerCombact.length();i++){
                    LazerCombactL.add(LazerCombact.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return LazerCombactL;
    }
    private static List extractLazerMazeFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        LazerMazeL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray LazerMaze = nonTechnicalEvents.getJSONArray("Lazer Maze");

            if (LazerMaze != null) {
                for (int i=0;i<LazerMaze.length();i++){
                    LazerMazeL.add(LazerMaze.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return LazerMazeL;
    }
    private static List extractLemmeTakeaSelfieFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        LemmeTakeaSelfieL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray LemmeTakeaSelfie = nonTechnicalEvents.getJSONArray("Lemme Take a Selfie");

            if (LemmeTakeaSelfie != null) {
                for (int i=0;i<LemmeTakeaSelfie.length();i++){
                    LemmeTakeaSelfieL.add(LemmeTakeaSelfie.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return LemmeTakeaSelfieL;
    }
    private static List extractTalentHuntFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        TalentHuntL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray TalentHunt = nonTechnicalEvents.getJSONArray("Talent Hunt");

            if (TalentHunt != null) {
                for (int i=0;i<TalentHunt.length();i++){
                    TalentHuntL.add(TalentHunt.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return TalentHuntL;
    }
    private static List extractTODReloadedFromJson(String eventsJSON) {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(eventsJSON)) {
            return null;
        }
        TODReloadedL= new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(eventsJSON);
            JSONObject eventType = baseJsonResponse.getJSONObject("events");

            JSONObject nonTechnicalEvents = eventType.getJSONObject("non technical");

            JSONArray TODReloaded = nonTechnicalEvents.getJSONArray("TOD Reloaded");

            if (TODReloaded != null) {
                for (int i=0;i<TODReloaded.length();i++){
                    TODReloadedL.add(TODReloaded.getString(i));
                }
            }
        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.

            // Log.e("kushal", "extractFeatureFromJson: ", (Throwable) eventArray);
        }
        return TODReloadedL;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int selectedEvent,selectedCatagory;
        Bundle bundle = getIntent().getExtras();
        //recived position of item clicked from selectedCatagory activity
        selectedEvent=bundle.getInt("pos");
        //recived pass from adapter,it will be one if non technical event was selected at eventCatagory and 0 if techical event was selected
        selectedCatagory=bundle.getInt("pass");

        if (selectedEvent==0&&selectedCatagory==0){
            eventArray=extractChemoQuestFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==1&&selectedCatagory==0){
            eventArray=extractCodeDesPirateLFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==2&&selectedCatagory==0){
            eventArray= extractCrackDeScrapFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==3&&selectedCatagory==0){
            eventArray=extractEnginomaniaFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==4&&selectedCatagory==0){
            eventArray= extractGeekWarsFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==5&&selectedCatagory==0){
            eventArray= extractHactivistFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==6&&selectedCatagory==0){
            eventArray= extractMaitreDeCivilFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==7&&selectedCatagory==0){
            eventArray= extractSciOfStupidFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==8&&selectedCatagory==0){
            eventArray= extractShockTradiagtorFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==9&&selectedCatagory==0){
            eventArray= extractStructoDraftFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==0&&selectedCatagory==1){
            eventArray= extractAngryBirdtFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==1&&selectedCatagory==1){
            eventArray= extractBlackOutFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==2&&selectedCatagory==1){
            eventArray= extractBoxCricketFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==3&&selectedCatagory==1){
            eventArray= extractBoxFootballFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==4&&selectedCatagory==1){
            eventArray= extractDrHolmesFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==5&&selectedCatagory==1){
            eventArray= extractGroundZeroFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==6&&selectedCatagory==1){
            eventArray= extractIPLFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==7&&selectedCatagory==1){
            eventArray= extractLazerCombactFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==8&&selectedCatagory==1){
            eventArray= extractLazerMazeFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==9&&selectedCatagory==1){
            eventArray= extractLemmeTakeaSelfieFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==10&&selectedCatagory==1){
            eventArray= extractTalentHuntFromJson(loadJSONFromAsset());
        }
        else if (selectedEvent==11&&selectedCatagory==1){
            eventArray= extractTODReloadedFromJson(loadJSONFromAsset());
        }


       // extractFeatureFromJson(loadJSONFromAsset());
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new event_adapter(eventArrayList);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareEventData();
    }



    private void prepareEventData() {

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

        event = new event("rules", (String) eventArray.get(5));
        eventArrayList.add(event);

        event = new event("contact",(String) eventArray.get(6));
        eventArrayList.add(event);

        mAdapter.notifyDataSetChanged();
    }
}
