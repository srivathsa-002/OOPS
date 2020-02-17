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
