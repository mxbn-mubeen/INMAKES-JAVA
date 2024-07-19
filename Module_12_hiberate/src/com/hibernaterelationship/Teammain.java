package com.hibernaterelationship;

import com.model.Captain;
import com.model.Team;

public class Teammain {

	public static void main(String[] args) {
		
		Team team=new Team();
		team.setTeamlogo("csk");
		team.setTeamsize(11);
		team.setTeamtype("cricket");
		
		Captain captain=new Captain();
		captain.setCaptname("dhoni");
		captain.setCaptage(43);
		captain.setCaptplace("hariyana");
		
		team.setCaptain(captain);
		captain.setTeam(team);
		
		TeamDAO teamdao=new TeamDAO();
		teamdao.save(team);
		

	}

}
