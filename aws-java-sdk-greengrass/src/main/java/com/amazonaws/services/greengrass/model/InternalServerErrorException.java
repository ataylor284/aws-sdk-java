/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.greengrass.model;

import javax.annotation.Generated;

/**
 * General Error
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerErrorException extends com.amazonaws.services.greengrass.model.AWSGreengrassException {
    private static final long serialVersionUID = 1L;

    /** Error Details */
    private java.util.List<ErrorDetail> errorDetails;

    /**
     * Constructs a new InternalServerErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalServerErrorException(String message) {
        super(message);
    }

    /**
     * Error Details
     * 
     * @return Error Details
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorDetails")
    public java.util.List<ErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    /**
     * Error Details
     * 
     * @param errorDetails
     *        Error Details
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorDetails")
    public void setErrorDetails(java.util.Collection<ErrorDetail> errorDetails) {
        if (errorDetails == null) {
            this.errorDetails = null;
            return;
        }

        this.errorDetails = new java.util.ArrayList<ErrorDetail>(errorDetails);
    }

    /**
     * Error Details
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorDetails(java.util.Collection)} or {@link #withErrorDetails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorDetails
     *        Error Details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServerErrorException withErrorDetails(ErrorDetail... errorDetails) {
        if (this.errorDetails == null) {
            setErrorDetails(new java.util.ArrayList<ErrorDetail>(errorDetails.length));
        }
        for (ErrorDetail ele : errorDetails) {
            this.errorDetails.add(ele);
        }
        return this;
    }

    /**
     * Error Details
     * 
     * @param errorDetails
     *        Error Details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServerErrorException withErrorDetails(java.util.Collection<ErrorDetail> errorDetails) {
        setErrorDetails(errorDetails);
        return this;
    }

}
