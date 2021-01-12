# LocalFolder
## This Information Holder is responsible for:
### providing and holding information about: 
* visibleLimit
* INVALID_MESSAGE_PART_ID
* prefId
* lastUid
* displayClass
* attachmentInfoExtractor
* moreMessages
* pushState
* syncClass
* name
* isIntegrate
* localStore
* isInTopGroup
* databaseId
* notifyClass
* MAX_BODY_SIZE_FOR_DATABASE
* pushClass
### Managing database tasks through the following methods:
* getDatabaseId()
* open(final int mode)
* open(Cursor cursor)
* isOpen()
* exists()
* close()
* getMessageCount()
* getUnreadMessageCount()
* getFlaggedMessageCount()
* purgeToVisibleLimit(final MessageRemovalListener listener)
* updateFolderColumn(final String column, final Object value)
* setMoreMessages(MoreMessages moreMessages)
* fetch(final List<LocalMessage> messages, final FetchProfile fp, final MessageRetrievalListener<LocalMessage> listener)
* loadMessageParts(SQLiteDatabase db, LocalMessage message)
* loadMessagePart(LocalMessage message, Map<Long, Part> partById, Cursor cursor)
* getMessageUidById(final long id)
* getMessage(final String uid)
* getAllMessagesAndEffectiveDates()
* getMessages(final MessageRetrievalListener<LocalMessage> listener, final boolean includeDeleted)
* getAllMessageUids()
* moveMessages(final List<? extends Message> msgs, final Folder destFolder)
* storeSmallMessage(final Message message, final Runnable runnable)
* destroyMessages(final List<? extends Message> messages)
* getThreadInfo(SQLiteDatabase db, String messageId, boolean onlyEmpty)
* appendMessages(final List<? extends Message> messages, final boolean copy)
* saveMessage(SQLiteDatabase db, Message message, boolean copy, Map<String, String> uidMap)
* saveMessageParts(SQLiteDatabase db, Message message)
* saveMessagePart(SQLiteDatabase db, PartContainer partContainer, long rootMessagePartId, int order)
* updateOrInsertMessagePart(SQLiteDatabase db, ContentValues cv, Part part, long existingMessagePartId)
* missingPartToContentValues(ContentValues cv, Part part)
* leafPartToContentValues(ContentValues cv, Part part, Body body)
* addPartToMessage(final LocalMessage message, final Part part)
* changeUid(final LocalMessage message)
* setFlags(final List<? extends Message> messages, final Set<Flag> flags, final boolean value)
* clearMessagesOlderThan(long cutoff)
* clearAllMessages()
* delete(final boolean recurse)
* destroyMessage(LocalMessage localMessage)
* destroyMessage(final long messageId, final long messagePartId, final String messageIdHeader)
* hasThreadChildren(SQLiteDatabase db, long messageId)
* getEmptyThreadParent(SQLiteDatabase db, long messageId)
* deleteMessageRow(SQLiteDatabase db, long messageId)
* deleteFulltextIndexEntry(SQLiteDatabase db, long messageId)
* deleteMessageParts(final long rootMessagePartId)
* deleteMessageDataFromDisk(final long rootMessagePartId)
* deleteMessagePartsFromDisk(SQLiteDatabase db, long rootMessagePartId)
* updateLastUid()
* getOldestMessageDate()
* doMessageThreading(SQLiteDatabase db, Message message)
* extractNewMessages(final List<Message> messages)
### Providing information to the following objects 
* Controller
	* [MessagingController](../Controllers/MessagingController.md) 
* Coordinator
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) 
* Information Holder
	* [LocalMessage](../InformationHolders/LocalMessage.md) 
	* [FolderInfoHolder](../InformationHolders/FolderInfoHolder.md) 
	* [PreferencesHolder](../InformationHolders/PreferencesHolder.md) 
* Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) 
	* [ChooseFolder](../Interfacers/ChooseFolder.md) 
	* [MessageListFragment](../Interfacers/MessageListFragment.md) 
	* [FolderSettings](../Interfacers/FolderSettings.md) 
* Service Provider
	* [MigrationTo42](../ServiceProviders/MigrationTo42.md) 
	* [MlfUtils](../ServiceProviders/MlfUtils.md) 
	* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) 
	* [MessagingListener](../ServiceProviders/MessagingListener.md) 
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) 
	* [LocalStore](../ServiceProviders/LocalStore.md) 
	* [MigrationTo55](../ServiceProviders/MigrationTo55.md) 
	* [MessageActor](../ServiceProviders/MessageActor.md) 
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) 
* Structurer
	* [MessageInfoHolderRetrieverListener](../Structurers/MessageInfoHolderRetrieverListener.md) 
