package com.example.notificaufg;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class NotificacaoActivity extends Activity {
	
	TextView mData;
	TextView mRemetente;
	TextView mConteudo;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notificacao);
		iniciarView();

	}


	private void iniciarView() {
		// TODO Auto-generated method stub
		Bundle bundle = getIntent().getExtras();
		
		mRemetente = (TextView) findViewById(R.id.remetente);
		mConteudo = (TextView) findViewById(R.id.conteudo);
		mData = (TextView) findViewById(R.id.data);
		
		String rem = bundle.get("remetente").toString();
		mRemetente.setText(rem);
		String con = bundle.get("conteudo").toString();
		mConteudo.setText(con);
		String dat = bundle.get("data").toString();
		mData.setText(dat);
	}
	
	
	
}
