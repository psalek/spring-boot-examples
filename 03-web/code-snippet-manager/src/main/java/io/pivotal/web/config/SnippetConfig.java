package io.pivotal.web.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration
public class SnippetConfig extends WebMvcConfigurationSupport { //or: extends WebMvcConfigurerAdapter

	/*
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(createXmlHttpMessageConverter());
		converters.add(new MappingJackson2HttpMessageConverter());
		super.configureMessageConverters(converters);
	}

	private HttpMessageConverter<Object> createXmlHttpMessageConverter() {
		MarshallingHttpMessageConverter xmlConverter = new MarshallingHttpMessageConverter();

		XStreamMarshaller xstreamMarshaller = new XStreamMarshaller();
		xstreamMarshaller.setStreamDriver(new DomDriver("UTF-8") {
			public HierarchicalStreamWriter createWriter(Writer out) {
				return new PrettyPrintWriter(out) {
					boolean cdata = false;

					public void startNode(String name, @SuppressWarnings("rawtypes") Class clazz) {
						super.startNode(name, clazz);
						cdata = (name.equals("code"));
					}

					protected void writeText(QuickWriter writer, String text) {
						if (cdata) {
							writer.write("<![CDATA[");
							writer.write(text);
							writer.write("]]>");
						} else {
							writer.write(text);
						}
					}
				};
			}
		});
		
		Map<String, Class<?>> map = new HashMap<String, Class<?>>();
		map.put("snippet", Snippet.class);
		xstreamMarshaller.setAliases(map);

		xmlConverter.setMarshaller(xstreamMarshaller);
		xmlConverter.setUnmarshaller(xstreamMarshaller);

		return xmlConverter;
	}
	*/
}
