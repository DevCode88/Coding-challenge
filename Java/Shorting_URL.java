import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class Shorting_URL {
    public static void main(String[] args) {
        Random random = new Random();
        String shortUrl = "https://codesubmit.io/library/react";
        String originalUrl = expandShortUrl(shortUrl);
        System.out.println("Original URL: " + originalUrl);
    }
    public static String expandShortUrl(String shortUrl) {
        try {
            URL url = new URL("https://api.1pt.co/api/expand?url=" + shortUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                return response.toString();
            } else {
                System.out.println("Error: Unable to retrieve original URL. Response Code: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}

