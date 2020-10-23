package com.multicampus.biz.board;

import java.sql.Date;
import lombok.Data;

//VO Value Object = DTO Data transfer Object
/*@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
*/

@Data
public class BoardVO {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
	
}
