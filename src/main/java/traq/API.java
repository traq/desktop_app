/**
 * Traq desktop application.
 *
 * @author Jack Polgar <jack@polgar.id.au>
 * @license Apache-2.0
 */

package traq;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * API class.
 */
public class API {
    /**
     * Fetch a JSON response from the URL.
     *
     * @param siteUrl URL to fetch from
     *
     * @return JsonElement
     *
     * @throws IOException
     */
    public static JsonElement fetch(String siteUrl) throws IOException {
        URL url = new URL(siteUrl);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.addRequestProperty("User-Agent", "Mozilla/4.0 TraqDesktop/1.0");
        httpURLConnection.connect();

        JsonParser jsonParser = new JsonParser();
        JsonElement root = jsonParser.parse(new InputStreamReader((InputStream)httpURLConnection.getContent()));

        return root;
    }
}
