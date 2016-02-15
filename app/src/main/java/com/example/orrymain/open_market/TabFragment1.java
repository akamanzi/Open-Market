package com.example.orrymain.open_market; /**
 * Created by murenziorrymain on 26/01/2016.
 */

    import android.app.DialogFragment;
    import android.content.Intent;
    import android.os.Bundle;
    import android.support.v4.app.Fragment;
    import android.util.Log;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.AdapterView;
    import android.widget.GridView;
    import android.widget.Toast;



    import com.example.orrymain.open_market.R;

    import java.util.ArrayList;
    import java.util.List;

    import Model.CustomAdapater;
    import Model.ItemObject;

public class TabFragment1 extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            //return inflater.inflate(R.layout.tab_fragment_1, container, false);

            View view = inflater.inflate(R.layout.tab_fragment_1, container, false);
            GridView gridview = (GridView)view.findViewById(R.id.gridview);
            List<ItemObject> allItems = getAllItemObject();
            CustomAdapater customAdapter = new CustomAdapater(getActivity(), allItems);
            gridview.setAdapter(customAdapter);
            Log.d("gridview","gridview shown");
            gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    //  Toast.makeText(getActivity(), "Position: " + position, Toast.LENGTH_SHORT).show();
                    Log.d("gridview","item clicked");
                    switch (position) {
                        case 0:
                            /*
                            Log.d("dialog","showing the Dialog");
                            Bundle case1 = new Bundle();
                            case1.putInt("position", position);
                            DialogFragment fragment = new TabDialog();
                            fragment.setArguments(case1);
                            fragment.show(getActivity().getFragmentManager(),"fragment"); */
                            Intent list = new Intent(getActivity(), List_Redirection.class);
                            startActivity(list);
                            break;

                    }
                }
            });
            return view;
        }
    private List<ItemObject> getAllItemObject(){
        Log.d("adding", "adding items");
        List<ItemObject> items = new ArrayList<>();
        items.add(new ItemObject(R.drawable.milian,"Dip It Low", "Christina Milian"));
        items.add(new ItemObject(R.drawable.adele,"Someone like you", "Adele Adkins"));
        items.add(new ItemObject(R.drawable.ciara,"Ride", "Ciara"));
        items.add(new ItemObject(R.drawable.gaga,"Paparazzi", "Lady Gaga"));
        items.add(new ItemObject(R.drawable.brown,"Forever", "Chris Brown"));
        items.add(new ItemObject(R.drawable.rihana,"Stay", "Rihanna"));
        items.add(new ItemObject(R.drawable.jason,"Marry me", "Jason Derulo"));
        items.add(new ItemObject(R.drawable.shakira,"Waka Waka", "Shakira"));
        items.add(new ItemObject(R.drawable.perry,"Dark Horse", "Katy Perry"));
        items.add(new ItemObject(R.drawable.milian,"Dip It Low", "Christina Milian"));
        items.add(new ItemObject(R.drawable.milian,"Dip It Low", "Christina Milian"));
        items.add(new ItemObject(R.drawable.milian,"Dip It Low", "Christina Milian"));
        return items;
    }
        }



