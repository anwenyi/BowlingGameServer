import static spark.Spark.*;

public class BowlingServer {
    public static void main(String[] args) {
        get("/hello", (request, response) -> "Hello World");
    }
}
