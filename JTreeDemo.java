import javax.swing.*;
import javax.swing.tree.*;

public class JTreeDemo {
    public static void main(String[] args) {
        // Create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create child nodes
        DefaultMutableTreeNode fruits = new DefaultMutableTreeNode("Fruits");
        DefaultMutableTreeNode vegetables = new DefaultMutableTreeNode("Vegetables");

        // Add child nodes to the root node
        root.add(fruits);
        root.add(vegetables);

        // Add fruits to the Fruits node
        fruits.add(new DefaultMutableTreeNode("Apple"));
        fruits.add(new DefaultMutableTreeNode("Banana"));
        fruits.add(new DefaultMutableTreeNode("Orange"));

        // Add vegetables to the Vegetables node
        vegetables.add(new DefaultMutableTreeNode("Carrot"));
        vegetables.add(new DefaultMutableTreeNode("Tomato"));
        vegetables.add(new DefaultMutableTreeNode("Potato"));

        // Create the JTree with the root node
        JTree tree = new JTree(root);

        // Create a scroll pane and add the tree to it
        JScrollPane scrollPane = new JScrollPane(tree);

        // Create a JFrame to display the tree
        JFrame frame = new JFrame("JTree Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}