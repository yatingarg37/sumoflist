package assignments;

import java.util.Scanner;

public class Sumoflist {
	Node head;
	public static class Node {
		int data;
		Node next;
		Node(int d) {
			data=d;
			next=null;
		}
	}
	public static Sumoflist insert(Sumoflist li,int d) {
		Node newNode=new Node(d);
		if(li.head==null) {
			li.head=newNode;
		}
		else {
			Node temp=li.head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		return li;
	}
	public static Sumoflist checksum(Sumoflist li,Sumoflist li2) {
		int c=0;
		int c1=0;
		int sum1=0;
		int sum2=0;
		Node temp=li.head;
		Node temp2=li2.head;
		while(temp!=null) {
			sum1=(int)(sum1+temp.data*Math.pow(10, c));
			c++;
			temp=temp.next;
		}
		while(temp2!=null) {
			sum2=(int)(sum2+temp.data*Math.pow(10, c1));
			c1++;
			temp2=temp2.next;

		}
		int sum3=sum1+sum2;
		Sumoflist li3=new Sumoflist();
		while(sum3!=0) {
			li3.insert(li3, sum3%10);
			sum3=sum3/10;
		}
		return li3;
	}
	public static void main(String arg[]) {
		Scanner sc= new Scanner(System.in);
		Sumoflist li1=new Sumoflist();
		Sumoflist li2=new Sumoflist();
		Sumoflist li3=new Sumoflist();
		System.out.println("Enter the sizeof first list");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int d=sc.nextInt();
			insert(li1,d);
		}
		System.out.println("Enter the size of 2nd List");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++) {
			int d1=sc.nextInt();
			insert(li2,d1);
		}
		li3=checksum(li1,li2);
	}
}
