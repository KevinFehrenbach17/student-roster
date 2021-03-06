/*
 * Just a Plain Old Java Object (POJO)
 * 
 * This acts the same way as the POJOs we're used to.
 * It just acts as a template for your data.
 * 
 */
package org.wecancodeit.studentroster.model;

public class Student {
	
	private Long id;
	private String name;
	private String githubUsername;
	private String favoriteFood;

	public Student(Long id, String name, String githubUsername, String favoriteFood) {
		this.id = id;
		this.name = name;
		this.githubUsername = githubUsername;
		this.favoriteFood = favoriteFood;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGithubUsername() {
		return githubUsername;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

}
