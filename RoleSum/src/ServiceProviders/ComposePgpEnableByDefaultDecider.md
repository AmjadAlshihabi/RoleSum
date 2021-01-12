# ComposePgpEnableByDefaultDecider
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* shouldEncryptByDefault(Message localMessage)
	* [ComposePgpEnableByDefaultDecider](../ServiceProviders/ComposePgpEnableByDefaultDecider.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* messageIsEncrypted(Message localMessage)
	* [ComposePgpEnableByDefaultDecider](../ServiceProviders/ComposePgpEnableByDefaultDecider.md) has a role type of Service Provider
