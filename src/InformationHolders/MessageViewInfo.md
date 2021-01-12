# MessageViewInfo
## This Information Holder is responsible for:
### providing and holding information about: 
* attachmentResolver
* isMessageIncomplete
* attachments
* rootPart
* extraAttachments
* text
* extraText
* message
* cryptoResultAnnotation
### Providing information to the following objects 
* [MessageCryptoPresenter](../Controllers/MessageCryptoPresenter.md) has a role type of Controller
* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
