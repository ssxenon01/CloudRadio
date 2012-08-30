package mn.xenon.domain

import groovyx.gaelyk.datastore.Entity
import groovyx.gaelyk.datastore.Key
import groovyx.gaelyk.datastore.Unindexed
import groovyx.gaelyk.datastore.Ignore
import mn.xenon.domain.User
 
@Entity(unindexed=false)
class Comment {
	@Key Long id
	String content
	Date created = new Date()
	Long parentId
	User user
}