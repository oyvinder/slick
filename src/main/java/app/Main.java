package app;

import static spark.Spark.*;

public class Main {
        public static void main(String[] args) {
            get("/app", (req, res) -> "Hello World");
    }
}
