import org.apache.http.HttpStatus;

import static spark.Spark.*;

public class BowlingServer {
    public static void main(String[] args) {
        post("/addFrame", (request, response) -> "Hello World");

        delete("/resetGame", (request, response) ->{
            return HttpStatus.SC_OK;
//            if (shouldReturnHtml(request)) {
//                response.status(200);
//                response.type("text/html");
//                return "";
//            } else {
//                response.status(200);
//                response.type("application/json");
//                return "error";
//            }
        });
    }
}
