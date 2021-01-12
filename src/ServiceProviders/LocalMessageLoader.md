# LocalMessageLoader
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* onStartLoading()
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* deliverResult(LocalMessage message)
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* loadInBackground()
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* loadMessageFromDatabase()
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
* loadMessageFromDatabase()
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
* loadMessageFromDatabase()
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
* isCreatedFor(MessageReference messageReference)
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
