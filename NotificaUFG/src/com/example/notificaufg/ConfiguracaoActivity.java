package com.example.notificaufg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.View.OnClickListener;




public class ConfiguracaoActivity extends Activity {

	CheckBox mReitoria;
	CheckBox mProReitoria;
	CheckBox mBiblioteca;
	CheckBox mDirecao;
	CheckBox mCoordenacao;
	CheckBox mDisciplina1;
	CheckBox mDisciplina2;
	CheckBox mDisciplina3;
	Button mConcluir;
	Button mCancelar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_configuracao);
		iniciarView();
	}

	private void iniciarView() {
		// TODO Auto-generated method stub
		mReitoria = (CheckBox) findViewById(R.id.reitoria);
		mProReitoria = (CheckBox) findViewById(R.id.proReitoria);
		mBiblioteca = (CheckBox) findViewById(R.id.biblioteca);
		mDirecao = (CheckBox) findViewById(R.id.direcao);
		mCoordenacao = (CheckBox) findViewById(R.id.coordenacao);
		mDisciplina1 = (CheckBox) findViewById(R.id.disciplina1);
		mDisciplina2 = (CheckBox) findViewById(R.id.disciplina2);
		mDisciplina3 = (CheckBox) findViewById(R.id.disciplina3);
		mCancelar = (Button) findViewById(R.id.cancelarConfig);
		mConcluir = (Button) findViewById(R.id.concluirConfig);
		
		mCancelar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				voltarMenu();
			}
		});
		
		mConcluir.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				gravarConfiguracoes();
			}
		});
		
		
	}
	
	private void gravarConfiguracoes(){
		abrirTelaMenu(this);
	}

	private void voltarMenu() {
		// TODO Auto-generated method stub
		abrirTelaMenu(this);		
	}
	
	private void abrirTelaMenu(Activity activity) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(activity, MenuActivity.class);
		startActivity(intent);		
	}
}
