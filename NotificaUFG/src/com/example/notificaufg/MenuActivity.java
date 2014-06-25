package com.example.notificaufg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MenuActivity extends Activity {
	
	Button mNotificacoes;
	Button mConfiguracoes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		iniciarView();
	}
	
	private void iniciarView(){
		mNotificacoes = (Button) findViewById(R.id.notificacoes);
		mConfiguracoes = (Button) findViewById(R.id.configuracoes);
		
		mNotificacoes.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				listaNotificacoes();
			}

		});
		
		mConfiguracoes.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				configuracoes();
			}

		});
		

		
	}

	private void listaNotificacoes() {
		// TODO Auto-generated method stub
		
		abrirTelaNotificacoes(this);
		
	}

	private void abrirTelaNotificacoes(Activity activity) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(activity, ListaActivity.class);
		startActivity(intent);
		
	}
	

	private void configuracoes() {
		// TODO Auto-generated method stub
		abrirTelaConfiguracoes(this);
	}

	private void abrirTelaConfiguracoes(Activity activity) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(activity, ConfiguracaoActivity.class);
		startActivity(intent);
	}
	

	
}
