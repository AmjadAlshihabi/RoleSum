# TextBodyBuilder
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* buildTextHtml()
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
* buildTextPlain()
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
* getSignature()
	* [Identity](../InformationHolders/Identity.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
	* [EditIdentity](../Interfacers/EditIdentity.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
* getSignatureHtml()
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
* getQuotedText()
	* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) has a role type of Interfacer
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
* getQuotedTextHtml()
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
* textToHtmlFragment(String text)
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
	* [HtmlQuoteCreator](../ServiceProviders/HtmlQuoteCreator.md) has a role type of Service Provider
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* setSignature(String signature)
	* [Identity](../InformationHolders/Identity.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
	* [EditIdentity](../Interfacers/EditIdentity.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
* setIncludeQuotedText(boolean includeQuotedText)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
* setQuotedText(String quotedText)
	* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) has a role type of Interfacer
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
* setQuotedTextHtml(InsertableHtmlContent quotedTextHtml)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
* setInsertSeparator(boolean insertSeparator)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
* setSignatureBeforeQuotedText(boolean signatureBeforeQuotedText)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
* setReplyAfterQuote(boolean replyAfterQuote)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
* setAppendSignature(boolean appendSignature)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
