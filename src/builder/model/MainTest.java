package builder.model;

public class MainTest {

	public static void main(String[] args) {
		//自己创建房子
		House house = new House();
		house.setFloor("建造地板");
		house.setHouseTop("建造屋顶");
		house.setWall("建造墙");
		
		//委托给开发商
		PingfangBuilder pingfangBuilder = new PingfangBuilder();
		pingfangBuilder.makeFloor();
		pingfangBuilder.makeHouseTop();
		pingfangBuilder.makeWall();
		
		//委托给设计师
		HouseDirector director = new HouseDirector(pingfangBuilder);
		director.makeHouse();
		
	}
}
