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
