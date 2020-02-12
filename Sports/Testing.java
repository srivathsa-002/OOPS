abstract class Sports{
	public int numberOfPlayers;
    String getName(){
        return "Generic Sports";
    }
    abstract void getNumberOfTeamMembers();
}

class Soccer extends Sports{
	Soccer(int numberOfPlayers){
		this.numberOfPlayers = numberOfPlayers;
	}
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println("Each team has " + numberOfPlayers + " players in Soccer");
    }
}
class Cricket extends Sports{
	Cricket(int numberOfPlayers){
		this.numberOfPlayers = numberOfPlayers;
	}
	@Override
    String getName(){
        return "Cricket Class";
    }
	@Override
    void getNumberOfTeamMembers(){
        System.out.println("Each team has " + numberOfPlayers + " players in Cricket");
    }
}
class BasketBall extends Sports{
	BasketBall(int numberOfPlayers){
		this.numberOfPlayers = numberOfPlayers;
	}
	@Override
    String getName(){
        return "BasketBall Class";
    }
	@Override
    void getNumberOfTeamMembers(){
        System.out.println("Each team has " + numberOfPlayers + " players in BasketBall");
    }
}

public class Testing{
    public static void main(String []args){
        Soccer sport1 = new Soccer(11);
        Cricket sport2 = new Cricket(11);
        BasketBall sport3 = new BasketBall(5);
        System.out.println(sport1.getName());
        sport1.getNumberOfTeamMembers();
        System.out.println(sport2.getName());
        sport2.getNumberOfTeamMembers();
        System.out.println(sport3.getName());
        sport3.getNumberOfTeamMembers();
	}
}
