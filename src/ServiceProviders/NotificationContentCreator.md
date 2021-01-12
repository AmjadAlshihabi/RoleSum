# NotificationContentCreator
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* createFromMessage(Account account, LocalMessage message)
	* [NewMailNotifications](../Coordinators/NewMailNotifications.md) has a role type of Coordinator
	* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
* getMessagePreview(LocalMessage message)
	* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
* buildMessageSummary(String sender, String subject)
	* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* getPreview(LocalMessage message)
	* [PreviewExtractor](../Coordinators/PreviewExtractor.md) has a role type of Coordinator
	* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
* getMessageSubject(Message message)
	* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
* getMessageSender(Account account, Message message)
	* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
* getMessageSenderForDisplay(String sender)
	* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
