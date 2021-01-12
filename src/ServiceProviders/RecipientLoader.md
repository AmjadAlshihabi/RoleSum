# RecipientLoader
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* initializeCryptoStatusForAllRecipients(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* deliverResult(List<Recipient> data)
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* onStartLoading()
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* loadInBackground()
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* loadInBackground()
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* loadInBackground()
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* loadInBackground()
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* loadInBackground()
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCryptoProvider(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCryptoProvider(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCryptoProvider(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCryptoProvider(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCryptoProvider(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCryptoProvider(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCryptoProvider(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromAddresses(Address[] addresses, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromAddresses(Address[] addresses, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromEmailContentUri(Uri contactUri, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromEmailContentUri(Uri contactUri, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromEmailContentUri(Uri contactUri, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromEmailContentUri(Uri contactUri, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromLookupKey(Uri lookupKeyUri, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromLookupKey(Uri lookupKeyUri, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromLookupKey(Uri lookupKeyUri, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromLookupKey(Uri lookupKeyUri, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* getContactIdFromContactUri(Uri contactUri)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* getNicknameCursor(String nickname)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* getNicknameCursor(String nickname)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* getNicknameCursor(String nickname)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* getNicknameCursor(String nickname)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromQuery(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* registerContentObserver()
	* [MonitoredCursor](../ServiceProviders/MonitoredCursor.md) has a role type of Service Provider
	* [MergeCursor](../ServiceProviders/MergeCursor.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromNickname(String nickname, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromNickname(String nickname, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromNickname(String nickname, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromNickname(String nickname, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromNickname(String nickname, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromNickname(String nickname, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromNickname(String nickname, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromNameAndEmail(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromNameAndEmail(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromNameAndEmail(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromNameAndEmail(String query, List<Recipient> recipients,
            Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCursor(Cursor cursor, List<Recipient> recipients,
            Map<String, Recipient> recipientMap, @Nullable String prefilledName)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCursor(Cursor cursor, List<Recipient> recipients,
            Map<String, Recipient> recipientMap, @Nullable String prefilledName)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCursor(Cursor cursor, List<Recipient> recipients,
            Map<String, Recipient> recipientMap, @Nullable String prefilledName)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCursor(Cursor cursor, List<Recipient> recipients,
            Map<String, Recipient> recipientMap, @Nullable String prefilledName)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCursor(Cursor cursor, List<Recipient> recipients,
            Map<String, Recipient> recipientMap, @Nullable String prefilledName)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCursor(Cursor cursor, List<Recipient> recipients,
            Map<String, Recipient> recipientMap, @Nullable String prefilledName)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillContactDataFromCursor(Cursor cursor, List<Recipient> recipients,
            Map<String, Recipient> recipientMap, @Nullable String prefilledName)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillCryptoStatusData(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillCryptoStatusData(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillCryptoStatusData(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillCryptoStatusData(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillCryptoStatusData(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillCryptoStatusData(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillCryptoStatusData(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillCryptoStatusData(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillCryptoStatusData(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillCryptoStatusData(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* fillCryptoStatusData(Map<String, Recipient> recipientMap)
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* onAbandon()
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
