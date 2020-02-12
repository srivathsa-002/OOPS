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

abstract class Player {
	public String name;
	public int jerseyNo;
	public void setName(String name) {
		this.name = name;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public void playerDetails() {
		System.out.println("Name: " + name + "\nJersey No: " + jerseyNo);
	}
	public abstract void role();
}
interface IBowler {
	public String bowlerRole = "I am a Bowler";
}
interface IBatsman {
	public String batsmanRole = "I am a Batsman";
}
interface IAllRounder extends IBowler,IBatsman {
	
}

class Batsman extends Player implements IBatsman {
	public String getName() {
		return name;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void role() {
		System.out.println("I am a Batsman");
	}
}

class Bowler extends Player implements IBowler {
	
	public String getName() {
		return name;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void role() {
		System.out.println("I am a Bowler");
	}
}

class AllRounder extends Player implements IAllRounder {
	public String getName() {
		return name;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void role() {
		System.out.println(batsmanRole);
		System.out.println(bowlerRole);
	}
}
