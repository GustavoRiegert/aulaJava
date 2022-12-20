package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        Post post1 = InstancePost("21/06/2018 13:05:44", "Traveling to New Zealand",
                "I'm going to visit this wonderful country", 12);

        Post post2 = InstancePost("28/08/2018 23:14:19", "Good night guys", "See you tomorrow",
                5);

        post1.addComment(new Comment("Have a nice trip!"));
        post1.addComment(new Comment("Wow that's awesome!"));

        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));

        System.out.println(post1);
        System.out.println(post2);

    }

    private static Post InstancePost(String moment, String title, String content, Integer likes) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return new Post(sdf.parse(moment), title, content, likes);
    }
}