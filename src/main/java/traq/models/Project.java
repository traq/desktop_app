/**
 * Traq desktop application.
 *
 * @author Jack Polgar <jack@polgar.id.au>
 * @license Apache-2.0
 */

package traq.models;

/**
 * Project model.
 */
public class Project {
    protected int id;
    protected String name;
    protected String slug;
    protected String description;

    /**
     * New project constructor with ID, name, slug and description.
     *
     * @param id          project ID
     * @param name        project name
     * @param slug        project slug
     * @param description project description
     */
    public Project(int id, String name, String slug, String description) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.description = description;
    }

    /**
     * Get the projects ID.
     *
     * @return projects ID
     */
    public int getId() {
        return this.id;
    }

    /**
     * Get the projects name.
     *
     * @return projects name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the projects slug.
     *
     * @return projects slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Get the projects description.
     *
     * @return projects description
     */
    public String getDescription() {
        return description;
    }
}
