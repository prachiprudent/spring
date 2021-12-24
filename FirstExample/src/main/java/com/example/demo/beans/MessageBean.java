package com.example.demo.beans;

//POJO class
public class MessageBean {
	
	private String message, sender;
	
	//MessageBean HAS-A reference of ContactDetails
	//MessageBean HAS-A dependency on ContactDetails
	private ContactDetails receiverInfo;
	
	
	public MessageBean(String message, String sender, ContactDetails receiverInfo) {
		super();
		System.out.println("messagebean parameterized constructor called");
		this.message = message;
		this.sender = sender;
		this.receiverInfo = receiverInfo;
	}

	public MessageBean() {
		System.out.println("MessageBean default constructor called");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("message propery setter called");
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		System.out.println("sender property setter called");
		this.sender = sender;
	}

	public void setReceiverInfo(ContactDetails receiverInfo) {
		System.out.println("receiverinfo setter");
		this.receiverInfo = receiverInfo;
	}
	
	public ContactDetails getReceiverInfo() {
		return receiverInfo;
	}
	
	@Override
	public String toString() {
		return "MessageBean [message=" + message + ", sender=" + sender + "]";
	}
	
	
}
