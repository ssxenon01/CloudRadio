package mn.xenon.controller

import com.google.appengine.api.users.User;
import com.google.appengine.api.oauth.OAuthRequestException;
import com.google.appengine.api.oauth.OAuthService;
import com.google.appengine.api.oauth.OAuthServiceFactory;
import com.google.appengine.api.oauth.OAuthServiceFailureException;

def user = null;
try {
    OAuthService oauth = OAuthServiceFactory.getOAuthService();
    user = oauth.getCurrentUser();

} catch (OAuthRequestException e) {
    // The consumer made an invalid OAuth request, used an access token that was
    // revoked, or did not provide OAuth information.
    // ...
}