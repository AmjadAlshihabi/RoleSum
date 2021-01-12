# KeyChainKeyManager
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* savePrivateKeyReference(PrivateKey privateKey)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* fetchCertificateChain(Context context, String alias)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* fetchPrivateKey(Context context, String alias)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* chooseClientAlias(String[] keyTypes, Principal[] issuers, Socket socket)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* chooseServerAlias(String keyType, Principal[] issuers, Socket socket)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* getClientAliases(String keyType, Principal[] issuers)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* getServerAliases(String keyType, Principal[] issuers)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* chooseEngineClientAlias(String[] keyTypes, Principal[] issuers, SSLEngine engine)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* chooseEngineServerAlias(String keyType, Principal[] issuers, SSLEngine engine)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* getCertificateChain(String alias)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* getCertificateChain(String alias)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* getPrivateKey(String alias)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* getPrivateKey(String alias)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* chooseAlias(String[] keyTypes, Principal[] issuers)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* chooseAlias(String[] keyTypes, Principal[] issuers)
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
