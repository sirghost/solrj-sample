package net.sirghost.solrj;

import java.io.IOException;

import net.sirghost.solrj.pojo.Form;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;

public class SolrjPopulator {

	public static void main(String[] args) throws IOException, SolrServerException {
		HttpSolrServer server = new HttpSolrServer("http://localhost:8983/solr");
		Form form;
		for (int i = 0; i < 10; i++) {
			form = new Form(
					"url_"+i, 
					"Form Num "+i, 
					"Form Description "+i,
					0);
			server.addBean(form);
		}
		server.commit();
	}
}