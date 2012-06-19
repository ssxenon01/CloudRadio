
get "/", forward: "/WEB-INF/pages/index.gtpl"
get "/datetime", forward: "/datetime.groovy"
get "/test" , forward: "/test.groovy"
get "/favicon.ico", redirect: "/images/gaelyk-small-favicon.png"
