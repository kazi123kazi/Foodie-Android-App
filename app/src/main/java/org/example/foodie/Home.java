package org.example.foodie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Home extends Fragment {



    private  static  RecyclerView subrecview;
    public Home() {

    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);




        //SETTING up recyclerview
        subrecview=rootView.findViewById(R.id.my_recycler_view);
        RestaurantAdapter adapter = new RestaurantAdapter(getActivity());
        subrecview.setAdapter(adapter);
        subrecview.setLayoutManager(new GridLayoutManager(getActivity(),1));;
        Util util = new Util();
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants = util.getAllRestaurants();
        adapter.setRestaurants(restaurants);
        subrecview.setAdapter(adapter);
        return rootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("FOODIE");
    }

}


