package com.SPABackend.dto;

import com.SPABackend.entity.Post;

public class PostDTO {

	private String body;
	
	private String title;

	public PostDTO(String body, String title) {
		this.body = body;
		this.title = title;
	}

	public PostDTO(Post post) {
		
		body = post.getBody();
		title = post.getTitle();
				
		
	}
	
	
	public PostDTO() {

	}
	
	
	
}
