package com.example.android.sinemistanbultourappp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class SightsFragment extends Fragment {


    public SightsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();

        //public Tour(int pictureId, int nameId, int openHoursId, int telephoneId, int priceId, int addressId
        tours.add(new Tour(R.drawable.sight_1, R.string.sight_1_name, R.string.sight_1_openHours, R.string.sight_1_telephone, R.string.sight_1_price, R.string.sight_1_address));
        tours.add(new Tour(R.drawable.sight_2, R.string.sight_2_name, R.string.sight_2_openHours, R.string.sight_2_telephone, R.string.sight_2_price, R.string.sight_2_address));
        tours.add(new Tour(R.drawable.sight_3, R.string.sight_3_name, R.string.sight_3_openHours, R.string.sight_3_telephone, R.string.sight_3_price, R.string.sight_3_address));
        tours.add(new Tour(R.drawable.sight_4, R.string.sight_4_name, R.string.sight_4_openHours, R.string.sight_4_telephone, R.string.sight_4_price, R.string.sight_4_address));
        tours.add(new Tour(R.drawable.sight_5, R.string.sight_5_name, R.string.sight_5_openHours, R.string.sight_5_telephone, R.string.sight_5_price, R.string.sight_5_address));
        tours.add(new Tour(R.drawable.sight_6, R.string.sight_6_name, R.string.sight_6_openHours, R.string.sight_6_telephone, R.string.sight_6_price, R.string.sight_6_address));
        tours.add(new Tour(R.drawable.sight_7, R.string.sight_7_name, R.string.sight_7_openHours, R.string.sight_7_telephone, R.string.sight_7_price, R.string.sight_7_address));
        tours.add(new Tour(R.drawable.sight_8, R.string.sight_8_name, R.string.sight_8_openHours, R.string.sight_8_telephone, R.string.sight_8_price, R.string.sight_8_address));
        tours.add(new Tour(R.drawable.sight_9, R.string.sight_9_name, R.string.sight_9_openHours, R.string.sight_9_telephone, R.string.sight_9_price, R.string.sight_9_address));


        final TourAdapter adapter = new TourAdapter(getActivity(), tours);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        final ListView myList = (ListView) rootView.findViewById(R.id.list);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object listItem = myList.getItemAtPosition(position);
                Intent intent = new Intent(getActivity(), TourDetails.class);
                intent.putExtra("picture", tours.get(position).getPictureId());
                intent.putExtra("name", tours.get(position).getNameId());
                intent.putExtra("openHours", tours.get(position).getOpenHoursId());
                intent.putExtra("telephone", tours.get(position).getTelephoneId());
                intent.putExtra("price", tours.get(position).getmPriceId());
                intent.putExtra("address", tours.get(position).getAddressId());

                startActivity(intent);

            }
        });

        return rootView;
    }

}