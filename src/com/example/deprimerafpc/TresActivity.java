package com.example.deprimerafpc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TresActivity extends Activity {

	int p, m=0;
	private TextView tv3;
	private ImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tres);
		tv3=(TextView)findViewById(R.id.textView1);
		iv=(ImageView)findViewById(R.id.imageView1);
		Bundle b = getIntent().getExtras();		
		p=b.getInt("Dato2");
		m=b.getInt("Dato");
		if(m==1){
		info();	
		}
		if(m==2){
			plantilla();
		}
		
	}
	
	public void info(){
		String linea = ""; String retornar = "";
		switch (p) {
		case 1:
			InputStream a1= getResources().openRawResource(R.raw.a1);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a1)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 2:
			InputStream a2= getResources().openRawResource(R.raw.a2);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a2)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 3:
			InputStream a3= getResources().openRawResource(R.raw.a3);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a3)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 4:
			InputStream a4= getResources().openRawResource(R.raw.a4);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a4)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 5:
			InputStream a5= getResources().openRawResource(R.raw.a5);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a5)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 6:
			InputStream a6= getResources().openRawResource(R.raw.a6);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a6)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 7:
			InputStream a7= getResources().openRawResource(R.raw.a7);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a7)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 8:
			InputStream a8= getResources().openRawResource(R.raw.a8);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a8)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 9:
			InputStream a9= getResources().openRawResource(R.raw.a9);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a9)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 10:
			InputStream a10= getResources().openRawResource(R.raw.a10);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a10)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 11:
			InputStream a11= getResources().openRawResource(R.raw.a11);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a11)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 12:
			InputStream a12= getResources().openRawResource(R.raw.a12);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a12)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 13:
			InputStream a13= getResources().openRawResource(R.raw.a13);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a13)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 14:
			InputStream a14= getResources().openRawResource(R.raw.a14);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a14)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 15:
			InputStream a15= getResources().openRawResource(R.raw.a15);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a15)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 16:
			InputStream a16= getResources().openRawResource(R.raw.a16);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a16)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 17:
			InputStream a17= getResources().openRawResource(R.raw.a17);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a17)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 18:
			InputStream a18= getResources().openRawResource(R.raw.a18);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a18)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 19:
			InputStream a19= getResources().openRawResource(R.raw.a19);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a19)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		case 20:
			InputStream a20= getResources().openRawResource(R.raw.a20);
			try { BufferedReader br = new BufferedReader(new InputStreamReader(a20)); 
			while ((linea = br.readLine()) != null){ 
				retornar += linea + "\n"; 
			} br.close(); 
			tv3.setText(retornar);
			}catch (Exception ex){
				Toast.makeText(this, "Error en archivo", Toast.LENGTH_LONG).show();
			}	
			break;
		default:
			break;
		}
	}
	
	public void plantilla(){
		switch (p){
		case 1: iv.setImageResource(R.drawable.palianza);break;
		case 2: iv.setImageResource(R.drawable.pbucaramanga);break;
		case 3: iv.setImageResource(R.drawable.phuila);break;
		case 4: iv.setImageResource(R.drawable.pnacional);break;
		case 5: iv.setImageResource(R.drawable.pchico);break;
		case 6: iv.setImageResource(R.drawable.pcortulua);break;
		case 7: iv.setImageResource(R.drawable.ptolima);break;
		case 8: iv.setImageResource(R.drawable.pcali);break;
		case 9: iv.setImageResource(R.drawable.ppasto);break;
		case 10: iv.setImageResource(R.drawable.penvigado);break;
		case 11: iv.setImageResource(R.drawable.pfortaleza);break;
		case 12: iv.setImageResource(R.drawable.pmedellin);break;
		case 13: iv.setImageResource(R.drawable.pjaguares);break;
		case 14: iv.setImageResource(R.drawable.pjunior);break;
		case 15: iv.setImageResource(R.drawable.pequidad);break;
		case 16: iv.setImageResource(R.drawable.pmillonarios);break;
		case 17: iv.setImageResource(R.drawable.poncecaldas);break;
		case 18: iv.setImageResource(R.drawable.ppatriotas);break;
		case 19: iv.setImageResource(R.drawable.prionegro);break;
		case 20: iv.setImageResource(R.drawable.psantafe);break;
		}
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tres, menu);
		return true;
	}

}
