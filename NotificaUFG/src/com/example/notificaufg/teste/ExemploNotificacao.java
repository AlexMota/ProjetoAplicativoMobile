package com.example.notificaufg.teste;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ExemploNotificacao {

	ArrayList<String> listaNotificacoes;

	public ExemploNotificacao() {
		super();
		this.listaNotificacoes = new ArrayList<String>();

		listaNotificacoes
				.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut sagittis massa enim, eu luctus enim scelerisque quis. Ut convallis in orci ut sollicitudin. Fusce semper elementum semper. Quisque scelerisque tincidunt sollicitudin. Sed mollis tortor eu cursus eleifend. Nulla tincidunt tellus vulputate dolor venenatis feugiat. Mauris congue accumsan facilisis. Aenean semper lobortis nisl, non dapibus quam elementum eget. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Proin quis nulla a velit pulvinar hendrerit. Aliquam vel erat sapien. Mauris vel aliquet libero. Aenean turpis justo, tincidunt nec vestibulum at, blandit sit amet lectus. Sed sit amet ultrices nunc. Curabitur ultricies justo libero, sit amet placerat sapien malesuada nec. Donec ornare accumsan sapien, vel varius sapien egestas sit amet.");
		listaNotificacoes
				.add("Donec eleifend euismod tristique. Nam porttitor, enim sit amet laoreet aliquet, lorem felis scelerisque massa, quis sollicitudin est erat sed leo. Quisque aliquam ipsum ligula, lacinia placerat ipsum blandit at. Maecenas rhoncus leo sem, vel blandit leo lobortis vel. Donec quis tristique leo. Pellentesque ullamcorper massa est, nec placerat metus consectetur sed. Cras id orci dignissim, dictum massa eget, consequat lectus. Pellentesque ac risus non justo venenatis placerat. Integer vitae blandit erat. Nulla ac lobortis tortor. Vivamus sit amet orci vitae enim eleifend malesuada vitae vitae massa. Vivamus hendrerit, diam eu vulputate ultricies, ipsum lorem accumsan orci, nec tempus justo nunc ac metus. Praesent placerat mi a ornare vestibulum. Morbi augue mauris, bibendum non dignissim a, mollis eu purus");
		listaNotificacoes
				.add("Nullam nec est bibendum, tempor ligula vel, scelerisque lorem. Fusce condimentum tincidunt rhoncus. Phasellus dignissim consequat turpis, sed faucibus elit euismod vel. Nam sit amet dui interdum, tempus eros ac, malesuada dui. Proin velit est, dignissim non nisl at, tristique consequat lectus. Donec dapibus ultrices varius. Nullam quis tempor nulla, non iaculis velit. Nulla eu accumsan diam. Etiam massa elit, eleifend ut rhoncus et, placerat quis lorem. Nulla congue velit in nibh elementum, vitae bibendum diam porttitor. Phasellus mattis neque at mi lobortis elementum. Suspendisse porttitor iaculis lectus pellentesque imperdiet. Quisque vitae rutrum enim. Maecenas condimentum justo sem, eleifend gravida tortor scelerisque luctus.");
		listaNotificacoes
				.add("Phasellus fringilla metus sed magna facilisis malesuada. Pellentesque id pellentesque quam. Mauris tortor velit, sollicitudin ut congue ut, porttitor vel augue. Fusce vulputate tellus tortor, vel blandit urna interdum sit amet. Fusce sit amet risus sed enim lacinia interdum. Donec facilisis nunc pretium odio blandit, vitae suscipit nibh dignissim. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur fringilla laoreet leo a cursus.");

	}

	public ArrayList<String> getListaNotificacoes() {
		return listaNotificacoes;
	}

}
