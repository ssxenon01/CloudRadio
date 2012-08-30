package mn.xenon.domain

import groovyx.gaelyk.datastore.Entity
import groovyx.gaelyk.datastore.Key
import groovyx.gaelyk.datastore.Unindexed
import groovyx.gaelyk.datastore.Ignore
import mn.xenon.domain.User
 
@Entity(unindexed=false)
class Music {
	@Key Long id
	String title
	String author 
	Date created = new Date()
	String genre
	String stream
	String imageUrl
}