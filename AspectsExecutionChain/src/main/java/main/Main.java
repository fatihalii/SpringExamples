package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var result = context.getBean(CommentService.class);

        var  comment = new Comment();
        comment.setText("Some text");
        comment.setAuhor("Romanoff");

        String value = result.publishComment(comment);

        logger.info(value);

    }
}
