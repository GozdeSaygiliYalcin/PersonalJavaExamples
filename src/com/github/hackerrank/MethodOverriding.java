package com.github.hackerrank;

public class MethodOverriding {
	
	static class Sports {
	    String getName(){
	        return "Generic Sports";
	    }
	    void getNumberOfTeamMembers(){
	        System.out.println( "Each team has n players in " + getName() );
	    }
	}
	
	static class Soccer extends Sports {
	    @Override
	    String getName(){
	        return "Soccer Class";
	    }
	    @Override
	    void getNumberOfTeamMembers(){
	        System.out.println( "Each team has 11 players in " + getName() );
	    }
	    
	}

	public static void main(String[] args) {
		
		Sports sport = new Sports();
		System.out.println(sport.getName());
		sport.getNumberOfTeamMembers();
		
		Soccer soccer = new Soccer();
		System.out.println(soccer.getName());
		soccer.getNumberOfTeamMembers();
		

	}

	

}
