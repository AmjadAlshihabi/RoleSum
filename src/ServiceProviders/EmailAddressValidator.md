# EmailAddressValidator
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* fixText(CharSequence invalidText)
	* [EmailAddressValidator](../ServiceProviders/EmailAddressValidator.md) has a role type of Service Provider
* isValid(CharSequence text)
	* [EmailAddressValidator](../ServiceProviders/EmailAddressValidator.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* isValidAddressOnly(CharSequence text)
	* [EmailAddressValidator](../ServiceProviders/EmailAddressValidator.md) has a role type of Service Provider
	* [OptionalEmailAddressSetting](../ServiceProviders/OptionalEmailAddressSetting.md) has a role type of Service Provider
	* [IdentitySettings](../Coordinators/IdentitySettings.md) has a role type of Coordinator
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
