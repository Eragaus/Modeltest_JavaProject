package testProjectModel.Strategy;

import testProjectModel.Mobile.Mobile;

public class PersonMovement extends MobileComport{

	
	public PersonMovement(Mobile mobile) {
		super(mobile);
		
	}

	public void moveLeft() {
		// TODO Auto-generated method stub
		System.out.println("Je suis une personne");
		this.coordonn�esX(-1);
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		this.coordonn�esX(1);
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.coordonn�esY(1);
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.coordonn�esY(-1);
	}

}
