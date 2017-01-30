package com.jcs.sbs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gson.Gson;

/**
 * Result class for describe snapshots operation.
 */
public class DescribeSnapshotsResult extends JCSResult implements Serializable, Cloneable {

    private static final long serialVersionUID = 1559504024117330599L;

    private List<Snapshot> snapshots = new ArrayList<Snapshot>();

    /**
     * Default constructor for DescribeSnapshotsResult object.
     */
    public DescribeSnapshotsResult() {
    }

    /**
     * Returns the list of snapshots returned by describe snapshots API.
     * 
     * @return The list of Snapshot objects, which is generated by unmarshalling
     *         the response xml returned by describe snapshots API.
     */
    public List<Snapshot> getSnapshots() {
        return snapshots;
    }

    /**
     * Used internally to set the collection of snapshots, passed as an argument
     * in DescribeSnapshotsResult object.
     * 
     * @param snapshots
     *            Collection of snapshot objects that are set in
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
     * Sets the Snapshot objects, passed as varargs, in the
     * DescribeSnapshotsResult object and returns the modified
     * DescribeSnapshotsResult object.
     * 
     * @param snapshots
     *            List of Snapshot objects as varargs (variable number of
     *            arguments) that are set.
     * @return Modified DescribeSnapshotsResult object
     */
    public DescribeSnapshotsResult withSnapshots(Snapshot... snapshots) {
        for (Snapshot ele : snapshots) {
            this.snapshots.add(ele);
        }
        return this;
    }

    /**
     * Sets the Snapshot objects, passed as collection of Snapshot objects, in
     * the DescribeSnapshotsResult object and returns the modified
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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((snapshots == null) ? 0 : snapshots.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        DescribeSnapshotsResult other = (DescribeSnapshotsResult) obj;
        if (snapshots == null) {
            if (other.snapshots != null)
                return false;
        } else if (!snapshots.equals(other.snapshots))
            return false;
        return true;
    }

    /**
     * Creates and returns a copy of this object.
     * 
     * @see java.lang.Object#clone()
     */
    @Override
    public DescribeSnapshotsResult clone() {
        try {
            return (DescribeSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
        }
    }
}