class Hotel extends Room implements IRoom {
	public void roomDetails(Room r) {
		System.out.println("Room Details are.....");
		System.out.println("Room No: " + r.getRoomNo());
		System.out.println("Room Capacity: " + r.getCapacity());
		System.out.println("Room Cost: " + r.getCost());
		System.out.println("Room Occupied: " + r.getTicket());
	}
}
