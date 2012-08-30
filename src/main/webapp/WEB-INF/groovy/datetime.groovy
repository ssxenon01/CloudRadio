import mn.xenon.domain.Music

def m = Music.get(30)
m.stream = 'http://soundcloud.com/nikolettslezak/emily-browning-sweet-dreams'
m.save()
log.info "Setting attribute datetime"

request.setAttribute 'datetime', new Date().toString()

log.info "Forwarding to the template"

forward '/WEB-INF/pages/datetime.gtpl'