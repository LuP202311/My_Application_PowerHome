package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.Habitat;
import java.util.List;

public class HabitatAdapter extends ArrayAdapter<Habitat> {
    Activity activity;
    int itemResourceId;
    List<Habitat> habitants;
    public HabitatAdapter(Activity activity, int itemResourceId, List<Habitat> habitants) {
        super(activity, itemResourceId, habitants);
        this.activity = activity;
        this.habitants = habitants;
        this.itemResourceId = itemResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View layout = convertView;
        if(convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            layout = inflater.inflate(itemResourceId, parent, false);
        }
        Habitat habitat = habitants.get(position);

        TextView residentName = (TextView) layout.findViewById(R.id.residentName);
        TextView floor = (TextView) layout.findViewById(R.id.floor);
        TextView nbAppliances = (TextView) layout.findViewById(R.id.nbrAppliances);
        ImageView icon1 = (ImageView) layout.findViewById(R.id.appliance1);
        ImageView icon2 = (ImageView) layout.findViewById(R.id.appliance2);
        ImageView icon3 = (ImageView) layout.findViewById(R.id.appliance3);
        ImageView icon4 = (ImageView) layout.findViewById(R.id.appliance4);
        ImageView[] icon = new ImageView[]{icon1,icon2,icon3,icon4};
        residentName.setText(habitants.get(position).getResidentName());
        floor.setText(String.valueOf(habitants.get(position).getFloor()));
        nbAppliances.setText(String.valueOf(habitants.get(position).getTotalAppliances()));
        //imgAppliances.setImageResource(habitants.get(position).);

        for(int i=0;i<habitants.get(position).getTotalAppliances();i++){
            if(habitants.get(position).getAppliance(i).getName() == "machine_laver")
                icon[i].setImageResource(R.drawable.ic_machine_a_laver);
            if(habitants.get(position).getAppliance(i).getName() == "aspirateur")
                icon[i].setImageResource(R.drawable.ic_aspirateur);
            if(habitants.get(position).getAppliance(i).getName() == "climatiseur")
                icon[i].setImageResource(R.drawable.ic_climatiseur);
            if(habitants.get(position).getAppliance(i).getName() == "fer_a_repasser")
                icon[i].setImageResource(R.drawable.ic_fer_a_repasser);
        }

        return layout;
    }
}
