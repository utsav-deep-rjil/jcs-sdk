package com.jcs.sbs.model;
import java.io.Serializable;

public class DeleteVolumeRequest extends JCSRequest implements
        Serializable, Cloneable{

	private static final long serialVersionUID = 8724912824318843928L;
	
	private String volumeId;

    public DeleteVolumeRequest() {
    }

    /**
     * @param volumeId
     */
    public DeleteVolumeRequest(String volumeId) {
        setVolumeId(volumeId);
    }

    /**
     * @param volumeId
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * @return
     */
    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * @param volumeId
     * @return
     */
    public DeleteVolumeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVolumeRequest == false)
            return false;
        DeleteVolumeRequest other = (DeleteVolumeRequest) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null
                && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }
}