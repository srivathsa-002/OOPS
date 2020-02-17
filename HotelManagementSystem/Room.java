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
