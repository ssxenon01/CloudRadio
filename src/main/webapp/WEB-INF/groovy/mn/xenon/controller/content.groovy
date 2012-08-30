import mn.xenon.service.BaseService
import com.google.appengine.api.datastore.*
import mn.xenon.domain.News
import mn.xenon.domain.Music
 
def music = Music.get(30)
request.music = music 

forward '/WEB-INF/pages/content.gtpl'