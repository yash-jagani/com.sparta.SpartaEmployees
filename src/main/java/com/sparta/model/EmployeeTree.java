package com.sparta.model;

public class EmployeeTree {

    // Binary tree node
    static class Node
    {
        Employee data;
        Node left, right;
        Node(Employee data)
        {
            this.data = data;
            left = right = null;
        }
    };

    // Function to traverse the tree in preorder
// and check if the given node exists in it
//    static boolean searchEmployeeLastName( Node node, String lastName){
//        if (node == null)
//            return false;

//        if (node.data.getLastName() == lastName)
//            return true;

        // then recur on left subtree /
//        boolean res1 = ifNodeExists(node.left, lastName);

        // node found, no need to look further
//        if(res1) return true;

        // node is not found in left,
        // so recur on right subtree /
//        boolean res2 = ifNodeExists(node.right, lastName);

//        return res2;
//    }


}
