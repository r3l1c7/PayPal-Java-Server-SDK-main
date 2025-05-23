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
 * This is a model class for TrustlyPaymentRequest type.
 */
public class TrustlyPaymentRequest {
    private String name;
    private String countryCode;
    private String email;
    private ExperienceContext experienceContext;

    /**
     * Default constructor.
     */
    public TrustlyPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  countryCode  String value for countryCode.
     * @param  email  String value for email.
     * @param  experienceContext  ExperienceContext value for experienceContext.
     */
    public TrustlyPaymentRequest(
            String name,
            String countryCode,
            String email,
            ExperienceContext experienceContext) {
        this.name = name;
        this.countryCode = countryCode;
        this.email = email;
        this.experienceContext = experienceContext;
    }

    /**
     * Getter for Name.
     * The full name representation like Mr J Smith.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The full name representation like Mr J Smith.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for CountryCode.
     * The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region. Note: The country code for Great Britain is GB and not UK as used in the
     * top-level domain names for that country. Use the `C2` country code for China worldwide for
     * comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.
     * @return Returns the String
     */
    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region. Note: The country code for Great Britain is GB and not UK as used in the
     * top-level domain names for that country. Use the `C2` country code for China worldwide for
     * comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for Email.
     * The internationalized email address. Note: Up to 64 characters are allowed before and 255
     * characters are allowed after the {@literal @} sign. However, the generally accepted maximum length for
     * an email address is 254 characters. The pattern verifies that an unquoted {@literal @} sign exists.
     * @return Returns the String
     */
    @JsonGetter("email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * The internationalized email address. Note: Up to 64 characters are allowed before and 255
     * characters are allowed after the {@literal @} sign. However, the generally accepted maximum length for
     * an email address is 254 characters. The pattern verifies that an unquoted {@literal @} sign exists.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for ExperienceContext.
     * Customizes the payer experience during the approval process for the payment.
     * @return Returns the ExperienceContext
     */
    @JsonGetter("experience_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExperienceContext getExperienceContext() {
        return experienceContext;
    }

    /**
     * Setter for ExperienceContext.
     * Customizes the payer experience during the approval process for the payment.
     * @param experienceContext Value for ExperienceContext
     */
    @JsonSetter("experience_context")
    public void setExperienceContext(ExperienceContext experienceContext) {
        this.experienceContext = experienceContext;
    }

    /**
     * Converts this TrustlyPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TrustlyPaymentRequest [" + "name=" + name + ", countryCode=" + countryCode
                + ", email=" + email + ", experienceContext=" + experienceContext + "]";
    }

    /**
     * Builds a new {@link TrustlyPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TrustlyPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, countryCode, email)
                .experienceContext(getExperienceContext());
        return builder;
    }

    /**
     * Class to build instances of {@link TrustlyPaymentRequest}.
     */
    public static class Builder {
        private String name;
        private String countryCode;
        private String email;
        private ExperienceContext experienceContext;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  countryCode  String value for countryCode.
         * @param  email  String value for email.
         */
        public Builder(String name, String countryCode, String email) {
            this.name = name;
            this.countryCode = countryCode;
            this.email = email;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for experienceContext.
         * @param  experienceContext  ExperienceContext value for experienceContext.
         * @return Builder
         */
        public Builder experienceContext(ExperienceContext experienceContext) {
            this.experienceContext = experienceContext;
            return this;
        }

        /**
         * Builds a new {@link TrustlyPaymentRequest} object using the set fields.
         * @return {@link TrustlyPaymentRequest}
         */
        public TrustlyPaymentRequest build() {
            return new TrustlyPaymentRequest(name, countryCode, email, experienceContext);
        }
    }
}
