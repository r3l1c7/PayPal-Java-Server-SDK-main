/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AuthorizeOrderInput type.
 */
public class AuthorizeOrderInput {
    private String id;
    private String contentType;
    private String paypalMockResponse;
    private String paypalRequestId;
    private String prefer;
    private String paypalClientMetadataId;
    private String paypalAuthAssertion;
    private OrderAuthorizeRequest body;

    /**
     * Default constructor.
     */
    public AuthorizeOrderInput() {
        contentType = "application/json";
        prefer = "return=minimal";
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  contentType  String value for contentType.
     * @param  paypalMockResponse  String value for paypalMockResponse.
     * @param  paypalRequestId  String value for paypalRequestId.
     * @param  prefer  String value for prefer.
     * @param  paypalClientMetadataId  String value for paypalClientMetadataId.
     * @param  paypalAuthAssertion  String value for paypalAuthAssertion.
     * @param  body  OrderAuthorizeRequest value for body.
     */
    public AuthorizeOrderInput(
            String id,
            String contentType,
            String paypalMockResponse,
            String paypalRequestId,
            String prefer,
            String paypalClientMetadataId,
            String paypalAuthAssertion,
            OrderAuthorizeRequest body) {
        this.id = id;
        this.contentType = contentType;
        this.paypalMockResponse = paypalMockResponse;
        this.paypalRequestId = paypalRequestId;
        this.prefer = prefer;
        this.paypalClientMetadataId = paypalClientMetadataId;
        this.paypalAuthAssertion = paypalAuthAssertion;
        this.body = body;
    }

    /**
     * Getter for Id.
     * The ID of the order for which to authorize.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID of the order for which to authorize.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for ContentType.
     * @return Returns the String
     */
    @JsonGetter("Content-Type")
    public String getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType.
     * @param contentType Value for String
     */
    @JsonSetter("Content-Type")
    private void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter for PaypalMockResponse.
     * PayPal's REST API uses a request header to invoke negative testing in the sandbox. This
     * header configures the sandbox into a negative testing state for transactions that include the
     * merchant.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Mock-Response")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaypalMockResponse() {
        return paypalMockResponse;
    }

    /**
     * Setter for PaypalMockResponse.
     * PayPal's REST API uses a request header to invoke negative testing in the sandbox. This
     * header configures the sandbox into a negative testing state for transactions that include the
     * merchant.
     * @param paypalMockResponse Value for String
     */
    @JsonSetter("PayPal-Mock-Response")
    public void setPaypalMockResponse(String paypalMockResponse) {
        this.paypalMockResponse = paypalMockResponse;
    }

    /**
     * Getter for PaypalRequestId.
     * The server stores keys for 6 hours. The API callers can request the times to up to 72 hours
     * by speaking to their Account Manager. It is mandatory for all single-step create order calls
     * (E.g. Create Order Request with payment source information like Card, PayPal.vault_id,
     * PayPal.billing_agreement_id, etc).
     * @return Returns the String
     */
    @JsonGetter("PayPal-Request-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaypalRequestId() {
        return paypalRequestId;
    }

    /**
     * Setter for PaypalRequestId.
     * The server stores keys for 6 hours. The API callers can request the times to up to 72 hours
     * by speaking to their Account Manager. It is mandatory for all single-step create order calls
     * (E.g. Create Order Request with payment source information like Card, PayPal.vault_id,
     * PayPal.billing_agreement_id, etc).
     * @param paypalRequestId Value for String
     */
    @JsonSetter("PayPal-Request-Id")
    public void setPaypalRequestId(String paypalRequestId) {
        this.paypalRequestId = paypalRequestId;
    }

    /**
     * Getter for Prefer.
     * The preferred server response upon successful completion of the request. Value is:
     * return=minimal. The server returns a minimal response to optimize communication between the
     * API caller and the server. A minimal response includes the id, status and HATEOAS links.
     * return=representation. The server returns a complete resource representation, including the
     * current state of the resource.
     * @return Returns the String
     */
    @JsonGetter("Prefer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrefer() {
        return prefer;
    }

    /**
     * Setter for Prefer.
     * The preferred server response upon successful completion of the request. Value is:
     * return=minimal. The server returns a minimal response to optimize communication between the
     * API caller and the server. A minimal response includes the id, status and HATEOAS links.
     * return=representation. The server returns a complete resource representation, including the
     * current state of the resource.
     * @param prefer Value for String
     */
    @JsonSetter("Prefer")
    public void setPrefer(String prefer) {
        this.prefer = prefer;
    }

