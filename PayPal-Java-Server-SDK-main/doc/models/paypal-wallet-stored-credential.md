
# Paypal Wallet Stored Credential

Provides additional details to process a payment using the PayPal wallet billing agreement or a vaulted payment method that has been stored or is intended to be stored.

## Structure

`PaypalWalletStoredCredential`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentInitiator` | [`PaymentInitiator`](../../doc/models/payment-initiator.md) | Required | The person or party who initiated or triggered the payment.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | PaymentInitiator getPaymentInitiator() | setPaymentInitiator(PaymentInitiator paymentInitiator) |
| `ChargePattern` | [`UsagePattern`](../../doc/models/usage-pattern.md) | Optional | Expected business/pricing model for the billing agreement.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `30`, *Pattern*: `^[A-Z0-9_]+$` | UsagePattern getChargePattern() | setChargePattern(UsagePattern chargePattern) |
| `UsagePattern` | [`UsagePattern`](../../doc/models/usage-pattern.md) | Optional | Expected business/pricing model for the billing agreement.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `30`, *Pattern*: `^[A-Z0-9_]+$` | UsagePattern getUsagePattern() | setUsagePattern(UsagePattern usagePattern) |
| `Usage` | [`StoredPaymentSourceUsageType`](../../doc/models/stored-payment-source-usage-type.md) | Optional | Indicates if this is a `first` or `subsequent` payment using a stored payment source (also referred to as stored credential or card on file).<br>**Default**: `StoredPaymentSourceUsageType.DERIVED`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | StoredPaymentSourceUsageType getUsage() | setUsage(StoredPaymentSourceUsageType usage) |

## Example (as JSON)

```json
{
  "payment_initiator": "CUSTOMER",
  "usage": "DERIVED",
  "charge_pattern": "IMMEDIATE",
  "usage_pattern": "IMMEDIATE"
}
```

