package com.jcs.sbs.model;

/**
 * This class is the parent class of all the Result model classes. It contains
 * the common properties present in the responses of all the operations of the
 * SDK.
 *
 */
public class JCSResult {
    private String requestId;
    private String xml;

    /**
     * @return The request ID that is returned by the internal API.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * This method is used internally. It sets the requestId that was returned
     * by the internal API call.
     * 
     * @param requestId
     *            Value of <tt>requestId</tt> that was returned by the internal
     *            API call.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * All the Result classes are made from the corresponding Response classes
     * that are generated by JAXB after unmarshalling the response XML returned
     * by the internal API. This method returns the actual XML response that was
     * returned by the internal API.
     * 
     * @return The actual XML response that was returned by the internal API.
     */
    public String getXml() {
        return this.xml;
    }

    /**
     * All the Result classes are made from the corresponding Response classes
     * that are generated by JAXB after unmarshalling the response XML returned
     * by the internal API. This method is used internally to set the actual XML
     * response that was returned by the internal API.
     * 
     * @param xml
     *            The actual XML response that was returned by the internal API.
     */
    public void setXml(String xml) {
        this.xml = xml;
    }
}
