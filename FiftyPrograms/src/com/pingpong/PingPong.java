//a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5, 
//and "ping pong" if number is divisible by both, else print the number.



package com.pingpong;

public class PingPong {
	public static void main(String[] args) {
		int num=25;
		if (num % 3 == 0 && num % 5 == 0){
		System.out.println("pingpong");
		}
		else if (num % 3 == 0){
		System.out.println("ping");
		}
		else if (num % 5 == 0){
		System.out.println("pong");
		}
		
		else
		System.out.println(num);
	}

}