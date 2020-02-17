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