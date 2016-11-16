package com.example.deprimerafpc;



import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
	
	
	public void muestraPDF(){
		
		String arch= getString(R.raw.ap);
		File file=new File(arch);
		Toast.makeText(this,"Abriendo", Toast.LENGTH_LONG).show();		
		Intent intent=new Intent(Intent.ACTION_VIEW);
		intent.setDataAndType(Uri.fromFile(file), "application/pdf");
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		try {
			this.startActivity(intent);
		} catch (Exception e) {
			Toast.makeText(this, "No se puede abrir el archivo", Toast.LENGTH_SHORT);
		}
	}

}
