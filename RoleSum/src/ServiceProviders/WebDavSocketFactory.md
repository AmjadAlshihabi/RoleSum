# WebDavSocketFactory
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* connectSocket(Socket sock, String host, int port,
            InetAddress localAddress, int localPort, HttpParams params)
	* [WebDavSocketFactory](../ServiceProviders/WebDavSocketFactory.md) has a role type of Service Provider
* createSocket(
            final Socket socket,
            final String host,
            final int port,
            final boolean autoClose
    )
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavSocketFactory](../ServiceProviders/WebDavSocketFactory.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [DefaultTrustedSocketFactory](../Structurers/DefaultTrustedSocketFactory.md) has a role type of Structurer
	* [TrustedSocketFactory](../ServiceProviders/TrustedSocketFactory.md) has a role type of Service Provider
* isSecure(Socket sock)
	* [WebDavSocketFactory](../ServiceProviders/WebDavSocketFactory.md) has a role type of Service Provider
* createSocket(
            final Socket socket,
            final String host,
            final int port,
            final boolean autoClose
    )
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavSocketFactory](../ServiceProviders/WebDavSocketFactory.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [DefaultTrustedSocketFactory](../Structurers/DefaultTrustedSocketFactory.md) has a role type of Structurer
	* [TrustedSocketFactory](../ServiceProviders/TrustedSocketFactory.md) has a role type of Service Provider
