# HtmlConverter
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* appendsp(StringBuilder buff, int spaces)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* hasEmoji(String html)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* convertEmoji2Img(String html)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* getEmojiForCodePoint(int codePoint)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* htmlifyMessageFooter()
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* wrapStatusMessage(CharSequence status)
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* wrapMessageContent(CharSequence messageContent)
	* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) has a role type of Interfacer
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* cssStyleTheme()
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [HtmlProcessor](../ServiceProviders/HtmlProcessor.md) has a role type of Service Provider
* htmlToSpanned(String html)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [WelcomeMessage](../Interfacers/WelcomeMessage.md) has a role type of Interfacer
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* htmlToText(final String html)
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [BodyTextExtractor](../Interfacers/BodyTextExtractor.md) has a role type of Interfacer
	* [MessageFulltextCreator](../ServiceProviders/MessageFulltextCreator.md) has a role type of Service Provider
	* [PreviewTextExtractor](../ServiceProviders/PreviewTextExtractor.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* htmlToText(final String html)
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [BodyTextExtractor](../Interfacers/BodyTextExtractor.md) has a role type of Interfacer
	* [MessageFulltextCreator](../ServiceProviders/MessageFulltextCreator.md) has a role type of Service Provider
	* [PreviewTextExtractor](../ServiceProviders/PreviewTextExtractor.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* htmlToText(final String html)
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [BodyTextExtractor](../Interfacers/BodyTextExtractor.md) has a role type of Interfacer
	* [MessageFulltextCreator](../ServiceProviders/MessageFulltextCreator.md) has a role type of Service Provider
	* [PreviewTextExtractor](../ServiceProviders/PreviewTextExtractor.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* htmlToText(final String html)
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [BodyTextExtractor](../Interfacers/BodyTextExtractor.md) has a role type of Interfacer
	* [MessageFulltextCreator](../ServiceProviders/MessageFulltextCreator.md) has a role type of Service Provider
	* [PreviewTextExtractor](../ServiceProviders/PreviewTextExtractor.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* simpleTextToHtml(String text)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* textToHtml(String text)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [BodyTextExtractor](../Interfacers/BodyTextExtractor.md) has a role type of Interfacer
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* textToHtml(String text)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [BodyTextExtractor](../Interfacers/BodyTextExtractor.md) has a role type of Interfacer
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* textToHtml(String text)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [BodyTextExtractor](../Interfacers/BodyTextExtractor.md) has a role type of Interfacer
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* textToHtml(String text)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [BodyTextExtractor](../Interfacers/BodyTextExtractor.md) has a role type of Interfacer
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* textToHtml(String text)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [BodyTextExtractor](../Interfacers/BodyTextExtractor.md) has a role type of Interfacer
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* appendchar(StringBuilder buff, int c)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* appendbq(StringBuilder buff, int quotesThisLine, int quoteDepth)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* appendbq(StringBuilder buff, int quotesThisLine, int quoteDepth)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* appendbq(StringBuilder buff, int quotesThisLine, int quoteDepth)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* getQuoteColor(final int level)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* getQuoteColor(final int level)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* getQuoteColor(final int level)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* getQuoteColor(final int level)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* getQuoteColor(final int level)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* getQuoteColor(final int level)
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* htmlifyMessageHeader()
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
* cssStylePre()
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
	* [HtmlProcessor](../ServiceProviders/HtmlProcessor.md) has a role type of Service Provider
* textToHtmlFragment(final String text)
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
	* [HtmlQuoteCreator](../ServiceProviders/HtmlQuoteCreator.md) has a role type of Service Provider
	* [HtmlConverter](../ServiceProviders/HtmlConverter.md) has a role type of Service Provider
