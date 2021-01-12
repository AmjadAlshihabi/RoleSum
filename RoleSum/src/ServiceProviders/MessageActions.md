# MessageActions
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* actionCompose(Context context, Account account)
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageActions](../ServiceProviders/MessageActions.md) has a role type of Service Provider
* getActionReplyIntent(Context context, MessageReference messageReference)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [MessageActions](../ServiceProviders/MessageActions.md) has a role type of Service Provider
* getActionReplyIntent(Context context, MessageReference messageReference)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [MessageActions](../ServiceProviders/MessageActions.md) has a role type of Service Provider
* actionReply(
            Context context, MessageReference messageReference, boolean replyAll, Parcelable decryptionResult)
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageActions](../ServiceProviders/MessageActions.md) has a role type of Service Provider
* actionForward(Context context, MessageReference messageReference, Parcelable decryptionResult)
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageActions](../ServiceProviders/MessageActions.md) has a role type of Service Provider
* actionEditDraft(Context context, MessageReference messageReference)
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageActions](../ServiceProviders/MessageActions.md) has a role type of Service Provider
