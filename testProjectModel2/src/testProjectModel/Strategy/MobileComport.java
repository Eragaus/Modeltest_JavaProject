package testProjectModel.Strategy;

import testProjectModel.Mobile.Mobile;

public abstract class MobileComport implements IMovement{
	
	private Mobile mobile;
	public MobileComport(Mobile mobile)
	{
		this.mobile=mobile;
	}
	
	@Override
	public void moveLeft() {
	}
	
	@Override
	public void moveRight() {
	}
	
	@Override
	public void moveUp() {
	}
	
	@Override
	public abstract void moveDown();
	
	public void coordonn�esX(int i)
	{

		this.mobile.setX(this.mobile.getX()+(1*i));
		
	}
	
	public void coordonn�esY(int i)
	{
		this.mobile.setY(this.mobile.getY()+(1*i));
	}
	
}
