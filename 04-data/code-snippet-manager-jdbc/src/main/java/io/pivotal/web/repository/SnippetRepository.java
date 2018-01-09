package io.pivotal.web.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import io.pivotal.web.domain.Snippet;
import io.pivotal.web.repository.mapper.SnippetRowMapper;

@Repository
public class SnippetRepository {

	private final String SQL_INSERT      = "insert into snippet(id,title,code,created,modified) values(?,?,?,?,?)";	
	private final String SQL_QUERY_ALL   = "select * from snippet";
	private final String SQL_QUERY_BY_ID = "select * from snippet where id=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Snippet save(Snippet snippet){
		assert snippet.getTitle() != null;
		assert snippet.getCode() != null;
						
		Snippet _snippet = new Snippet(snippet.getTitle(),snippet.getCode());
		
		this.jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(SQL_INSERT);
				ps.setString(1, _snippet.getId());
				ps.setString(2, _snippet.getTitle());
				ps.setString(3, _snippet.getCode());
				ps.setDate(4, new Date(_snippet.getCreated().getTime()));
				ps.setDate(5, new Date(_snippet.getModified().getTime()));
				return ps;
			}
		});
		
		return _snippet;
	}
	
	public List<Snippet> findAll(){
		return this.jdbcTemplate.query(SQL_QUERY_ALL, new SnippetRowMapper());
	}
	
	public Snippet findById(String id){
		return this.jdbcTemplate.queryForObject(SQL_QUERY_BY_ID,  new Object[]{id},new SnippetRowMapper());
	}
}
