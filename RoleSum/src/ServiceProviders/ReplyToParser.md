# ReplyToParser
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getRecipientsToReplyTo(Message message, Account account)
	* [ReplyToParser](../ServiceProviders/ReplyToParser.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* getRecipientsToReplyAllTo(Message message, Account account)
	* [ReplyToParser](../ServiceProviders/ReplyToParser.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
