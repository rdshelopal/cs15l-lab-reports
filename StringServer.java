import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String add = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message"))
        {
            String[] parameters = url.getQuery().split("="); 
            if(parameters[0].equals("s"))
            {
                add += parameters[1] + "\n";
                return add;
            }
        }
        return "404 not found!";
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
