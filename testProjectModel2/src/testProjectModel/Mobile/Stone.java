package testProjectModel.Mobile;

import testProjectModel.Element.Permeability;
import testProjectModel.Strategy.ElementMovement;

public class Stone extends Mobile{

	public Stone() {
		super(Permeability.Push, 'P');
		this.setMovement(new ElementMovement(this));
	}

}
