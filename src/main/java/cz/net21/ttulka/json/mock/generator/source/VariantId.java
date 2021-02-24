package cz.net21.ttulka.json.mock.generator.source;

import java.util.Random;

/**
 * Create a random 16 digit id.
 * @author s.keshmiri
 *
 */
public class VariantId implements Source<String> {
	
	private String randId;
	
	
	public VariantId() {
		super();
		this.randId = getNext();
	}
		
	@Override
	public String getNext() {
		return generateVariantId();
	}
	
	private String generateVariantId() {
		Random rn = new Random();
		long first = rn.nextInt(1000000000);
		long second = rn.nextInt(1000000000);
		first = first << 22;
		second = second << 22;
		long rand = first | second;
		return String.valueOf(rand);
	}

}
