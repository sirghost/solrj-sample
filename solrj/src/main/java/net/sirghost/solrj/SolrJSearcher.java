package net.sirghost.solrj;

import java.net.MalformedURLException;
import java.util.List;

import net.sirghost.solrj.pojo.Form;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.params.ModifiableSolrParams;

public class SolrJSearcher {

	public static void main(String[] args) throws MalformedURLException, SolrServerException {
		HttpSolrServer solr = new HttpSolrServer("http://localhost:8983/solr");
		ModifiableSolrParams params = new ModifiableSolrParams();
		params.set("q", "form_title:Form Num ~1");
		params.set("start", "0");
		QueryResponse response = solr.query(params);
		List<Form> docs = response.getBeans(Form.class);
		for (Form f : docs) {
			System.out.println(f.getTitle());
		}
	}
}