/**
 * Traq desktop application.
 *
 * @author Jack Polgar <jack@polgar.id.au>
 * @license Apache-2.0
 */

package traq.models;

/**
 * User model.
 */
public class User {
    protected int id;
    protected String name;
    protected String username;
    protected String apiKey;

    /**
     * New user constructor with ID, name, username and API key.
     *
     * @param id       users ID
     * @param name     users name
     * @param username users username
     * @param apiKey   users API key
     */
    public User(int id, String name, String username, String apiKey) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.apiKey = apiKey;
    }

    /**
     * Fetch a user by their API key.
     *
     * @param apiKey users API key
     *
     * @return User
     */
//    public static User fetchByAPIKey(String apiKey) {
//
//    }

    /**
     * Get the users ID.
     *
     * @return users ID
     */
    public int getId() {
        return this.id;
    }

    /**
     * Get the users name.
     *
     * @return users name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the users username.
     *
     * @return users username.
     */
    public String getUsername() {
        return username;
    }
}
