/**
 * Traq desktop application.
 *
 * @author Jack Polgar <jack@polgar.id.au>
 * @license Apache-2.0
 */

import javax.swing.*;
import traq.models.Project;

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

                Project testProject = new Project(0, "Test", "testing", "Just a test");

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
