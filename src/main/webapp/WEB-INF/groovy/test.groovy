import com.google.appengine.api.datastore.*
import mn.xenon.domain.News
import mn.xenon.domain.Music
import com.soundcloud.api.ApiWrapper;
import com.soundcloud.api.Endpoints;
import com.soundcloud.api.Http;
import com.soundcloud.api.Env;
import com.soundcloud.api.Params;
import com.soundcloud.api.Request;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import java.io.File;
import java.io.IOException; 
import org.apache.commons.io.IOUtils
import org.apache.commons.fileupload.util.Streams
import org.apache.commons.fileupload.servlet.ServletFileUpload
 

def wrapper = new ApiWrapper('9852543170df60b358d27d2a547daa94', '550af08775150aeac9750c7086ac217e', null,null,Env.LIVE)
HttpResponse resp = wrapper.post(Request.to(Endpoints.TRACKS)
	.add(Params.Track.TITLE,     'sample title')
	.add(Params.Track.TAG_LIST, "demo upload")
	.withFile(Params.Track.ASSET_DATA, IOUtils.toByteArray(request.inputStream))
	// you can add more parameters here, e.g.
	// .withFile(Params.Track.ARTWORK_DATA, file)) /* to add artwork */

	// set a progress listener (optional)
	.setProgressListener(new Request.TransferProgressListener() {
	    @Override public void transferred(long amount) {
	        System.err.print(".");
	    }
	}));
	if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_CREATED) {
        log.info "\n201 Created "+resp.getFirstHeader("Location").getValue();

        // dump the representation of the new track
        log.info "\n" + Http.getJSON(resp).toString(4);
    } else {
        log.info "Invalid status received: " + resp.getStatusLine();
    }
log.info body 
/*uploads = [:]  // Store result from multipart content.
if (ServletFileUpload.isMultipartContent(request)) {
    def uploader = new ServletFileUpload()  // Cannot use diskbased fileupload in Google App Engine!
    def items = uploader.getItemIterator(request)
    while (items.hasNext()) {
        def item = items.next()
        def stream = item.openStream() 
        try {
            if (item.formField) {  // 'Normal' form field.
                params[item.fieldName] = Streams.asString(stream)
            } else {
                // Assign upload file contents to uploads map. 
                // The value is also a map with the keys name, contentType and data.
                uploads[item.fieldName] = [
                    name: item.name,
                    contentType: item.contentType,
                    data: IOUtils.toByteArray(stream)
                ]
            }
        } finally {
            IOUtils.closeQuietly stream
        }
    }
}else{
	log.info 'thats not multipart file'
}
uploads.each{ f -> 
	log.info f.key
}
handle()
*/
def handle() {
    // Build response HTML.
    html.html {
        head {
            title 'Result of Upload'
        }
        body {
            h1 'Result of Upload'
            h2 'Parameters'
            ul {
                params.each {
                    li "Received parameter '$it.key' with value '$it.value'"
                }
            }
            h2 'Uploads' 
        }
    }
}