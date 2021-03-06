/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the AutoRestUrlTestService class.
 */
public final class AutoRestUrlTestServiceImpl extends ServiceClient implements AutoRestUrlTestService {
    /**
     * The URI used as the base for all cloud service requests.
     */
    private final String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    /** A string value 'globalItemStringPath' that appears in the path. */
    private String globalStringPath;

    /**
     * Gets A string value 'globalItemStringPath' that appears in the path.
     *
     * @return the globalStringPath value.
     */
    public String getGlobalStringPath() {
        return this.globalStringPath;
    }

    /**
     * Sets A string value 'globalItemStringPath' that appears in the path.
     *
     * @param globalStringPath the globalStringPath value.
     */
    public void setGlobalStringPath(String globalStringPath) {
        this.globalStringPath = globalStringPath;
    }

    /** should contain value null. */
    private String globalStringQuery;

    /**
     * Gets should contain value null.
     *
     * @return the globalStringQuery value.
     */
    public String getGlobalStringQuery() {
        return this.globalStringQuery;
    }

    /**
     * Sets should contain value null.
     *
     * @param globalStringQuery the globalStringQuery value.
     */
    public void setGlobalStringQuery(String globalStringQuery) {
        this.globalStringQuery = globalStringQuery;
    }

    /**
     * Gets the Paths object to access its operations.
     * @return the paths value.
     */
    public Paths getPaths() {
        return new PathsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the Queries object to access its operations.
     * @return the queries value.
     */
    public Queries getQueries() {
        return new QueriesImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the PathItems object to access its operations.
     * @return the pathItems value.
     */
    public PathItems getPathItems() {
        return new PathItemsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     */
    public AutoRestUrlTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestUrlTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestUrlTestServiceImpl(String baseUri, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        this.retrofitBuilder.baseUrl(baseUri);
    }
}
