package com.anyname.App;

import com.anyname.Chat.Chat;
import com.anyname.Message.Message;
import com.anyname.User.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        User u1 = new User(
                1,
                "AUGUSTO",
                "123",
                "123-321",
                "augusto@email.com",
                LocalDate.of(2003, 8, 10));

        User u2 = new User(
                2,
                "BRUNO",
                "321",
                "321-123",
                "bruno@email.com",
                LocalDate.of(2004, 5, 1));

        Message m1 = new Message(
                1,
                "Salve (Para: BRUNO)",
                u1,
                LocalDateTime.of(2025, 4, 16, 10, 45, 0));

        Message m2 = new Message(
                2,
                "Salve (Para: AUGUSTO)",
                u2,
                LocalDateTime.of(2025, 4, 16, 11, 0, 0));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(m1.getContent() + "\n"
                + m1.getSender().getName() + "\n"
                + m1.getSentAt().format(formatter));

        Chat c = new Chat(
                1,
                "Any chat name",
                "private");

        c.addUser(u1);
        c.addUser(u2);

        c.addMessage(m1);
        c.addMessage(m2);

        System.out.println("\n-> Chat Users:");
        c.getUsers().forEach(u -> System.out.println(u.getName()));

        System.out.println("\n-> Chat Contents:");
        c.getMessages().forEach(m -> System.out.println(m.getContent()));
    }
}
