package com.example.notificaufg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.notificaufg.teste.ExemploNotificacao;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaNotificacoesActivity extends Activity {

	ListView mListaNotificacoes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_notificacoes);
		iniciarView();
	}

	private void iniciarView() {
		// TODO Auto-generated method stub

	}

	
}
