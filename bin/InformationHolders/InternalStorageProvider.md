# InternalStorageProvider
## This Information Holder is responsible for:
### providing and holding information about: 
* mRoot
* ID
### Managing database tasks through the following methods:
* getDatabase(Context context, String id)
* getAttachmentDirectory(Context context, String id)
### Providing information to the following objects 
* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
