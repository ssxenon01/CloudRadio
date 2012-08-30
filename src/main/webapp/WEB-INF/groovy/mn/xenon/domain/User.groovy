package mn.xenon.domain

import groovyx.gaelyk.datastore.Entity
import groovyx.gaelyk.datastore.Key
import groovyx.gaelyk.datastore.Unindexed
import groovyx.gaelyk.datastore.Ignore
 
@Entity(unindexed=false)
class User {
	@Key String username
	String firstName
	String lastName
	@Ignore String getFullName() { "$firstName $lastName" }
}