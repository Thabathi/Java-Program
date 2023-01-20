import java.util.Scanner;

import java.io.*;


public class Asses_1 {

	public static void main(String[] args) {

		{
		int i,j,l,t=0;
		char input[20];
		System.out.println("Enter the input\n");
		 
		for(i=0;i<l;i++)
		{
		    if(input[i]=='(')
		    t++;
		    else if(input[i]==')')
		    t--;
		    else if(input[i]=='*'||input[i]=='/'||input[i]=='+'||input[i]=='-')
		   {
		      if(input[i-1]>96 && input[i-1]<123 && input[i+1]>96 && input[i+1]<123)
		      {
		       }else
		           break;
		       }
		}
		if(i==l && t==0)
			System.out.println("Valid");
		else
		   System.out.println("Invalid ");
		}


	}}
	 