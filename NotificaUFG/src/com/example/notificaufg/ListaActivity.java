package com.example.notificaufg;

import java.util.ArrayList;

import com.example.notificaufg.teste.Notificacao;
import com.example.notificaufg.teste.NotificacaoAdapter;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class ListaActivity extends ListActivity {

	NotificacaoAdapter adapter;
	int posicao;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_lista);
		
		ArrayList<Notificacao> notificacoes = new ArrayList<Notificacao>();
		notificacoes.add(new Notificacao("Reitoria", "xskj dsljd dslkjds","23/06/2014"));
		notificacoes.add(new Notificacao("Pro Reitoria", "ghgj mnbnb iouois","22/06/2014"));
		notificacoes.add(new Notificacao("Biblioteca", "sahg sdh salçk","21/06/2014"));
		notificacoes.add(new Notificacao("Coord. do Curso", "amnm powiq opi","20/06/2014"));
		notificacoes.add(new Notificacao("Diret. do Instituto", "kljs kjsa lkjs","19/06/2014"));
		notificacoes.add(new Notificacao("Disciplina 1", "lkds lkjsda kljsa","17/06/2014"));
		notificacoes.add(new Notificacao("Disciplina 2", "sjk slkj dlksjs","14/06/2014"));
		notificacoes.add(new Notificacao("Disciplina 3", "dlksj slkj iuoewp","13/06/2014"));
		notificacoes.add(new Notificacao("Disciplina 1", "iouew poire dflkjf","11/06/2014"));
		notificacoes.add(new Notificacao("Disciplina 2", "dlksd oweiew weoiew","09/06/2014"));
		notificacoes.add(new Notificacao("Disciplina 3", "kljsd oçlsdw ldçjsw","08/06/2014"));


		adapter = new NotificacaoAdapter(this, notificacoes);
		setListAdapter(adapter);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
		super.onListItemClick(l, v, position, id);
		posicao = position;
		notificacao();		
	}

	private void notificacao() {
		// TODO Auto-generated method stub
		abrirTelaNotificacao(this);
		
	}

	private void abrirTelaNotificacao(Activity activity) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(activity, NotificacaoActivity.class);
		Notificacao notificacao = (Notificacao) adapter.getItem(posicao);
		intent.putExtra("remetente", notificacao.getRemetente());
		intent.putExtra("conteudo", notificacao.getConteudo());
		intent.putExtra("data", notificacao.getData());
		
		startActivity(intent);
		
	}
	
	
	
}
