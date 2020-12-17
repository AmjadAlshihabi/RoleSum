# DownloadImageTask
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* doInBackground(String... params)
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [SaveAttachmentAsyncTask](../ServiceProviders/SaveAttachmentAsyncTask.md) has a role type of Service Provider
	* [ViewAttachmentAsyncTask](../ServiceProviders/ViewAttachmentAsyncTask.md) has a role type of Service Provider
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [LoadAccounts](../ServiceProviders/LoadAccounts.md) has a role type of Service Provider
	* [ExportAsyncTask](../ServiceProviders/ExportAsyncTask.md) has a role type of Service Provider
	* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) has a role type of Service Provider
	* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) has a role type of Service Provider
	* [MoveAccountAsyncTask](../ServiceProviders/MoveAccountAsyncTask.md) has a role type of Service Provider
	* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
	* [SendMessageTask](../ServiceProviders/SendMessageTask.md) has a role type of Service Provider
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
	* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
	* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) has a role type of Service Provider
* downloadAndStoreImage(String urlString)
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
* getMimeType(ContentResolver contentResolver, Uri uri, String fileName)
	* [Multipart](../Structurers/Multipart.md) has a role type of Structurer
	* [Part](../ServiceProviders/Part.md) has a role type of Service Provider
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
	* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
	* [MimeMessageBuilder](../Structurers/MimeMessageBuilder.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MimeMessageHelper](../ServiceProviders/MimeMessageHelper.md) has a role type of Service Provider
	* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
	* [IntentAndResolvedActivitiesCount](../InformationHolders/IntentAndResolvedActivitiesCount.md) has a role type of Information Holder
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [EncryptionDetector](../ServiceProviders/EncryptionDetector.md) has a role type of Service Provider
	* [MessageFulltextCreator](../ServiceProviders/MessageFulltextCreator.md) has a role type of Service Provider
	* [PreviewTextExtractor](../ServiceProviders/PreviewTextExtractor.md) has a role type of Service Provider
	* [TextPartFinder](../ServiceProviders/TextPartFinder.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [PartBuilder](../Structurers/PartBuilder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessageCryptoStructureDetector](../ServiceProviders/MessageCryptoStructureDetector.md) has a role type of Service Provider
* getMimeType(ContentResolver contentResolver, Uri uri, String fileName)
	* [Multipart](../Structurers/Multipart.md) has a role type of Structurer
	* [Part](../ServiceProviders/Part.md) has a role type of Service Provider
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
	* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
	* [MimeMessageBuilder](../Structurers/MimeMessageBuilder.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MimeMessageHelper](../ServiceProviders/MimeMessageHelper.md) has a role type of Service Provider
	* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
	* [IntentAndResolvedActivitiesCount](../InformationHolders/IntentAndResolvedActivitiesCount.md) has a role type of Information Holder
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [EncryptionDetector](../ServiceProviders/EncryptionDetector.md) has a role type of Service Provider
	* [MessageFulltextCreator](../ServiceProviders/MessageFulltextCreator.md) has a role type of Service Provider
	* [PreviewTextExtractor](../ServiceProviders/PreviewTextExtractor.md) has a role type of Service Provider
	* [TextPartFinder](../ServiceProviders/TextPartFinder.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [PartBuilder](../Structurers/PartBuilder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessageCryptoStructureDetector](../ServiceProviders/MessageCryptoStructureDetector.md) has a role type of Service Provider
* getFileNameWithExtension(String fileName, String mimeType)
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
* writeFileToStorage(String fileName, InputStream in)
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* onPostExecute(String fileName)
	* [SaveAttachmentAsyncTask](../ServiceProviders/SaveAttachmentAsyncTask.md) has a role type of Service Provider
	* [ViewAttachmentAsyncTask](../ServiceProviders/ViewAttachmentAsyncTask.md) has a role type of Service Provider
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [LoadAccounts](../ServiceProviders/LoadAccounts.md) has a role type of Service Provider
	* [ExportAsyncTask](../ServiceProviders/ExportAsyncTask.md) has a role type of Service Provider
	* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) has a role type of Service Provider
	* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) has a role type of Service Provider
	* [MoveAccountAsyncTask](../ServiceProviders/MoveAccountAsyncTask.md) has a role type of Service Provider
	* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* getFileNameFromUrl(URL url)
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
* fetchAndStoreImage(String urlString)
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
* getFileNameFromContentProvider(ContentResolver contentResolver, Uri uri)
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
* getFileNameFromContentProvider(ContentResolver contentResolver, Uri uri)
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
* getFileNameFromContentProvider(ContentResolver contentResolver, Uri uri)
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
