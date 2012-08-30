package mn.xenon.service

import groovyx.gaelyk.GaelykBindings 
import mn.xenon.domain.News  
import mn.xenon.domain.Comment 

@GaelykBindings
class BaseService {

	def numberOfComments(postId) { 
		datastore.execute {
			select count from Comment where parentId == postId
		}
	}
	def getComments(postId){
		datastore.execute{
			select all from Comment where parentId == postId
		}
	}
	def create(params){
		def newsInstance = new News()
		newsInstance.title = params.title
		newsInstance.content = params.content
		newsInstance.imageURL = params.image
		newsInstance.save()
		return newsInstance
	}
	def list(params){ 
		return datastore.execute {
			select all from 'News' sort desc by created limit params.limit?:10
		} as List<News>
	}
	def count(){
		return News.count()
	}
	def get(key){
		return datastore.get(key)
	}
	def difference(date) {
        def diff = new Date().getTime() - new Date(date);
        def result = '';
        switch (true) {
            case (diff < 60 * 1000) :
                result = 'few seconds ago';
                break;
            case (60 * 1000 < diff && diff < 60 * 60 * 1000) :
                result = Math.round(diff / (60 * 1000)) + ' minutes ago';
                break;
            case (60 * 60 * 1000 < diff && diff < 24 * 60 * 60 * 1000) :
                result = Math.round(diff / (60 * 60 * 1000)) + ' hours ago';
                break;
            case (24 * 60 * 60 * 1000 < diff && diff < 30 * 24 * 60 * 60 * 1000) :
                result = Math.round(diff / (24 * 60 * 60 * 1000)) + ' days ago';
                break;
            case (30 * 24 * 60 * 60 * 1000 < diff) :
                result = date
                break;
        }
        return result;
    }
}