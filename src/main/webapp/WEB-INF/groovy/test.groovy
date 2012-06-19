
log.info "Setting attribute datetime"

request.setAttribute 'datetime', new Date()

log.info "Forwarding to the template"

forward '/WEB-INF/pages/test.gtpl'