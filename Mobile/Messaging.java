class Messaging extends MobileMessage {
	private String message;
	Messaging(String message) {
		this.message = message;
	}
	@Override
	public void sendMessage() {
		Calling calling = new Calling("1234567890");
		System.out.println("Sending message to " + calling.getNumber() + ": " + message);
	}
}