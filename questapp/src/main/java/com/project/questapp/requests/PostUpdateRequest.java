package com.project.questapp.requests;

import lombok.Data;

@Data
public class PostUpdateRequest {
	String title;
	String text;
	Long id;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Long getId() {
    	return id;
    }
    
    public void setId(Long id) {
    	this.id=id;
    }
 
  
}
