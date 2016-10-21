package com.example.deprimerafpc;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {

	private EditText et1;
	private Spinner spequipo;
	private TextView tv5;
	private String nomu="";
	private int equipo=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText1);
        spequipo=(Spinner)findViewById(R.id.spinner1);
        tv5=(TextView)findViewById(R.id.textView4);
        String pa[]={"Seleccionar ", "Alianza Petrolera ", "Atlético Bucaramanga ", "Atlético Huila ", "Atlético Nacional ", "Boyacá Chicó ", "Cortuluá ", "Deportes Tolima ","Deportivo Cali","Deportivo Pasto","Envigado F. C.","Fortaleza","Independiente Medellín","Jaguares","Junior","La Equidad","Millonarios","Once Caldas","Patriotas","Rionegro Águilas","Santa Fe"};
        ArrayAdapter<String> aa=
        		new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,pa);
        spequipo.setAdapter(aa);          
    }
    
    public void ingresar(View v){
        
        spequipo.setOnItemSelectedListener(new OnItemSelectedListener() {

    		@Override
    		public void onItemSelected(AdapterView<?> arg0, View arg1,
    				int arg2, long arg3) {
    			// TODO Auto-generated method stub
    			try {
    				nomu=et1.getText().toString();		        
    				switch (arg2) {
    				case 0: equipo=0;tv5.setText("Seleccione un equipo");break;
    				case 1: equipo=1;break;
    				case 2: equipo=2;break;
    				case 3: equipo=3;break;
    				case 4: equipo=4;break;
    				case 5: equipo=5;break;
    				case 6: equipo=6;break;
    				case 7: equipo=7;break;
    				case 8: equipo=8;break;
    				case 9: equipo=9;break;
    				case 10: equipo=10;break;
    				case 11: equipo=11;break;
    				case 12: equipo=12;break;
    				case 13: equipo=13;break;
    				case 14: equipo=14;break;
    				case 15: equipo=15;break;
    				case 16: equipo=16;break;
    				case 17: equipo=17;break;
    				case 18: equipo=18;break;
    				case 19: equipo=19;break;
    				case 20: equipo=20;break;
    				
    				default:tv5.setText("Seleccione un equipo");
    				
    				}				
    			}catch(Exception e){
    				tv5.setText("Faltan datos");
    			}
    		}

    		@Override
    		public void onNothingSelected(AdapterView<?> arg0) {
    			// TODO Auto-generated method stub
    			
    		}
    		
    	});
        
        nomu=et1.getText().toString().trim();
    	if(nomu.equalsIgnoreCase("") || equipo==0){
    	Toast.makeText(this, "Falta dato", Toast.LENGTH_LONG).show();
    	}
    	else
    	{
    		Intent i = new Intent (this, ActivityDos.class);
    		Bundle b = new Bundle();
    		Bundle p = new Bundle();
    		b.putString("Dato", nomu);
    		p.putInt("Dato2", equipo);
    		i.putExtras(b);
    		i.putExtras(p);
    		startActivity(i);
    		
    	}
        
        }
        
        public void salir(View v){
        	finish();
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
