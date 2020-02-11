import java.util.ArrayList;

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

class Room {
	private int capacity;
	private double cost;
	private boolean ticket;
	private int roomNo;
	Room(){
		ticket = false;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getCapacity() {
		return capacity;
	}
	public double getCost() {
		return cost;
	}
	public void setTicket() {
		ticket = true;
	}
	public boolean getTicket() {
		return ticket;
	}
}
interface IRoom{
	public void roomDetails(Room r);
}
class Hotel extends Room implements IRoom {
	public void roomDetails(Room r) {
		System.out.println("Room Details are.....");
		System.out.println("Room No: " + r.getRoomNo());
		System.out.println("Room Capacity: " + r.getCapacity());
		System.out.println("Room Cost: " + r.getCost());
		System.out.println("Room Occupied: " + r.getTicket());
	}
}
