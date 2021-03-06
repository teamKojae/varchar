package com.varchar.www.model.domain.board;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class BoardGroup {
	private int boardGroupNo;
	private String boardGroupName;
	private int boardGroupOrder;
	private List<Board> board;
}
