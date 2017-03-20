package com.isaigarciamoso.buttoninlistview.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.isaigarciamoso.buttoninlistview.R;
import com.isaigarciamoso.buttoninlistview.adapter.AdaptePersona;
import com.isaigarciamoso.buttoninlistview.models.Persona;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private AdaptePersona adaptePersona;
    private List<Persona> listPersona;
    private ListView listViewPersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listPersona = new ArrayList<>();
        listPersona.add(new Persona(50, "ISAI GARCIA MOSO", 52.44, 1.63));
        listPersona.add(new Persona(27, "PEPE GARCIA", 52.44, 1.63));
        listPersona.add(new Persona(28, "TOÑO EL CUETE", 52.44, 1.63));
        listPersona.add(new Persona(29, "ISRAEL", 52.44, 1.63));
        listPersona.add(new Persona(26, "PERICO", 52.44, 1.63));
        listPersona.add(new Persona(60, "GRISELDA FLORES OCAMPO", 52.44, 1.63));
        listPersona.add(new Persona(12, "ERICKA", 52.44, 1.63));
        listPersona.add(new Persona(21, "FABIOLA", 52.44, 1.63));
        listPersona.add(new Persona(21, "EVITELIA GARCIA MOSO", 52.44, 1.63));
        listPersona.add(new Persona(43, "SPHANY  MOSO", 52.44, 1.63));
        listPersona.add(new Persona(4, "DIANA", 52.44, 1.63));
        listPersona.add(new Persona(3, "NESTOR", 52.44, 1.63));
        listPersona.add(new Persona(789, "KARLA", 52.44, 1.63));
        listPersona.add(new Persona(212, "GABRIELA", 52.44, 1.63));
        listPersona.add(new Persona(213, "LAYDI", 52.44, 1.63));
        listPersona.add(new Persona(83, "JAUNITO ESPARZA", 52.44, 1.63));
        listPersona.add(new Persona(98, "EL PEPE", 52.44, 1.63));
        listPersona.add(new Persona(56, "EDUARDO CRUZ RIVERA", 52.44, 1.63));
        listPersona.add(new Persona(353, "JOY SOCIO", 52.44, 1.63));
        listPersona.add(new Persona(209, "ALEJANDRO", 52.44, 1.63));
        listPersona.add(new Persona(239, "ALBERTO GARCIA MOSO", 52.44, 1.63));
        listPersona.add(new Persona(45, "ABRAHAM GARCIA MOSO", 52.44, 1.63));
        adaptePersona = new AdaptePersona(getApplicationContext(), listPersona);

        initViews();

        listViewPersona.setAdapter(adaptePersona);

    }

    public void initViews() {
        listViewPersona = (ListView) findViewById(R.id.listviewPersona);
    }
}
