# WebDavHandler
## This Structurer is responsible for:
### inheriting the following classes:
* DefaultHandler
### managing the relationships between the following objects as components:
* [DataSet](../Structurers/DataSet.md) 
### Maintaining relatiohships between objects through the following methods: 
* getDataSet()
* startDocument()
* endElement(String namespaceURI, String localName, String qName)
* characters(char ch[], int start, int length)
