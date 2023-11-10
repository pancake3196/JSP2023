																															package membership;

import common.DBConnPool;

public class MemberDAO extends DBConnPool {

	 public MemberDAO() {
		 super();
		 
		 
	 }
	 public MemberDTO getMemberDTO(String uid, String upass) {
		 MemberDTO dto = new MemberDTO();
		 String query = "select * from member where id = ? and pass = ?";
		 
		 try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, uid);
			psmt.setString(2, upass);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));
				dto.setRegidate(rs.getString("regidate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return dto;
	 }
	
}
