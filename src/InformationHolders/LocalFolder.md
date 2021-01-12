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
* getMessages(final MessageRetrievalListener<LocalMessage> listener,
            final boolean includeDeleted)
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
* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
* [MessageInfoHolderRetrieverListener](../Structurers/MessageInfoHolderRetrieverListener.md) has a role type of Structurer
* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
* [MigrationTo42](../ServiceProviders/MigrationTo42.md) has a role type of Service Provider
* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
* [MessageActor](../ServiceProviders/MessageActor.md) has a role type of Service Provider
* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
* [FolderInfoHolder](../InformationHolders/FolderInfoHolder.md) has a role type of Information Holder
* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
