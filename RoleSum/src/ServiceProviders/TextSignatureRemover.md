# TextSignatureRemover
## This Service Provider is responsible for:
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* stripSignature(String content)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [HtmlSignatureRemover](../Coordinators/HtmlSignatureRemover.md) has a role type of Coordinator
	* [TextSignatureRemover](../ServiceProviders/TextSignatureRemover.md) has a role type of Service Provider
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
