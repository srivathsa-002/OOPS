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
