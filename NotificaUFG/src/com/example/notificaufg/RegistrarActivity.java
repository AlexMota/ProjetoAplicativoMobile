package com.example.notificaufg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;


public class RegistrarActivity extends Activity {
	
	EditText mNomeCompleto;
	EditText mNomeUsuario;
	EditText mEmail;
	RadioGroup mTipoUsuario;
	Button mRegistrar;
	Button mCancelar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registrar);
	iniciarView();
	}

	private void iniciarView() {
		// TODO Auto-generated method stub
		mNomeCompleto = (EditText) findViewById(R.id.entradaNomeCompleto);
		mNomeUsuario = (EditText) findViewById(R.id.entradaNomeUsuario);
		mEmail = (EditText) findViewById(R.id.entradaEmail);
		
		mTipoUsuario = (RadioGroup) findViewById(R.id.opcoesTipoUsuario);
		mRegistrar = (Button) findViewById(R.id.registrar);
		mCancelar = (Button) findViewById(R.id.cancelarRegistro);
		
		mRegistrar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				registrarNovoUsuario();
				
			}


		});

		mCancelar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				cancelar();
				
			}

		});

	}
	

	private void abrirTelaInicial(Activity activity) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(activity, MainActivity.class);
		startActivity(intent);
		
	}
	
	private void cancelar() {
		// TODO Auto-generated method stub
		abrirTelaInicial(this);
		
	}

	private void registrarNovoUsuario() {
		// TODO Auto-generated method stub
		abrirTelaMenu(this);
	}

	private void abrirTelaMenu(Activity activity) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(activity, MenuActivity.class);
		startActivity(intent);
		
	}


	
	
	
}
