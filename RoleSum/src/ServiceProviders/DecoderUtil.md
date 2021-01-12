# DecoderUtil
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* decodeB(String encodedWord, String charset)
	* [DecoderUtil](../ServiceProviders/DecoderUtil.md) has a role type of Service Provider
* decodeQ(String encodedWord, String charset)
	* [DecoderUtil](../ServiceProviders/DecoderUtil.md) has a role type of Service Provider
* decodeEncodedWords(String body, Message message)
	* [DecoderUtil](../ServiceProviders/DecoderUtil.md) has a role type of Service Provider
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
* decodePreviousAndAppendSuffix(StringBuilder sb, EncodedWord previousWord, String body,
            int previousEnd)
	* [DecoderUtil](../ServiceProviders/DecoderUtil.md) has a role type of Service Provider
* decodeEncodedWord(EncodedWord word)
	* [DecoderUtil](../ServiceProviders/DecoderUtil.md) has a role type of Service Provider
* extractEncodedWord(String body, int begin, int end, Message message)
	* [DecoderUtil](../ServiceProviders/DecoderUtil.md) has a role type of Service Provider