    /**
     * Getter for PaypalClientMetadataId.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Client-Metadata-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaypalClientMetadataId() {
        return paypalClientMetadataId;
    }

    /**
     * Setter for PaypalClientMetadataId.
     * @param paypalClientMetadataId Value for String
     */
    @JsonSetter("PayPal-Client-Metadata-Id")
    public void setPaypalClientMetadataId(String paypalClientMetadataId) {
        this.paypalClientMetadataId = paypalClientMetadataId;
    }

    /**
     * Getter for PaypalAuthAssertion.
     * An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For
     * details, see PayPal-Auth-Assertion.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Auth-Assertion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaypalAuthAssertion() {
        return paypalAuthAssertion;
    }

    /**
     * Setter for PaypalAuthAssertion.
     * An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For
     * details, see PayPal-Auth-Assertion.
     * @param paypalAuthAssertion Value for String
     */
    @JsonSetter("PayPal-Auth-Assertion")
    public void setPaypalAuthAssertion(String paypalAuthAssertion) {
        this.paypalAuthAssertion = paypalAuthAssertion;
    }

    /**
     * Getter for Body.
     * @return Returns the OrderAuthorizeRequest
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderAuthorizeRequest getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for OrderAuthorizeRequest
     */
    @JsonSetter("body")
    public void setBody(OrderAuthorizeRequest body) {
        this.body = body;
    }

    /**
     * Converts this AuthorizeOrderInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthorizeOrderInput [" + "id=" + id + ", contentType=" + contentType
                + ", paypalMockResponse=" + paypalMockResponse + ", paypalRequestId="
                + paypalRequestId + ", prefer=" + prefer + ", paypalClientMetadataId="
                + paypalClientMetadataId + ", paypalAuthAssertion=" + paypalAuthAssertion
                + ", body=" + body + "]";
    }

    /**
     * Builds a new {@link AuthorizeOrderInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuthorizeOrderInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, contentType)
                .paypalMockResponse(getPaypalMockResponse())
                .paypalRequestId(getPaypalRequestId())
                .prefer(getPrefer())
                .paypalClientMetadataId(getPaypalClientMetadataId())
                .paypalAuthAssertion(getPaypalAuthAssertion())
                .body(getBody());
        return builder;
    }

    /**
     * Class to build instances of {@link AuthorizeOrderInput}.
     */
    public static class Builder {
        private String id;
        private String contentType = "application/json";
        private String paypalMockResponse;
        private String paypalRequestId;
        private String prefer = "return=minimal";
        private String paypalClientMetadataId;
        private String paypalAuthAssertion;
        private OrderAuthorizeRequest body;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  contentType  String value for contentType.
         */
        public Builder(String id, String contentType) {
            this.id = id;
            this.contentType = contentType;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for contentType.
         * @param  contentType  String value for contentType.
         * @return Builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Setter for paypalMockResponse.
         * @param  paypalMockResponse  String value for paypalMockResponse.
         * @return Builder
         */
        public Builder paypalMockResponse(String paypalMockResponse) {
            this.paypalMockResponse = paypalMockResponse;
            return this;
        }

        /**
         * Setter for paypalRequestId.
         * @param  paypalRequestId  String value for paypalRequestId.
         * @return Builder
         */
        public Builder paypalRequestId(String paypalRequestId) {
            this.paypalRequestId = paypalRequestId;
            return this;
        }

        /**
         * Setter for prefer.
         * @param  prefer  String value for prefer.
         * @return Builder
         */
        public Builder prefer(String prefer) {
            this.prefer = prefer;
            return this;
        }

        /**
         * Setter for paypalClientMetadataId.
         * @param  paypalClientMetadataId  String value for paypalClientMetadataId.
         * @return Builder
         */
        public Builder paypalClientMetadataId(String paypalClientMetadataId) {
            this.paypalClientMetadataId = paypalClientMetadataId;
            return this;
        }

        /**
         * Setter for paypalAuthAssertion.
         * @param  paypalAuthAssertion  String value for paypalAuthAssertion.
         * @return Builder
         */
        public Builder paypalAuthAssertion(String paypalAuthAssertion) {
            this.paypalAuthAssertion = paypalAuthAssertion;
            return this;
        }

        /**
         * Setter for body.
         * @param  body  OrderAuthorizeRequest value for body.
         * @return Builder
         */
        public Builder body(OrderAuthorizeRequest body) {
            this.body = body;
            return this;
        }

        /**
         * Builds a new {@link AuthorizeOrderInput} object using the set fields.
         * @return {@link AuthorizeOrderInput}
         */
        public AuthorizeOrderInput build() {
            return new AuthorizeOrderInput(id, contentType, paypalMockResponse, paypalRequestId,
                    prefer, paypalClientMetadataId, paypalAuthAssertion, body);
        }
    }
}
