package com.example.myapplication.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.myapplication.HabitatActivity;
import com.example.myapplication.HabitatAdapter;
import com.example.myapplication.R;

import java.Appliance;
import java.Habitat;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HabitatsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HabitatsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HabitatsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HabitatsFragment newInstance(String param1, String param2) {
        HabitatsFragment fragment = new HabitatsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("Habitats");
        View view=inflater.inflate(R.layout.fragment_habitats, container, false);

        // appliances
        Appliance appliance1 = new Appliance(1,"machine_laver", 500, "600H");
        Appliance appliance2 = new Appliance(2,"aspirateur", 300, "7800H");
        Appliance appliance3 = new Appliance(3,"fer_a_repasser", 250, "800H");
        Appliance appliance4 = new Appliance(4,"climatiseur", 1500, "9600H");

        List<Appliance> appliances1 = new ArrayList<>();
        appliances1.add(appliance1);
        appliances1.add(appliance2);
        appliances1.add(appliance3);
        appliances1.add(appliance4);

        List<Appliance> appliances2 = new ArrayList<>();
        appliances2.add(appliance1);
        appliances2.add(appliance2);

        List<Appliance> appliances3 = new ArrayList<>();
        appliances3.add(appliance1);

        List<Appliance> appliances4 = new ArrayList<>();
        appliances4.add(appliance1);
        appliances4.add(appliance2);

        List<Appliance> appliances5 = new ArrayList<>();
        appliances5.add(appliance1);
        appliances5.add(appliance2);
        appliances5.add(appliance3);

        List<Habitat> habitants = new ArrayList<>();

        habitants.add(new Habitat(1, "Gaëtan LeClair", 1, 500.0,appliances1));
        habitants.add(new Habitat(2, "Cédric Boudet", 1, 500.0,appliances2));
        habitants.add(new Habitat(1, "Gaylord Thibodeaux", 2, 500.0,appliances3));
        habitants.add(new Habitat(2, "Adam Jacquinot", 3, 500.0,appliances4));
        habitants.add(new Habitat(2, "Abel Fresnel", 3, 500.0,appliances5));

        ListView listView = view.findViewById(R.id.list_item);
        HabitatAdapter adapter = new HabitatAdapter(getActivity(), R.layout.item_habitat, habitants);
        listView.setAdapter(adapter);

        return view;
    }
}