/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about in the Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters. This is a demo text yay
 *
 * The version of the OpenAPI document: 1.0.6
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

import java.io.IOException;

import java.util.Map;
import java.util.List;

/**
 * Callback for asynchronous API call.
 *
 * @param <T> The return type
 */
public interface ApiCallback<T> {
    /**
     * This is called when the API call fails.
     *
     * @param e The exception causing the failure
     * @param statusCode Status code of the response if available, otherwise it would be 0
     * @param responseHeaders Headers of the response if available, otherwise it would be null
     */
    void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders);

    /**
     * This is called when the API call succeeded.
     *
     * @param result The result deserialized from response
     * @param statusCode Status code of the response
     * @param responseHeaders Headers of the response
     */
    void onSuccess(T result, int statusCode, Map<String, List<String>> responseHeaders);

    /**
     * This is called when the API upload processing.
     *
     * @param bytesWritten bytes Written
     * @param contentLength content length of request body
     * @param done write end
     */
    void onUploadProgress(long bytesWritten, long contentLength, boolean done);

    /**
     * This is called when the API download processing.
     *
     * @param bytesRead bytes Read
     * @param contentLength content length of the response
     * @param done Read end
     */
    void onDownloadProgress(long bytesRead, long contentLength, boolean done);
}
