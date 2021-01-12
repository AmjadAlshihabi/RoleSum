# MessageViewInfoExtractor
## This Controller is responsible for:
* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) (Service Provider)
### controlling tasks with the following methods 
* buildText(Viewable viewable, boolean prependDivider)
* buildHtml(Viewable viewable, boolean prependDivider)
* addTableRow(StringBuilder html, String header, String value)
* extractSimpleMessageForView(Message message, Part contentPart)
* getPartName(Part part)
