/**
 * Traq desktop application.
 *
 * @author Jack Polgar <jack@polgar.id.au>
 * @license Apache-2.0
 */

import javax.swing.*;

import java.util.ArrayList;

import traq.models.Project;
import traq.models.Site;

/**
 * Main application.
 */
public class Traq {
    /**
     * Set to create main window.
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame mainWindow = new JFrame("Traq");
                mainWindow.setSize(600,500);
                mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Site currentSite = new Site("Traq", "https://bugs.traq.io");

                ArrayList<Project> projects = currentSite.getProjects();
                Project testProject = projects.get(0);

                JPanel testPanel = new JPanel();
                JLabel projectName = new JLabel(testProject.getName());
                JLabel projectSlug = new JLabel(testProject.getSlug());
                JLabel projectDescription = new JLabel(testProject.getDescription());

                testPanel.add(projectName);
                testPanel.add(projectSlug);
                testPanel.add(projectDescription);

                mainWindow.add(testPanel);

                mainWindow.setVisible(true);
            }
        });
    }
}
