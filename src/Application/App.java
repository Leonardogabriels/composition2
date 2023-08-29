package Application;

import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String title = "Traveling to New Zealand";
        String contents = "I'm going to visit this wonderful country!";
        Integer likes = 12;
        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"),title,contents, likes);

        Comment c1 = new Comment("have a nice trip!");
        Comment c2 = new Comment("wecome to Brazilian ! ");
        post1.addComentt(c1);
        post1.addComentt(c2);

        System.out.println(post1.toString());
        
        
        
        


        
        
    }
}
