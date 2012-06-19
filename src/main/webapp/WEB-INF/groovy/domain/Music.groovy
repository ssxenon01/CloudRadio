package domain

import groovyx.gaelyk.datastore.Entity
import groovyx.gaelyk.datastore.Key 
import groovyx.gaelyk.datastore.Unindexed
import groovyx.gaelyk.datastore.Ignore
 
@Entity(unindexed=false)
class Music { 
	String title
	String artist
	String album
	int year
	String comment

	@Ignore String getFullName() { "$title - $artist" }
}