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


public class MallsFragment extends Fragment {


    public MallsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();

        //public Tour(int pictureId, int nameId, int openHoursId, int telephoneId, int priceId, int addressId
        tours.add(new Tour(R.drawable.mall_1, R.string.mall_1_name, R.string.mall_1_openHours, R.string.mall_1_telephone, R.string.mall_1_price, R.string.mall_1_address));
        tours.add(new Tour(R.drawable.mall_2, R.string.mall_2_name, R.string.mall_2_openHours, R.string.mall_2_telephone, R.string.mall_2_price, R.string.mall_2_address));
        tours.add(new Tour(R.drawable.mall_3, R.string.mall_3_name, R.string.mall_3_openHours, R.string.mall_3_telephone, R.string.mall_3_price, R.string.mall_3_address));
        tours.add(new Tour(R.drawable.mall_4, R.string.mall_4_name, R.string.mall_4_openHours, R.string.mall_4_telephone, R.string.mall_4_price, R.string.mall_4_address));
        tours.add(new Tour(R.drawable.mall_5, R.string.mall_5_name, R.string.mall_5_openHours, R.string.mall_5_telephone, R.string.mall_5_price, R.string.mall_5_address));
        tours.add(new Tour(R.drawable.mall_6, R.string.mall_6_name, R.string.mall_6_openHours, R.string.mall_6_telephone, R.string.mall_6_price, R.string.mall_6_address));
        tours.add(new Tour(R.drawable.mall_7, R.string.mall_7_name, R.string.mall_7_openHours, R.string.mall_7_telephone, R.string.mall_7_price, R.string.mall_7_address));
        tours.add(new Tour(R.drawable.mall_8, R.string.mall_8_name, R.string.mall_8_openHours, R.string.mall_8_telephone, R.string.mall_8_price, R.string.mall_8_address));
        tours.add(new Tour(R.drawable.mall_9, R.string.mall_9_name, R.string.mall_9_openHours, R.string.mall_9_telephone, R.string.mall_9_price, R.string.mall_9_address));


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