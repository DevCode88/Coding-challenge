import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Shorting_URL_Demo {
    public static void main(String[] args) {
        String longUrl = "https://codesubmit.io/library/react";
        String accessToken = " http://short.est/GeAi9K";

        String shortUrl = shortenUrl(longUrl, accessToken);
        System.out.println("Shortened URL: " + shortUrl);
    }

    public static String shortenUrl(String longUrl, String accessToken) {
        try {
            URL url = new URL("https://api-ssl.bitly.com/v4/shorten");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + accessToken);
            connection.setDoOutput(true);

            String jsonInputString = "{\"long_url\": \"" + longUrl + "\"}";

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }

                return response.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
