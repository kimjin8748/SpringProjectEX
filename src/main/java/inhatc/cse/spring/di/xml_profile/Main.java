package inhatc.cse.spring.di.xml_profile;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String config = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("dev or run : ");
        String str = sc.next();

        if(str.equals("dev")){
            config = "dev";
        } else if(str.equals("run")){
            config = "run";
        }
        sc.close();

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles(config); //프로파일 설정
        ctx.load("xml_profile/profile_dev.xml", "xml_profile/profile_run.xml");
        ctx.refresh();

        ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
        System.out.println("ip : " + serverInfo.getIpNum());
        System.out.println("port : " + serverInfo.getPortNum());
        ctx.close();
    }
}
