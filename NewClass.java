package newjava;

// Online Java Compiler
// Use this editor to write, compile and run your Java code onlimport java.io.*;
import java.util.*;
import java.io.*;

class Node {
    String name;
    Node parent;
    List<Node> children = new ArrayList<>();
    Integer lockedBy = null;
    int lockedDescendantCount = 0;

    Node(String name) {
        this.name = name;
    }

    boolean isLocked() {
        return lockedBy != null;
    }
}

public class NewClass {
    static Map<String, Node> nodeMap = new HashMap<>();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim()); // number of nodes
        int m = Integer.parseInt(br.readLine().trim()); // children per node
        int Q = Integer.parseInt(br.readLine().trim()); // number of queries

        List<String> names = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String nodeName = br.readLine().trim();
            names.add(nodeName);
            nodeMap.put(nodeName, new Node(nodeName));
        }

        // Build tree using heap indexing
        for (int i = 0; i < N; i++) {
            Node curr = nodeMap.get(names.get(i));
            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;
            if (leftIndex < N) {
                Node left = nodeMap.get(names.get(leftIndex));
                left.parent = curr;
                curr.children.add(left);
            }
            if (rightIndex < N) {
                Node right = nodeMap.get(names.get(rightIndex));
                right.parent = curr;
                curr.children.add(right);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            String[] parts = br.readLine().split(" ");
            int opType = Integer.parseInt(parts[0]);
            String nodeName = parts[1];
            int uid = Integer.parseInt(parts[2]);
            Node node = nodeMap.get(nodeName);

            
            boolean result = false;
            if (opType == 1) result = lock(node, uid);
            else if (opType == 2) result = unlock(node, uid);
            else if (opType == 3) result = upgradeLock(node, uid);

            sb.append(result ? "true\n" : "false\n");
        }

        System.out.print(sb);
    }

    static boolean lock(Node node, int uid) {
        if (node.isLocked() || node.lockedDescendantCount > 0) return false;

        // Check ancestors
        Node curr = node.parent;
        while (curr != null) {
            if (curr.isLocked()) return false;
            curr = curr.parent;
        }

        node.lockedBy = uid;
        updateAncestors(node, 1);
        return true;
    }

    static boolean unlock(Node node, int uid) {
        if (!node.isLocked() || node.lockedBy != uid) return false;
        node.lockedBy = null;
        updateAncestors(node, -1);
        return true;
    }

    static boolean upgradeLock(Node node, int uid) {
        if (node.isLocked() || node.lockedDescendantCount == 0) return false;

        List<Node> lockedDescendants = new ArrayList<>();
        if (!collectLockedDescendants(node, uid, lockedDescendants)) return false;

        // Unlock all descendants
        for (Node desc : lockedDescendants) {
            desc.lockedBy = null;
            updateAncestors(desc, -1);
        }

        // Lock current node
        node.lockedBy = uid;
        updateAncestors(node, 1);
        return true;
    }

    static boolean collectLockedDescendants(Node node, int uid, List<Node> list) {
        if (node.isLocked()) {
            if (!node.lockedBy.equals(uid)) return false;
            list.add(node);
        }
        for (Node child : node.children) {
            if (!collectLockedDescendants(child, uid, list)) return false;
        }
        return true;
    }

    static void updateAncestors(Node node, int delta) {
        Node curr = node.parent;
        while (curr != null) {
            curr.lockedDescendantCount += delta;
            curr = curr.parent;
        }
    }
}
