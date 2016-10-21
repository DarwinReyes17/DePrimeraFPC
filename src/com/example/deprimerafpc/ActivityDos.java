package com.example.deprimerafpc;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDos extends Activity {

	private TextView tv; ImageView iv;
	int p=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dos);
		tv=(TextView)findViewById(R.id.textView1);
		Bundle b = getIntent().getExtras();
		tv.setText("Hola: "+b.getString("Dato")+"Bienvenido, acá podras consultar información de tu equipo.");
		p=b.getInt("Dato2");
		switch (p){
		case 16: ;break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_dos, menu);
		return true;
	}

}
