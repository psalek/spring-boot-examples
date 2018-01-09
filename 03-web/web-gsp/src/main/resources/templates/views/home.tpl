layout 'layouts/main.tpl',
        pageTitle: 'Code Snippet Manager',
        mainBody: contents {
        		
   div(class:'jumbotron'){
   	 h1('Code Snippet Manager')
       p(class:'lead','A new way to create and manage Code Snippets. Useful for any developer, but why wait? Get you account!')
       p{
         a(class: 'btn btn-lg btn-success', href: '#', role: 'button', 'Sign up today')
       }
       
       p("$today")
   }
        		
        		
   div(class: 'row marketing'){
     	 offers.each { offer ->
     		div(class: 'col-lg-6'){
     	 		h4(offer.header)
     	 	 	p(offer.description)
     	 	}
   	 	}
   }
}