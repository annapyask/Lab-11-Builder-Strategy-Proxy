package ucu.edu.ua;

import ucu.edu.ua.task2.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Client client1 = Client.builder()
                .name("Ann")
                .age(18)
                .email("ann@example.com")
                .build();


        MailCode birthdayMailCode = new BirthdayMailCode();
        
        MailCode specialOfferMailCode = client -> String.format("Hello %s! Don't miss our exclusive offer!", client.getName());

        MailInfo birthdayInfo1 = new MailInfo(client1, birthdayMailCode);
        MailInfo offerInfo1 = new MailInfo(client1, specialOfferMailCode);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayInfo1);
        mailBox.addMailInfo(offerInfo1);

        mailBox.sendAll();

        System.out.println(client1);
    }
}
