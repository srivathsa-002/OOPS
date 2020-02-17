public class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room1 = new Room();
		room1.setRoomNo(101);
		room1.setCapacity(4);
		room1.setCost(5000.0);
		//room1.setTicket();
		Room room2 = new Room();
		room2.setRoomNo(102);
		room2.setCapacity(4);
		room2.setCost(4000.0);
		room2.setTicket();
		Room room3 = new Room();
		room3.setRoomNo(103);
		room3.setCapacity(2);
		room3.setCost(2500.0);
		//room3.setTicket();
		Hotel hotel = new Hotel();
		hotel.roomDetails(room1);
		hotel.roomDetails(room2);
		hotel.roomDetails(room3);
	}
}