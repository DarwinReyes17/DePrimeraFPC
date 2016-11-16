package com.example.deprimerafpc;



import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.example.orio2016.R;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
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
		case 1: iv.setImageResource(R.drawable.apetrolera);break;
		case 2: iv.setImageResource(R.drawable.bucaramanga);break;
		case 3: iv.setImageResource(R.drawable.huila);break;
		case 4: iv.setImageResource(R.drawable.nacinal);break;
		case 5: iv.setImageResource(R.drawable.chico);break;
		case 6: iv.setImageResource(R.drawable.cortulua);break;
		case 7: iv.setImageResource(R.drawable.tolima);break;
		case 8: iv.setImageResource(R.drawable.cali);break;
		case 9: iv.setImageResource(R.drawable.pasto);break;
		case 10: iv.setImageResource(R.drawable.envigado);break;
		case 11: iv.setImageResource(R.drawable.fortaleza);break;
		case 12: iv.setImageResource(R.drawable.medellin);break;
		case 13: iv.setImageResource(R.drawable.jaguares);break;
		case 14: iv.setImageResource(R.drawable.junior);break;
		case 15: iv.setImageResource(R.drawable.equidad);break;
		case 16: iv.setImageResource(R.drawable.millonarios);break;
		case 17: iv.setImageResource(R.drawable.oncecaldas);break;
		case 18: iv.setImageResource(R.drawable.patriotas);break;
		case 19: iv.setImageResource(R.drawable.rionegro);break;
		case 20: iv.setImageResource(R.drawable.santafe);break;
		
		
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
	
	public void medallao(View v){
		Intent i = new Intent (this, TresActivity.class);
		Bundle b = new Bundle();
		Bundle pa = new Bundle();
		b.putInt("Dato", 1);
		pa.putInt("Dato2", p);
		i.putExtras(b);
		i.putExtras(pa);
		startActivity(i);
	}

}

