package com.example.orrymain.open_market;

import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
//import android.support.v4.app.DialogFragment;
//import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Arnold on 10/02/16.
 */
public class List_Redirection extends ActionBarActivity{

    String[] institution;
    String[] speakerNames;
    //int[] images;


    int[] images = new int[]{
            R.drawable.yariv_cohen,
            R.drawable.kenji_fukuoka,
            R.drawable.philbert_jean,
            R.drawable.changarampatt_manoj,
            R.drawable.okello_joshua,
            R.drawable.mugethi_gitau,
            R.drawable.daniela_marzavan,
            R.drawable.stefani,
            R.drawable.andrew_nyamv,
            R.drawable.paul_mcconell,
            R.drawable.solomon_king,
            R.drawable.john_stever,
            R.drawable.mohamed_aglan,
            R.drawable.alex_soskin,
            R.drawable.s_zain_khan,
            R.drawable.herve_kubw,
            R.drawable.ezekiel,
            R.drawable.hayama,
            R.drawable.sara_ledom,
            R.drawable.yaron,
            R.drawable.mohamed_salam,
            R.drawable.hossam_el_zay,
            R.drawable.brian_ndyaguma,
            R.drawable.richard_barret,
            R.drawable.joseph_abdi,
            R.drawable.gaspard,
            R.drawable.masato,
            R.drawable.nicolas_wiliams,
            R.drawable.harveen_narula,
            R.drawable.lena_bernhofer,
            R.drawable.hunter_thompson,
            R.drawable.angela_homsi

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        speakerNames = getResources().getStringArray(R.array.speaker_names);
        institution = getResources().getStringArray(R.array.speaker_Company_names);
        //images = getResources().getIntArray(R.array.speaker_profile_pics);

        // each row in the list stores speaker name, institution and the image

        java.util.List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for(int i=0;i<speakerNames.length;i++){
            HashMap<String, String> hashMap = new HashMap<String,String>();
            hashMap.put("name","" + speakerNames[i]);
            hashMap.put("institution",""+ institution[i]);
            hashMap.put("pic", Integer.toString(images[i]));

            aList.add(hashMap);
        }

        // keys used in the hashmap
        String[] from = {"pic", "name", "institution"};

        // Ids of views in the speaker_content

        int[] to = {R.id.speaker_img, R.id.speaker_name, R.id.speaker_institution};

        // Instantiating Adapter to store each items

        SimpleAdapter adapter =  new SimpleAdapter(getBaseContext(), aList,R.layout.list_content,from,to);

        // getting the reference of the listview in the speakers_listview

        ListView listView = (ListView) findViewById(R.id.speakers_listView);

        // setting the adapter to the listview

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        Bundle yariv = new Bundle();
                        yariv.putInt("position", position);
                        DialogFragment dialogFragment = new TabDialog();
                        dialogFragment.setArguments(yariv);
                        dialogFragment.show(getFragmentManager(),"dialogFragment");
                        break;

                    case 1:
                        Bundle kenji = new Bundle();
                        kenji.putInt("position", position);
                        DialogFragment dialogFragment1 = new TabDialog();
                        dialogFragment1.setArguments(kenji);
                        dialogFragment1.show(getFragmentManager(),"dialogFragment");
                        break;

                    case 2:
                        Bundle phil = new Bundle();
                        phil.putInt("position", position);
                        DialogFragment dialogFragment2 = new TabDialog();
                        dialogFragment2.setArguments(phil);
                        dialogFragment2.show(getFragmentManager(),"dialogFragment");
                        break;

                    case 3:
                        Bundle manoj = new Bundle();
                        manoj.putInt("position",position);
                        DialogFragment dialogFragment3 = new TabDialog();
                        dialogFragment3.setArguments(manoj);
                        dialogFragment3.show(getFragmentManager(),"dialogFragment");
                        break;

                }

            }
        });


        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#99cc00")));
        actionBar.setDisplayHomeAsUpEnabled(true);



    }
}
