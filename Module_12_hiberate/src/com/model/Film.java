package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="film")
public class Film implements Serializable{
	
	@Id
	@Column(name = "filmid")
	@GenericGenerator(name ="ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int flimid;
	
	@Column(name = "film_name")
	private String filmname;
	
	@Column(name = "film_director")
	private String director;
	

	public int getFlimid() {
		return flimid;
	}


	public void setFlimid(int flimid) {
		this.flimid = flimid;
	}


	public String getFilmname() {
		return filmname;
	}


	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public Film() {
		// TODO Auto-generated constructor stub
	}

}
