/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The Sawshark model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "fishtype")
@JsonTypeName("sawshark")
public class Sawshark extends Shark {
    /**
     * The picture property.
     */
    private byte[] picture;

    /**
     * Get the picture value.
     *
     * @return the picture value
     */
    public byte[] getPicture() {
        return this.picture;
    }

    /**
     * Set the picture value.
     *
     * @param picture the picture value to set
     */
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

}
