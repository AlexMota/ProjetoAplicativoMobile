package com.example.notificaufg;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {
	
	EditText mLogin;
	EditText mSenha;
	Button mEntrar;
	Button mRegistrar;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iniciarView();
	}
	

	private void iniciarView(){
		
		mLogin = (EditText) findViewById(R.id.entradaNome);
		mSenha = (EditText) findViewById(R.id.entradaSenha);
		mEntrar = (Button) findViewById(R.id.entrar);
		mRegistrar = (Button) findViewById(R.id.novoRegistro);
		
		mEntrar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				loginUsuario();
				
			}
		});
		
		mRegistrar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				novoRegitro();
				
			}

		});
		
		
	}
	
	private void loginUsuario(){
		
		String login = mLogin.getText().toString();
		String senha = mSenha.getText().toString();
		
		abrirTelaMenu(this);
		
	}
	

	private void abrirTelaMenu(Activity activity) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(activity, MenuActivity.class);
		startActivity(intent);
		
	}


	private void novoRegitro() {
		// TODO Auto-generated method stub
		abrirTelaNovoRegistro(this);
		
	}


	private void abrirTelaNovoRegistro(Activity activity) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(activity, RegistrarActivity.class);
		startActivity(intent);
			
	}


	
}

