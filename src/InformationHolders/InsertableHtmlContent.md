# InsertableHtmlContent
## This Information Holder is responsible for:
### providing and holding information about: 
* serialVersionUID
* userContent
* headerInsertionPoint
* footerInsertionPoint
* quotedContent
* insertionLocation
### Serialization of objects throught the following methods:
* toString
* ()
### Providing information to the following objects 
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
* [HtmlQuoteCreator](../ServiceProviders/HtmlQuoteCreator.md) has a role type of Service Provider
