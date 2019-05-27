package testProjectModel.Strategy;

import testProjectModel.Mobile.Mobile;

public class EntityMovement extends MobileComport{

	public EntityMovement(Mobile mobile) {
		super(mobile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moveLeft() {
		System.out.println("Je suis une entité");
		// TODO Auto-generated method stub
		this.coordonnéesX(-1);
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		this.coordonnéesX(1);
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.coordonnéesY(1);
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.coordonnéesY(-1);
	}

}
