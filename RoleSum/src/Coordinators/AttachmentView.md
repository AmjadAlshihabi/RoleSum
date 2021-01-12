# AttachmentView
### This Coordinator is responsible for delegating work between the following objects: 
* [ImapResponse](../InformationHolders/ImapResponse.md) has a role type of Information Holder
* [LockedAttachmentView](../Interfacers/LockedAttachmentView.md) has a role type of Interfacer
* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
* [AttachmentViewCallback](../ServiceProviders/AttachmentViewCallback.md) has a role type of Service Provider
* [LockedAttachmentView](../Interfacers/LockedAttachmentView.md) has a role type of Interfacer
* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
* [AttachmentViewInfo](../InformationHolders/AttachmentViewInfo.md) has a role type of Information Holder
### the setCallback method receives requests from:
* [ImapResponse](../InformationHolders/ImapResponse.md) 
* [AttachmentView](../Coordinators/AttachmentView.md) 
* [LockedAttachmentView](../Interfacers/LockedAttachmentView.md) 
* [MessageContainerView](../Interfacers/MessageContainerView.md) 
### and delegate the request to: 
* [AttachmentViewCallback](../ServiceProviders/AttachmentViewCallback.md) 


### the setAttachment method receives requests from:
* [AttachmentView](../Coordinators/AttachmentView.md) 
* [LockedAttachmentView](../Interfacers/LockedAttachmentView.md) 
* [MessageContainerView](../Interfacers/MessageContainerView.md) 
### and delegate the request to: 
* [AttachmentViewInfo](../InformationHolders/AttachmentViewInfo.md) 


