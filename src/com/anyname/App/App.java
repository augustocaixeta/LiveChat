package com.anyname.App;

import com.anyname.Message.Message;
import com.anyname.User.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        User u = new User(
                1,
                "AUGUSTO",
                "1234",
                "000-000",
                "example@email.com",
                LocalDate.of(2003, 8, 10));

        Message m = new Message(
                1,
                "Hello",
                u,
                LocalDateTime.of(2025, 4, 16, 10, 45, 0));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(m.getContent() + "\n"
                + m.getSender().getName() + "\n"
                + m.getSentAt().format(formatter));
    }
}
