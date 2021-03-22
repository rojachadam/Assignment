package com.assignment.program1;

import java.util.*;
public class ApplicationFactory {	
	public String fetchApplication(int a){
		String[] app= {"WhatsApp","FaceBook","Teligram","Twitter"};
		return app[a];
}
public void applicationDetails(String ans) {
	String[][]app1= {
			{"WhatsApp","Message your friends and family for free*. WhatsApp uses your phone's Internet connection to send messages so you can avoid SMS fees."},
			{"FaceBook","Facebook builds technologies that give people the power to connect with friends and family, find communities and grow businesses."},
			{"Teligram","Telegram delivers messages faster than any other application. Powerful. Telegram has no limits on the size of your media and chats."},
			{"Twitter","Twitter is what’s happening and what people are talking about right now."}
	};
	
	for(int i=0;i<4;i++) {
		if(app1[i][0]==ans)
		System.out.println(app1[i][1]);
	}
}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop=1;
		do {
		System.out.println("Select an option:\n1.WhatsApp\n2.FaceBook\n3.Teligram\n4.Github");
		System.out.println("Choose any option to see description about Application OR To exit press 0");
		int opt = sc.nextInt();
		ApplicationFactory af=new ApplicationFactory();
		String ans=af.fetchApplication(opt);
		af.applicationDetails(ans);
		System.out.println("\nSelect an option:\n1.WhatsApp\n2.FaceBook\n3.Teligram\n4.Github");
		System.out.println("Choose any option to see description about Application OR To exit press 0");
		loop = sc.nextInt();
	}while(loop!=0);
		System.out.println("!!END!!");
	}

}
