package com.jcs.sbs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Result class for describe snapshot operation.
 */
public class DescribeSnapshotsResult extends JCSResult implements Serializable, Cloneable {

    private static final long serialVersionUID = 1559504024117330599L;

    private List<Snapshot> snapshots = new ArrayList<Snapshot>();

    private String nextToken;

    /**
     * Default constructor for DescribeSnapshotsResult object.
     */
    public DescribeSnapshotsResult() {
    }

    /**
     * Returns the list of snapshots returned describe snapshots API.
     * 
     * @return The list of Snapshot objects, which is generated by unmarshalling
     *         the response xml returned by describe snapshots API.
     */
    public List<Snapshot> getSnapshots() {
        return snapshots;
    }

    /**
     * This method is used internally. It sets the collection of snapshots,
     * passed as an argument in DescribeSnapshotsResult object.
     * 
     * @param snapshots
     *            Collection of snapshot objects which is to be set in
     *            DescribeSnapshotsResult object.
     */
    public void setSnapshots(Collection<Snapshot> snapshots) {
        if (snapshots == null) {
            this.snapshots = new ArrayList<Snapshot>();
            return;
        }

        this.snapshots = new ArrayList<Snapshot>(snapshots);
    }

    /**
     * This method sets the Snapshot objects, passed as varargs, in the
     * DescribeSnapshotsResult object and returns the modified
     * DescribeSnapshotsResult object
     * 
     * @param snapshots
     *            List of Snapshot objects as varargs (variable number of
     *            arguments)
     * @return Modified DescribeSnapshotsResult object
     */
    public DescribeSnapshotsResult withSnapshots(Snapshot... snapshots) {
        for (Snapshot ele : snapshots) {
            this.snapshots.add(ele);
        }
        return this;
    }

    /**
     * This method sets the Snapshot objects, passed as collection of Snapshot
     * objects, in the DescribeSnapshotsResult object and returns the modified
     * DescribeSnapshotsResult object
     * 
     * @param snapshots
     *            Collection of Snapshot objects
     * @return Modified DescribeSnapshotsResult object
     */
    public DescribeSnapshotsResult withSnapshots(Collection<Snapshot> snapshots) {
        setSnapshots(snapshots);
        return this;
    }

    /**
     * If the describeSnapshots() method was called with a MaxResults option,
     * all items would not have been returned. To get next set of items in
     * subsequent call, the ID of the last seen item is returned as 'nextToken'.
     * Next time when the describeSnapshots() method is called, this 'nextToken'
     * should be passed to get the next set of items.
     * 
     * This method sets the next token in DescribeSnapshotsResult object.
     * 
     * @param nextToken
     *            The 'nextToken' value that is returned by the describe
     *            snapshots API. This is basically the ID of the last seen item
     *            in response of describeSnapshots()
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Returns nextToken value which is used to get next set of items in subsequent calls of describeSnapshots() method.
     * 
     * @return The ID of the last seen item (nextToken) in response of
     *         describeSnapshots()
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * If the describeSnapshots() method was called with a MaxResults option,
     * all items would not have been returned. To get next set of items in
     * subsequent call, the ID of the last seen item is returned as 'nextToken'.
     * Next time when the describeSnapshots() method is called, this 'nextToken'
     * should be passed to get the next set of items.
     * 
     * This method sets the next token in DescribeSnapshotsResult object and
     * returns the modified DescribeSnapshotsResult object.
     * 
     * @param nextToken
     *            The ID of the last seen item in response of
     *            describeSnapshots()
     * @return Modified DescribeSnapshotsResult object.
     */
    public DescribeSnapshotsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    @Override
    public String toString() {
        return this.getXml();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotsResult == false)
            return false;
        DescribeSnapshotsResult other = (DescribeSnapshotsResult) obj;
        if (other.getSnapshots() == null ^ this.getSnapshots() == null)
            return false;
        if (other.getSnapshots() != null && other.getSnapshots().equals(this.getSnapshots()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshots() == null) ? 0 : getSnapshots().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotsResult clone() {
        try {
            return (DescribeSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}