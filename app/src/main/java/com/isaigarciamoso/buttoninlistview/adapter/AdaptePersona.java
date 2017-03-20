package com.isaigarciamoso.buttoninlistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.isaigarciamoso.buttoninlistview.R;
import com.isaigarciamoso.buttoninlistview.models.Persona;

import java.util.List;

/**
 * Created by isaigarciamoso on 19/03/17.
 */

public class AdaptePersona extends ArrayAdapter<Persona> {

    public AdaptePersona(Context context, List<Persona> listPersona) {
        super(context, 0, listPersona);
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView = view;

        if (rootView == null){
            rootView = inflater.inflate(R.layout.item_persona, viewGroup,false);
        }
        TextView nombrePersona = (TextView)rootView.findViewById(R.id.nombrePersona);
        ImageView imageViewPersona =  (ImageView) rootView.findViewById(R.id.imagePersona);
        Button btnEdad = (Button)rootView.findViewById(R.id.btnEdad);

        final Persona persona = getItem(position);

        nombrePersona.setText(persona.getNombre());
        imageViewPersona.setImageResource(R.drawable.puppy);
        btnEdad.setText(persona.getEdad()+"");
        btnEdad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext().getApplicationContext(),""+persona.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

}
