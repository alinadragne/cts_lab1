package ro.acs.cts.seminar8.decorator;

public abstract class AbstractBackpackDecorator extends AbstractBackpack {
	protected AbstractBackpack basicBackpack;
	
	public AbstractBackpackDecorator(AbstractBackpack basicBackPack) {
		super();
		this.basicBackpack = basicBackPack;
	}
	
	
	
}
