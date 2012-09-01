all "/_ah/**", ignore: true
get "/", forward: "/mn/xenon/controller/index.groovy" , cache: 2.hours
get "/main", forward: "/mn/xenon/controller/index.groovy"
get "/news", forward: "/mn/xenon/controller/news/list.groovy"
get "/news/@asd", forward: "/mn/xenon/controller/news/list.groovy?id=@asd"
get "/content/@id", forward: "/mn/xenon/controller/content.groovy?id=@id"
get "/datetime", forward: "/datetime.groovy"
get "/test" , forward: "/test.groovy"
get "/test/*" , forward: "/test.groovy"
get "/favicon.ico", redirect: "/favicon.ico"
post "/upload" , forward: "/mn/xenon/controller/music/upload.groovy"
