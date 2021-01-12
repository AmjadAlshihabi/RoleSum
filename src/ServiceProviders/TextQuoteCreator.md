# TextQuoteCreator
## This Service Provider is responsible for:
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* quoteOriginalTextMessage(Resources resources, Message originalMessage, String messageBody, QuoteStyle quoteStyle, String prefix)
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [TextQuoteCreator](../ServiceProviders/TextQuoteCreator.md) has a role type of Service Provider
