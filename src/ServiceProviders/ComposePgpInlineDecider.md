# ComposePgpInlineDecider
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* shouldReplyInline(Message localMessage)
	* [ComposePgpInlineDecider](../ServiceProviders/ComposePgpInlineDecider.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* messageHasPgpInlineParts(Message localMessage)
	* [ComposePgpInlineDecider](../ServiceProviders/ComposePgpInlineDecider.md) has a role type of Service Provider
