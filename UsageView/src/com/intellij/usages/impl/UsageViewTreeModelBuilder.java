package com.intellij.usages.impl;

import com.intellij.usages.UsageTarget;
import com.intellij.usages.UsageViewPresentation;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class UsageViewTreeModelBuilder extends DefaultTreeModel {
  private final RootGroupNode myRootNode;
  private final DefaultMutableTreeNode myTargetsNode;

  private UsageTarget[] myTargets;
  private UsageTargetNode[] myTargetNodes;

  public UsageViewTreeModelBuilder(UsageViewPresentation presentation, UsageTarget[] targets) {
    super(new DefaultMutableTreeNode("temp root"));
    myRootNode = new RootGroupNode();
    setRoot(myRootNode);

    myTargets = targets;
    myTargetsNode = new DefaultMutableTreeNode(presentation.getTargetsNodeText());

    addTargetNodes();
  }

  private void addTargetNodes() {
    if (myTargets.length == 0) return;
    myTargetNodes = new UsageTargetNode[myTargets.length];
    for (int i = 0; i < myTargets.length; i++) {
      UsageTarget target = myTargets[i];
      UsageTargetNode targetNode = new UsageTargetNode(target, this);
      myTargetsNode.add(targetNode);
      myTargetNodes[i] = targetNode;
    }
    myRootNode.addNode(myTargetsNode);
  }

  public UsageNode getFirstUsageNode() {
    return (UsageNode)getFirstChildOfType(myRootNode, UsageNode.class);
  }

  private static TreeNode getFirstChildOfType(TreeNode parent, final Class type) {
    final int childCount = parent.getChildCount();
    for (int idx = 0; idx < childCount; idx++) {
      final TreeNode child = parent.getChildAt(idx);
      if (type.isAssignableFrom(child.getClass())) {
        return child;
      }
      final TreeNode firstChildOfType = getFirstChildOfType(child, type);
      if (firstChildOfType != null) {
        return firstChildOfType;
      }
    }
    return null;
  }

  public boolean areTargetsValid() {
    if (myTargets.length == 0) return true;
    for (int i = 0; i < myTargetNodes.length; i++) {
      if (!myTargetNodes[i].isValid()) return false;
    }
    return true;
  }

  public void reset() {
    myRootNode.removeAllChildren();
    if (myTargets.length > 0) {
      myRootNode.add(myTargetsNode);
    }
  }

  private class RootGroupNode extends GroupNode {
    public RootGroupNode() {
      super(null, 0, UsageViewTreeModelBuilder.this);
    }

    public void addNode(DefaultMutableTreeNode node) {
      myTreeModel.insertNodeInto(node, this, getNodeInsertionIndex(node));
    }
  }
}
