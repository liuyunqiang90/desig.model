package designModel.builder.model;

public class GongyuBuilder implements HouseBuilder{

	private House house = new House();
	@Override
	public void makeFloor() {
		house.setFloor("公寓 地板。。。");
		
	}

	@Override
	public void makeWall() {
		house.setWall("公寓墙。。。");
	}

	@Override
	public void makeHouseTop() {
		house.setHouseTop("公寓房顶。。。");
	}

}
