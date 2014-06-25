package com.example.notificaufg.teste;

import java.util.List;

import com.example.notificaufg.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class NotificacaoAdapter extends BaseAdapter{
	
	private Context context;
	private List<Notificacao> listNot;

	public NotificacaoAdapter(Context context, List<Notificacao> listNot) {
		super();
		this.context = context;
		this.listNot = listNot;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listNot.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return listNot.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return listNot.get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		Notificacao notificacao = listNot.get(position);
		
		View v = LayoutInflater.from(context).inflate(R.layout.activity_lista, null);
		
		TextView txt1 = (TextView) v.findViewById(R.id.remetenteItem);
		TextView txt2 = (TextView) v.findViewById(R.id.textoItem);
		TextView txt3 = (TextView) v.findViewById(R.id.dataItem);


		txt1.setText(notificacao.getRemetente());
		txt2.setText(notificacao.getConteudo());
		txt3.setText(notificacao.getData());
		
		return v;
	}

}
