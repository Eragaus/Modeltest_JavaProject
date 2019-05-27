package testProjectModel.Mobile;

import testProjectModel.Element.Permeability;
import testProjectModel.Strategy.ElementMovement;

public class Diamond extends Mobile{
	
	public Diamond()
	{
		super(Permeability.Push, 'D');
		this.setMovement(new ElementMovement(this));
	}

}
