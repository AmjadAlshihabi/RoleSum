# Attachment
## This Information Holder is responsible for:
### providing and holding information about: 
* filename
* size
* CREATOR
* loaderId
* name
* state
* contentType
* uri
### Serialization of objects throught the following methods:
* describeContents
* ()
* writeToParcel
* (Parcel dest, int flags)
### Providing information to the following objects 
* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) has a role type of Coordinator
