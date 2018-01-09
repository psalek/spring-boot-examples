yieldUnescaped '<!DOCTYPE html>'

html {

    head {
        title(pageTitle)
        meta(name: 'viewport', content:'width=device-width, initial-scale=1')
        
        link(rel: 'stylesheet', href: 'webjars/bootstrap/3.3.6/css/bootstrap.min.css')
        link(rel: 'stylesheet', href: 'css/jumbo.css')
        
    }

    body {
    	    div(class:'container'){
    	
    	        div(class: 'header clearfix'){
        	        nav{
                    ul(class: 'nav nav-pills pull-right'){
            	             li(role: 'presentation', class: 'active') { a(href:'#', 'Home') }
            	             li(role: 'presentation') { a(href:'#', 'About') }
            	             li(role: 'presentation') { a(href:'#', 'Contact') }
            		    }
                }
                h3(class: 'text-muted', 'CodeSnippet')
            }

            mainBody()

        
            footer(class:'footer'){
                p('&copy; Pivotal 2016')
            }
        }
        
        script(src: 'webjars/jquery/2.2.4/jquery.min.js'){ }
        script(src: 'webjars/bootstrap/3.3.6/js/bootstrap.min.js'){ }
        script(src: 'webjars/angularjs/1.5.7/angular.min.js') { }

    }
}