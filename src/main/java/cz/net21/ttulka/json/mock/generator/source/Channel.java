package cz.net21.ttulka.json.mock.generator.source;

import java.util.Random;

/**
 * Class to retrieve a random channel.
 * @author s.keshmiri
 *
 */
public class Channel implements Source<String> {
	
	private String channel;
	
	public Channel() {
		this.channel = getNext();
	}

	@Override
	public String getNext() {
		
		return getRandomChannel();
	}
	
	private String getRandomChannel() {
		String mrp = "MRP";
		String ton = "TON";
		String nap = "NAP";
		
		Random rn = new Random();
		int select = rn.nextInt(3);
		switch (select) {
		case 0:
				return mrp;
		case 1: 
				return ton;
		case 2:
				return nap;
		}	
		return "MRP";
	}
	


}
