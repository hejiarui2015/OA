package post.inf;

import java.util.List;

import post.pojo.TPostUser;

public interface PostUserInf {
	public void save(TPostUser transientInstance);
	public List findBypostuserid(int userid, int postid);
	public void saveorupdate(TPostUser transientInstance);
	public TPostUser findById(post.pojo.TPostUserId id) ;
	public void delete(TPostUser persistentInstance);
	public List findBypostid(int postid);
	public List findByusernisread(int userid, int nisread);
}
