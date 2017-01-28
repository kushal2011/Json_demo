package com.kdtech.suppernatural.jsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class selectedCatagory extends AppCompatActivity {

    private RecyclerView recyclerView;
    private event_detail_adapter adapter;
    private List<eventDetails> selectedCatogories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_catagory);

        int selectedCatagory;
        Bundle bundle = getIntent().getExtras();
        //recived position of ite clicked on eventCatagory
        selectedCatagory=bundle.getInt("pos");

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_selected_catagory);

        selectedCatogories = new ArrayList<>();
        adapter = new event_detail_adapter(this, selectedCatogories);

        RecyclerView.LayoutManager mLayoutManager2 = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager2);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

       if (selectedCatagory==0){
            prepareTechnicalList();
        }
       else if (selectedCatagory==1){
           prepareNonTechnicalList();
        }
       /* else if(selectedCatagory==2){
           prepareSpecialList();
       }*/
    }

   /* private void prepareSpecialList() {
        eventDetails list = new eventDetails("Technical events",  R.drawable.ideation);
        selectedCatogories.add(list);

        list = new eventDetails("non technical events", R.drawable.workshops);
        selectedCatogories.add(list);

        list = new eventDetails("special",R.drawable.event);
        selectedCatogories.add(list);

        adapter.notifyDataSetChanged();
    }*/

    private void prepareNonTechnicalList() {
        eventDetails a = new eventDetails("Angry Bird",  R.drawable.angrybirds);
        selectedCatogories.add(a);

        a = new eventDetails("Black Out", R.drawable.black_out);
        selectedCatogories.add(a);

        a = new eventDetails("Box Cricket",R.drawable.box_of_cricket);
        selectedCatogories.add(a);

        a = new eventDetails("Box Football",  R.drawable.the_box_football);
        selectedCatogories.add(a);

        a = new eventDetails("Dr. Holmes", R.drawable.dr_holmes);
        selectedCatogories.add(a);

        a = new eventDetails("Ground Zero",R.drawable.ground_zero);
        selectedCatogories.add(a);

        a = new eventDetails("IPL",  R.drawable.the_ipl_auction);
        selectedCatogories.add(a);

        a = new eventDetails("Lazer Combact", R.drawable.laser_tag);
        selectedCatogories.add(a);

        a = new eventDetails("Lazer Maze",R.drawable.lazer_maze);
        selectedCatogories.add(a);

        a = new eventDetails("Lemme Take a Selfie",  R.drawable.lemme_take_a_selfie);
        selectedCatogories.add(a);

        a = new eventDetails("Talent Hunt", R.drawable.talent_hunt);
        selectedCatogories.add(a);

        a = new eventDetails("TOD Reloaded",R.drawable.total_overdose);
        selectedCatogories.add(a);

        adapter.notifyDataSetChanged();
    }

    private void prepareTechnicalList() {
        eventDetails a = new eventDetails("Chemo-quest",  R.drawable.chemo_quest);
        selectedCatogories.add(a);

        a = new eventDetails("Code Des Pirate", R.drawable.code_des_pirate);
        selectedCatogories.add(a);

        a = new eventDetails("Crack-De-Scrap",R.drawable.crack_d_scrap);
        selectedCatogories.add(a);

        a = new eventDetails("Enginomania",  R.drawable.enginomia);
        selectedCatogories.add(a);

        a = new eventDetails("GeekWars", R.drawable.geek_wars);
        selectedCatogories.add(a);

        a = new eventDetails("Hactivist",R.drawable.abc);
        selectedCatogories.add(a);

        a = new eventDetails("Maitre-De-Civil",  R.drawable.maitre_de_civil);
        selectedCatogories.add(a);

        a = new eventDetails("Sci-Of-Stupid", R.drawable.science_of_stupid);
        selectedCatogories.add(a);

        a = new eventDetails("Shock-Tradiagtor",R.drawable.shock_tradigators);
        selectedCatogories.add(a);

        a = new eventDetails("Structo-Draft",  R.drawable.strcto);
        selectedCatogories.add(a);

        adapter.notifyDataSetChanged();
    }
}
