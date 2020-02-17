public class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Batsman();
		player.setJerseyNo(18);
		player.setName("Virat Kohli");
		player.playerDetails();
		player.role();
		Player player1 = new Bowler();
		player1.setJerseyNo(93);
		player1.setName("Jasprit Bumrah");
		player1.playerDetails();
		player1.role();
		Player player2 = new AllRounder();
		player2.setJerseyNo(228);
		player2.setName("Hardik Pandya");
		player2.playerDetails();
		player2.role();
	}
}