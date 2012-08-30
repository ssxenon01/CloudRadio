import com.google.appengine.api.datastore.*
import mn.xenon.domain.News
import mn.xenon.service.BaseService

def newsService = new BaseService()

if(request.getParameter('id')){
	request.news = newsService.get(['News',params.id as Long] as Key)
	
	forward '/WEB-INF/pages/news/show.gtpl'
}else{
	request.list = newsService.list([limit:10]) 
	forward '/WEB-INF/pages/news/list.gtpl'
}

