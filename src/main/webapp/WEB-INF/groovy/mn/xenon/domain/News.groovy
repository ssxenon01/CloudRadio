package mn.xenon.domain

import groovyx.gaelyk.datastore.Entity
import groovyx.gaelyk.datastore.Key
import groovyx.gaelyk.datastore.Unindexed
import groovyx.gaelyk.datastore.Ignore
 
@Entity(unindexed=false)
class News {
	@Key Long id
	@Unindexed String content
	String title
	String imageURL
	Date created = new Date() 
}