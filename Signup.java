package com.examly;

import java.util.Scanner;

public class Signup {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter your email");
        String email=sc.nextLine();
        System.out.println("enter your mobile");
        String mobile=sc.nextLine();
        System.out.println("enter your username");
        String username=sc.nextLine();
        System.out.println("enter your password");
        String password=sc.nextLine();
        System.out.println("enter your confirmpassword");
        String conpass=sc.nextLine();
        boolean isValid=true;
        if(name.isEmpty()||email.isEmpty()||mobile.isEmpty()||password.isEmpty())
        {

            System.out.println("All fileds are filled mandatory");
            isValid=true;
        }
        if(username.length()<4){
            System.out.println("username must contain at least 4 characters");
            isValid=true;
        }
        if(password.length()<4){
            System.out.println("password must contain at least 4 characters");
                     isValid=true;


        }
        if(!password.equals(conpass)){
            System.out.println("password and confirm password must match");
                     isValid=true;
        }
        if(isValid){
            System.out.println("Reg success");
             System.out.println("welcome "+username+"!");
             System.out.println("your account has been created");
              System.out.println("please login to continue");
        
        }
        //login
        String loginuser=sc.nextLine();
         String loginpass=sc.nextLine();
         if(loginuser.equals(username)&&loginpass.equals(password)){
            System.out.println("welcome back,"+username+"!");
            boolean login=true;
            while(login){
                System.out.println("===============\r\n"+//
                "homepage\r\n"+//
                "======================\r\n"+//
                "\r\n"+//
                "1.view profile\r\n"+//
                "2.about application\r\n"+//
                "3.contact us\r\n"+//
                "4.logout\r\n"+//
                "");
                int choice=sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("-----------user profile----------");
                        System.out.println("name:"+name);
                        System.out.println("email:"+email);
                        System.out.println("mobile:"+mobile);
                        System.out.println("user name:"+username);
                        break;
                    case 2:
                        System.out.println("this is java based user authentication system.\r\n"+//
                        "users can register and securly access their accounts.\r\n"+//
                        "");
                        break;
                        case 3:
                            System.out.println("contact us!");
                            System.out.println("Email:"+email);
                            System.out.println("mobile:"+mobile);

                }
            }
         }else{
            System.out.println("login failed!\r\n"//
            "Invalid username or password.\r\n"+//
            "please try again.\r\n");
         }



    }
    
}
