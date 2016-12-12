package com.csdcc.model;

public class MeetingRoom {
	
	public MeetingRoom(){
		
	}
	
	public MeetingRoom(int id,String name,String location,
			String type,int capacity,String description,int status ){
		setId(id);
		setName(name);
		setCapacity(capacity);
		setDescription(description);
		setLocation(location);
		setStatus(status);
		setType(type);
	}
	
	public MeetingRoom(MeetingRoom room){
		setId(room.getId());
		setCapacity(room.getCapacity());
		setDescription(room.getDescription());
		setLocation(room.getLocation());
		setName(room.getName());
		setStatus(room.getStatus());
		setType(room.getType());
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}


	private int id = 0;
	private String name = "";
	private String location ="";
	private String type = "";
	private int capacity = 0;
	private String description = "";
	private int status = 0;
	

}
