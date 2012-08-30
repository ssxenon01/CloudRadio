import mn.xenon.service.BaseService
import com.google.appengine.api.datastore.*
import mn.xenon.domain.News
import mn.xenon.domain.Music

def newsService = new BaseService()
request.list = newsService.list([limit:2])
def news = Music.get(30)
request.stream = news.stream 

forward '/WEB-INF/pages/main.gtpl'