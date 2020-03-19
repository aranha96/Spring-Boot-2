package br.jus.tjpb.swrsn;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.jus.tjpb.swrsn.itens.Item;
import br.jus.tjpb.swrsn.itens.ItemRepository;
import br.jus.tjpb.swrsn.rebeldes.Rebelde;
import br.jus.tjpb.swrsn.rebeldes.RebeldeRepository;

@SpringBootApplication
public class SwrsnApplication implements CommandLineRunner{

	@Autowired
	private RebeldeRepository rebeldeRepository;
	@Autowired
	private ItemRepository itemRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SwrsnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Rebelde reb1 = new Rebelde(null, "Luke Skywalker", "Templo Jedi", 60, 80, -120, null);
		Rebelde reb2 = new Rebelde(null, "Leia Organa", "Hope Station", 60, 40, 10, null);
		Rebelde reb3 = new Rebelde(null, "Finn", "Base A", 25, 57, 29, null);
		Rebelde reb4 = new Rebelde(null, "Rey Palpatine", "Base B", 24, -34, -18, null);
		Rebelde reb5 = new Rebelde(null, "Paul Demeron", "Base C", 30, 36, -30, null);
		Rebelde reb6 = new Rebelde(null, "Yoda", "Base D", 850, 52, -45, null);
		Rebelde reb7 = new Rebelde(null, "Obi Wan Kenobi", "Base E", 80, -25, 57, null);
		
		Item item1 = new Item(null, "Agua", 3, 2, reb1);
		Item item2 = new Item(null, "Comida", 4, 1, reb1);
		Item item3 = new Item(null, "Municao", 10, 3, reb2);
		Item item4 = new Item(null, "Arma", 1, 4, reb2);
		Item item5 = new Item(null, "Agua", 4, 2, reb3);
		Item item6 = new Item(null, "Comida", 4, 1, reb3);
		Item item7 = new Item(null, "Municao", 4, 3, reb4);
		Item item8 = new Item(null, "Arma", 4, 4, reb4);
		Item item9 = new Item(null, "Agua", 4, 2, reb5);
		Item item10 = new Item(null, "Comida", 4, 1, reb5);
		Item item11 = new Item(null, "Municao", 4, 3, reb6);
		Item item12 = new Item(null, "Arma", 4, 4, reb6);
		Item item13 = new Item(null, "Agua", 4, 2, reb7);
		Item item14 = new Item(null, "Comida", 4, 1, reb7);
		
		reb1.getInventario().addAll(Arrays.asList(item1,item2));
		reb2.getInventario().addAll(Arrays.asList(item3,item4));
		reb3.getInventario().addAll(Arrays.asList(item5,item6));
		reb4.getInventario().addAll(Arrays.asList(item7,item8));
		reb5.getInventario().addAll(Arrays.asList(item9,item10));
		reb6.getInventario().addAll(Arrays.asList(item11,item12));
		reb7.getInventario().addAll(Arrays.asList(item13,item14));
	

		rebeldeRepository.saveAll(Arrays.asList(reb1, reb2, reb3, reb4, reb5, reb6, reb7));
		itemRepository.saveAll(Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13, item14));
		
	}

}
