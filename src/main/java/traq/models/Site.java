/**
 * Traq desktop application.
 *
 * @author Jack Polgar <jack@polgar.id.au>
 * @license Apache-2.0
 */

package traq.models;

import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import traq.API;

/**
 * Site model.
 */
public class Site {
    private static String name;
    private static String url;

    /**
     * @param name site name
     * @param url  site URL
     */
    public Site(String name, String url) {
        this.name = name;
        this.url = url;
    }

    /**
     * @return sites name
     */
    public String getName() {
        return name;
    }

    /**
     * @return sites URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * Fetch a JSON response from the specified path relative to the sites URL.
     *
     * @param path path to fetch
     *
     * @return JsonElement
     */
    public JsonElement fetch(String path) {
        try {
            return API.fetch(this.url + path);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get an array list of projects the site contains.
     *
     * @return array of sites
     */
    public ArrayList<Project> getProjects() {
        ArrayList<Project> projects = new ArrayList<Project>();

        JsonArray jsonProjects = fetch("/projects.json").getAsJsonArray();

        for (JsonElement o: jsonProjects) {
            JsonObject obj = o.getAsJsonObject();
            Project project = new Project(obj.get("id").getAsInt(), obj.get("name").getAsString(), obj.get("slug").getAsString(), obj.get("info").getAsString());
            projects.add(project);
        }

        return projects;
    }

}
