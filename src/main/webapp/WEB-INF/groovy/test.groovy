import com.google.appengine.api.datastore.Entity

def entity = new Entity("music")
entity.title = "Guillaume Laforge"
entity.artist = "Gundee"
entity.album = "asd"
entity.url = 'http://media.soundcloud.com/stream/xP8bAtxGKygB?stream_token=G2f9m'
entity.save()

log.info "Setting attribute datetime"

request.setAttribute 'datetime', entity.url

log.info "Forwarding to the template"

forward '/WEB-INF/pages/test.gtpl'