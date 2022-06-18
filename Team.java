public class Team {
    Member member;
    public Team (Member member){
        this.member = member;
    }
    //Main Method
    public static void main(String[] args){
        Member myMember = new Member("Auriel", "Light", 10, 1);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());
    }
}

class Member {
    private String name;
    private String type;
    private int level;
    private int rank;

    public Member(String name,String type,int level,int rank){
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    //Define Getter Functions
    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getLevel(){
        return this.level;
    }

    public int getRank(){
        return this.rank;
    }
}