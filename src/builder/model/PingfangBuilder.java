package builder.model;

public class PingfangBuilder implements HouseBuilder {

	private House house = new House();

//	public PingfangBuilder(House house) {
//		this.house = house;
//	}

	@Override
	public void makeFloor() {
		house.setFloor("平房地板。。。");
	}

	@Override
	public void makeWall() {
		house.setWall("平房墙壁。。。");
	}

	@Override
	public void makeHouseTop() {
		house.setHouseTop("平房屋顶。。。");
	}
	
	public House getHouse(){
		
		return house;
		
	}

}
