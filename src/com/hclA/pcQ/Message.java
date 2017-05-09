package com.hclA.pcQ;

public class Message {
    private int number;
    private boolean isPrime;
    
    public Message(int number, boolean isPrime){
        this.number = number;
        this.isPrime = isPrime;
    }

    public String toString() {
    	return "number:" + number + " isPrime:" + isPrime;
    }
    public Message getMsg() {
        return this;
    }

}
