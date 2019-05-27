package testProjectModel.Mobile;

import testProjectModel.Element.Permeability;
import testProjectModel.Strategy.EntityMovement;


public class Enemy extends Mobile{

	public Enemy() {
		super(Permeability.Blocking, 'E');
		this.setMovement( new EntityMovement(this));
		}
}
