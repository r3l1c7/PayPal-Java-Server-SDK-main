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
 * This is a model class for CreateOrderInput type.
 */
public class CreateOrderInput {
    private String contentType;
    private OrderRequest body;
    private String paypalMockResponse;
    private String paypalRequestId;
    private String paypalPartnerAttributionId;
    private String paypalClientMetadataId;
    private String prefer;
    private String paypalAuthAssertion;

    /**
     * Default constructor.
     */
    public CreateOrderInput() {
        contentType = "application/json";
        prefer = "return=minimal";
    }

    /**
     * Initialization constructor.
     * @param  contentType  String value for contentType.
     * @param  body  OrderRequest value for body.
     * @param  paypalMockResponse  String value for paypalMockResponse.
     * @param  paypalRequestId  String value for paypalRequestId.
     * @param  paypalPartnerAttributionId  String value for paypalPartnerAttributionId.
     * @param  paypalClientMetadataId  String value for paypalClientMetadataId.
     * @param  prefer  String value for prefer.
     * @param  paypalAuthAssertion  String value for paypalAuthAssertion.
     */
    public CreateOrderInput(
            String contentType,
            OrderRequest body,
            String paypalMockResponse,
            String paypalRequestId,
            String paypalPartnerAttributionId,
            String paypalClientMetadataId,
            String prefer,
            String paypalAuthAssertion) {
        this.contentType = contentType;
        this.body = body;
        this.paypalMockResponse = paypalMockResponse;
        this.paypalRequestId = paypalRequestId;
        this.paypalPartnerAttributionId = paypalPartnerAttributionId;
        this.paypalClientMetadataId = paypalClientMetadataId;
        this.prefer = prefer;
        this.paypalAuthAssertion = paypalAuthAssertion;
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
     * Getter for Body.
     * @return Returns the OrderRequest
     */
    @JsonGetter("body")
    public OrderRequest getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for OrderRequest
     */
    @JsonSetter("body")
    public void setBody(OrderRequest body) {
        this.body = body;
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
     * Getter for PaypalPartnerAttributionId.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Partner-Attribution-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaypalPartnerAttributionId() {
        return paypalPartnerAttributionId;
    }

    /**
     * Setter for PaypalPartnerAttributionId.
     * @param paypalPartnerAttributionId Value for String
     */
    @JsonSetter("PayPal-Partner-Attribution-Id")
    public void setPaypalPartnerAttributionId(String paypalPartnerAttributionId) {
        this.paypalPartnerAttributionId = paypalPartnerAttributionId;
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
     * Converts this CreateOrderInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrderInput [" + "contentType=" + contentType + ", body=" + body
                + ", paypalMockResponse=" + paypalMockResponse + ", paypalRequestId="
                + paypalRequestId + ", paypalPartnerAttributionId=" + paypalPartnerAttributionId
                + ", paypalClientMetadataId=" + paypalClientMetadataId + ", prefer=" + prefer
                + ", paypalAuthAssertion=" + paypalAuthAssertion + "]";
    }

    /**
     * Builds a new {@link CreateOrderInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrderInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(contentType, body)
                .paypalMockResponse(getPaypalMockResponse())
                .paypalRequestId(getPaypalRequestId())
                .paypalPartnerAttributionId(getPaypalPartnerAttributionId())
                .paypalClientMetadataId(getPaypalClientMetadataId())
                .prefer(getPrefer())
                .paypalAuthAssertion(getPaypalAuthAssertion());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrderInput}.
     */
    public static class Builder {
        private String contentType = "application/json";
        private OrderRequest body;
        private String paypalMockResponse;
        private String paypalRequestId;
        private String paypalPartnerAttributionId;
        private String paypalClientMetadataId;
        private String prefer = "return=minimal";
        private String paypalAuthAssertion;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  contentType  String value for contentType.
         * @param  body  OrderRequest value for body.
         */
        public Builder(String contentType, OrderRequest body) {
            this.contentType = contentType;
            this.body = body;
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
         * Setter for body.
         * @param  body  OrderRequest value for body.
         * @return Builder
         */
        public Builder body(OrderRequest body) {
            this.body = body;
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
         * Setter for paypalPartnerAttributionId.
         * @param  paypalPartnerAttributionId  String value for paypalPartnerAttributionId.
         * @return Builder
         */
        public Builder paypalPartnerAttributionId(String paypalPartnerAttributionId) {
            this.paypalPartnerAttributionId = paypalPartnerAttributionId;
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
         * Setter for prefer.
         * @param  prefer  String value for prefer.
         * @return Builder
         */
        public Builder prefer(String prefer) {
            this.prefer = prefer;
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
         * Builds a new {@link CreateOrderInput} object using the set fields.
         * @return {@link CreateOrderInput}
         */
        public CreateOrderInput build() {
            return new CreateOrderInput(contentType, body, paypalMockResponse, paypalRequestId,
                    paypalPartnerAttributionId, paypalClientMetadataId, prefer,
                    paypalAuthAssertion);
        }
    }
}
